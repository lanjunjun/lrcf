package com.lrcf.yhb.service.wechat.builder;


import com.lrcf.yhb.service.wechat.impl.WeixinServiceImpl;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutImageMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;

public class ImageBuilder extends AbstractBuilder {

	  @Override
	  public WxMpXmlOutMessage build(String content, WxMpXmlMessage wxMessage,
									 WeixinServiceImpl service) {

	    WxMpXmlOutImageMessage m = WxMpXmlOutMessage.IMAGE().mediaId(content)
	        .fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser())
	        .build();

	    return m;
	  }

	}