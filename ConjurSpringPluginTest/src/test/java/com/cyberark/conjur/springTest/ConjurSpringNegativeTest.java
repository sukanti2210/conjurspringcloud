//package com.cyberark.conjur.springTest;
//	import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertNotSame;
//
//import java.io.IOException;
//	import java.io.InputStream;
//	import java.util.Properties;
//
//	import org.junit.jupiter.api.Test;
//	import org.slf4j.Logger;
//	import org.slf4j.LoggerFactory;
//	import org.springframework.beans.factory.annotation.Value;
//	import org.springframework.boot.test.context.SpringBootTest;
//
//	import com.cyberark.conjur.sdk.ApiException;
//	import com.cyberark.conjur.springboot.core.env.ConjurConnectionManager;
//
//	   @SpringBootTest(classes = ConjurSpringTests.class)
//	   public class ConjurSpringNegativeTest  {
//		   
//		   private static final Logger LOGGER= LoggerFactory.getLogger(ConjurSpringTests.class);
//
//		   @Value("${jenkins-app/dbUserName}")
//			private byte[] pass1;
//		   
//		   @Value("${jenkins-app/dbPassword}")
//			private byte[] pass2;
//
//			@Value("${jenkins-app/dbUrl}")
//			private byte[] pass3;	   
//
//		
//	 @Test 
//	 void testForAllEnvVariables() {
////	  assertNotNull(System.getenv().getOrDefault("CONJUR_AUTHN_LOGIN", null));
////	  assertNotNull(System.getenv().getOrDefault("CONJUR_AUTHN_API_KEY", null));
////	  assertNotNull(System.getenv().getOrDefault("CONJUR_ACCOUNT", null));
////	  assertNotNull(System.getenv().getOrDefault("CONJUR_CERT_FILE", null));
////	  assertNotNull(System.getenv().getOrDefault("CONJUR_SSL_CERTIFICATE",null));
////	  assertNotNull(System.getenv().getOrDefault("CONJUR_AUTHN_TOKEN_FILE", null));
//	  
//      assertFalse(System.getenv("CONJUR_ACCOUNT")!=System.getenv("CONJUR_ACCOUNT"));
//      assertFalse(System.getenv("CONJUR_AUTHN_LOGIN")!=System.getenv("CONJUR_AUTHN_LOGIN"));
//      assertFalse(System.getenv("CONJUR_AUTHN_API_KEY")!=System.getenv("CONJUR_AUTHN_API_KEY"));
//      assertFalse(System.getenv("CONJUR_CERT_FILE")!=System.getenv("CONJUR_CERT_FILE"));
//      assertFalse(System.getenv("CONJUR_AUTHN_TOKEN_FILE")!=System.getenv("CONJUR_AUTHN_TOKEN_FILE"));
//      assertFalse(System.getenv("CONJUR_SSL_CERTIFICATE")!=System.getenv("CONJUR_SSL_CERTIFICATE"));
//      assertFalse(System.getenv("CONJUR_AUTHN_TOKEN_FILE")!=System.getenv("CONJUR_AUTHN_TOKEN_FILE"));
//	  
//	  
//	  
//	 }
//	 
//	 @Test 
//	 void testForConnection() {
////	 assertNotNull(ConjurConnectionManager.getInstance());
//		assertFalse(ConjurConnectionManager.getInstance()!=ConjurConnectionManager.getInstance()); 
//		 
//	  
//	  }
//	 
//	  
//	 @Test
//		void checkForUserName()
//		{
//			LOGGER.debug("Pass1 value is:"+ pass1);
//			String pass1Str = new String(pass1);
//			assertFalse(pass1Str!=pass1Str);
//			LOGGER.debug(pass1Str);
//			
//		}
//		@Test
//		void checkForPassword()
//		{
//			LOGGER.debug("Pass2 value is:"+ pass2);
//			String pass2Str = new String(pass2);
//			assertFalse(pass2Str!=pass2Str);
//			LOGGER.debug(pass2Str);
//			
//		
//		}
//		@Test
//		void checkForUrl()
//		{
//			LOGGER.debug("Pass3 value is:"+ pass3);
//			String pass3Str = new String(pass3);
//			assertFalse(pass3Str!=pass3Str);
//			LOGGER.debug(pass3Str);
//		}
//
//	}
//
