package com.cyberark.conjur.springboot.service;

import org.springframework.core.env.EnumerablePropertySource;


public abstract class PropertyProcessorChain extends EnumerablePropertySource<Object> {

	private PropertyProcessorChain processorChain;


	public PropertyProcessorChain(String name) {
		super("propertyProcessorChain");
	}
	

	public void setNextChain(PropertyProcessorChain processChain) {
		this.processorChain = new DefaultPropertySourceChain("DefaultPropertyChain");

		CustomPropertySourceChain customPS = new CustomPropertySourceChain("CustomerPropertyChain");
		processorChain.setNextChain(customPS);
	}

	@Override
	public Object getProperty(String name) {
		return name;

	}

}
