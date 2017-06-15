package com.lrcf.yhb.wechat.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WxMpConfig {

	@Value("${wx_token}")
	private String token;

	@Value("${wx_appid}")
	private String appid;

	@Value("${wx_appsecret}")
	private String appsecret;

	@Value("${wx_aeskey}")
	private String aesKey;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getAppsecret() {
		return appsecret;
	}

	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}

	public String getAesKey() {
		return aesKey;
	}

	public void setAesKey(String aesKey) {
		this.aesKey = aesKey;
	}
	
	
}
