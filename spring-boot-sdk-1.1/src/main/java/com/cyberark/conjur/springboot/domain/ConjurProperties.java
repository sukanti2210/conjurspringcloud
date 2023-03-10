package com.cyberark.conjur.springboot.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "conjur")
public class ConjurProperties{
	
	private String account;
	private String applianceUrl;
	private String authTokenFilePath;
	
	//private String authApiKey;
	private String authnLogin;
	private String certFile;
	private String sslCertificate;
	
	@Value("${spring.config.location}")
	private String path;
	
	public ConjurProperties()
	{
		System.out.println("Inside ConjurAuthParam>>>");
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getApplianceUrl() {
		return applianceUrl;
	}

	public void setApplianceUrl(String applianceUrl) {
		this.applianceUrl = applianceUrl;
	}

	
	public String getAuthTokenFilePath() {
		return authTokenFilePath;
	}

	public void setAuthTokenFilePath(String authToken) {
		this.authTokenFilePath = authToken;
	}

	public String getAuthnLogin() {
		return authnLogin;
	}

	public void setAuthnLogin(String authnLogin) {
		this.authnLogin = authnLogin;
	}

	public String getCertFile() {
		return certFile;
	}

	public void setCertFile(String certFile) {
		this.certFile = certFile;
	}

	public String getSslCertificate() {
		return sslCertificate;
	}

	public void setSslCertificate(String sslCertificate) {
		this.sslCertificate = sslCertificate;
	}

	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return "ConjurAuthParam [account=" + account + ", applianceUrl=" + applianceUrl + ", authTokenFilePath=" + authTokenFilePath
				+ ", authnLogin=" + authnLogin + ", certFile=" + certFile + ", sslCertificate=" + sslCertificate
				+ ", path=" + path + "]";
	}

	


}
