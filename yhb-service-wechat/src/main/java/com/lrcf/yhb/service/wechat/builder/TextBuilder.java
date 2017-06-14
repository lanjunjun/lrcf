package com.lrcf.yhb.service.wechat.builder;


import com.lrcf.yhb.service.wechat.impl.WeixinServiceImpl;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutTextMessage;

public class TextBuilder extends AbstractBuilder {

	  @Override
	  public WxMpXmlOutMessage build(String content, WxMpXmlMessage wxMessage,
									 WeixinServiceImpl service)   {
	    WxMpXmlOutTextMessage m = WxMpXmlOutMessage.TEXT().content(content)
	        .fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser())
	        .build();
	    return m;
	  }

	}