package com.cyberark.conjur.springboot.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cyberark.conjur.sdk.ApiException;
import com.cyberark.conjur.sdk.endpoint.SecretsApi;
import com.cyberark.conjur.springboot.constant.ConjurConstant;
import com.cyberark.conjur.springboot.core.env.ConjurConfig;
import com.cyberark.conjur.springboot.core.env.ConjurConnectionManager;

import com.cyberark.conjur.springboot.domain.ConjurProperties;


public class CustomPropertySourceChain extends PropertyProcessorChain {

	private Logger logger = LoggerFactory.getLogger(CustomPropertySourceChain.class);

	private PropertyProcessorChain chain;

	
	private ConjurProperties conjurParam;

	private SecretsApi secretsApi;
	
	
	public CustomPropertySourceChain(String name) {
		super("customPropertySource");
		
		logger.info("Calling CustomPropertysource Chain");
	}

	@Override
	public void setNextChain(PropertyProcessorChain nextChain) {
		// TODO Auto-generated method stub
		this.chain = nextChain;

	}
	
  

	@Override
	public String[] getPropertyNames() {
		// TODO Auto-generated method stub
		return new String[0];
	}

	@Override
	public Object getProperty(String key) {
		
			
		Object result = null;
		String secretValue = null;
		 
		key = ConjurConfig.getInstance().mapProperty(key);
		ConjurConnectionManager.getInstance();
		if (null == secretsApi) {
			secretsApi = new SecretsApi();
		}
		
		try {
			logger.info("Key>>>"+key);
			logger.info("Account>>>"+ConjurConstant.CONJUR_ACCOUNT);
			secretValue = secretsApi.getSecret(ConjurConstant.CONJUR_ACCOUNT, ConjurConstant.CONJUR_KIND,
					 key);
			result = secretValue != null ? secretValue.getBytes() : null;

		} catch (ApiException ae) {
		}
	
		
		return result;
		
}
}
