package com.cyberark.conjur.springboot.processor;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cyberark.conjur.sdk.endpoint.SecretsApi;
import com.cyberark.conjur.springboot.core.env.ConjurPropertySource;
import com.cyberark.conjur.springboot.domain.ConjurProperties;


@Configuration
public class SpringBootConjurAutoConfiguration {
	
	private static Logger logger = LoggerFactory.getLogger(SpringBootConjurAutoConfiguration.class);
	
	@ConditionalOnMissingBean
	@Bean
	ConjurRetrieveSecretService conjurRetrieveSecretService() {
		logger.info("Creating ConjurRetrieveSecretService instance");
		return new ConjurRetrieveSecretService();
		
	}

	@ConditionalOnMissingBean
	@Bean
	ConjurValueClassProcessor conjurSecretValueClassProcessor() {
		
		return new ConjurValueClassProcessor();
	}

	
	
	@ConditionalOnMissingBean
	@Bean
	ConjurValuesClassProcessor conjurValuesClassProcessor() {
		return new ConjurValuesClassProcessor();
	}
	


	@ConditionalOnMissingBean
	@Bean
	SecretsApi secretsApi() {
		return new SecretsApi();
	}
	
	@ConditionalOnMissingBean
	@Bean
	ConjurProperties conjurAuthParam() {
		return new ConjurProperties();
	}
	
	//@ConditionalOnExpression(value="${conjur.cloud.enabled}")
	@ConditionalOnMissingBean(ConjurPropertySource.class)
	@Bean
	 ConjurValueProcessor conjurValueProcessor()
	{
		logger.info("Creating ConjurValueProcessor instance");
		return new ConjurValueProcessor();
	}

}
