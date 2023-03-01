//package com.cyberark.conjur.cloudTest;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import com.cyberark.conjur.springboot.core.env.ConjurConnectionManager;
//import com.cyberark.conjur.springboot.domain.ConjurProperties;
//import com.cyberark.conjur.springboot.processor.SpringBootConjurAutoConfiguration;
//
//@SuppressWarnings("serial")
//@ExtendWith(SpringExtension.class)
//@EnableConfigurationProperties(value = ConjurProperties.class)
//@SpringBootTest(classes = SpringBootConjurAutoConfiguration.class)
//@TestPropertySource(locations = "classpath:application-test.properties")
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true)
//public class ConjurCloudSecurityTest extends AuthenticationCredentialsNotFoundException{
//	
//	public ConjurCloudSecurityTest(String msg) {
//		super(msg);
//	
//	}
//
//	@Test
//	void checkForConnection() {
////	assertNotSame(null, ConjurConnectionManager.getInstance());
//		
//	assertFalse(ConjurConnectionManager.getInstance()!=ConjurConnectionManager.getInstance());
//
//	}
//	
//
//}
