package com.lrcf.yhb.service.wechat.builder;

import com.lrcf.yhb.service.wechat.WeixinService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;

public abstract class AbstractBuilder {
	  protected final Logger logger = LoggerFactory.getLogger(getClass());

	  public abstract WxMpXmlOutMessage build(String content,
											  WxMpXmlMessage wxMessage, WeixinService service) ;
	}
