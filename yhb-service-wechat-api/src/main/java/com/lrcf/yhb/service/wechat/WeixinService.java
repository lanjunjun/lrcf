package com.lrcf.yhb.service.wechat;

import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;

/**
 * Created by Administrator on 2017/6/14.
 */
public interface WeixinService {

    public WxMpXmlOutMessage route(WxMpXmlMessage message) ;

    public boolean hasKefuOnline();
}
