package com.lrcf.yhb.wechat.controller;

import com.lrcf.yhb.wechat.service.WeixinService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/6/14.
 */
@Controller
@RequestMapping("/wechat/portal")
public class WxMpPortalController {

    @Autowired
    private WeixinService wxService;

    /**
     * 验证服务器地址的有效性
     * @param signature
     * @param timestamp
     * @param nonce
     * @param echostr
     * @return
     * @throws IOException
     */
    //@ResponseBody
    @RequestMapping(produces = "text/plain;charset=utf-8", method = RequestMethod.GET)
    public void authGet(@RequestParam(value = "signature", required = false) String signature,
                        @RequestParam(value = "timestamp", required = false) String timestamp,
                        @RequestParam(value = "nonce", required = false) String nonce,
                        @RequestParam(value = "echostr", required = false) String echostr,HttpServletResponse response) throws IOException {

        response.setContentType("text/plain;charset=UTF-8");
        if(StringUtils.isAnyBlank(signature,timestamp,nonce,echostr)){
            throw new IllegalArgumentException("请求参数非法，请核实!");
        }
        if(this.getWxService().checkSignature(timestamp,nonce,signature)){
            response.getWriter().print(echostr);
        }else{
            response.getWriter().print("非法请求");
        }
        //return "非法请求";


    }

    /**
     * 微信回调消息给客户端
     * @param requestBody
     * @param signature
     * @param encType
     * @param msgSignature
     * @param timestamp
     * @param nonce
     * @return
     */
    @ResponseBody
    @RequestMapping(produces = "application/xml; charset=UTF-8",method = RequestMethod.POST)
    public String post(@RequestBody String requestBody, @RequestParam("signature") String signature,
                       @RequestParam(value = "encrypt_type", required = false) String encType,
                       @RequestParam(value = "msg_signature", required = false) String msgSignature,
                       @RequestParam("timestamp") String timestamp, @RequestParam("nonce") String nonce) {

        if (!this.wxService.checkSignature(timestamp, nonce, signature)) {
            throw new IllegalArgumentException("非法请求，可能属于伪造的请求！");
        }

        String out = null;
        if (encType == null) {
            // 明文传输的消息
            WxMpXmlMessage inMessage = WxMpXmlMessage.fromXml(requestBody);
            WxMpXmlOutMessage outMessage = this.getWxService().route(inMessage);
            if (outMessage == null) {
                return "";
            }

            out = outMessage.toXml();
        } else if ("aes".equals(encType)) {
            // aes加密的消息
            WxMpXmlMessage inMessage = WxMpXmlMessage.fromEncryptedXml(requestBody,
                    this.getWxService().getWxMpConfigStorage(), timestamp, nonce, msgSignature);
            WxMpXmlOutMessage outMessage = this.getWxService().route(inMessage);
            if (outMessage == null) {
                return "";
            }

            out = outMessage.toEncryptedXml(this.getWxService().getWxMpConfigStorage());
        }

        return out;
    }

    protected WeixinService getWxService() {
        return this.wxService;
    }

}
