package com.cyberark.conjur.springboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultPropertySourceChain extends PropertyProcessorChain {

	private Logger logger = LoggerFactory.getLogger(DefaultPropertySourceChain.class);

	private PropertyProcessorChain chain;


	public DefaultPropertySourceChain(String name) {

		super("defaultPropertySource");
		logger.info("Calling Defaultropertysource Chain");

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
	public Object getProperty(String name) {
		// TODO Auto-generated method stub

		Object value = null;

		if (value == null) {
			value =  this.chain.getProperty(name);

		}

		return value;
	}

}
