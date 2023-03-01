
 package com.cyberark.conjur.springTest;




import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.cyberark.conjur.sdk.ApiException;
import com.cyberark.conjur.springboot.core.env.ConjurConnectionManager;

   @SpringBootTest(classes = ConjurSpringTests.class)
    public class ConjurSpringTests {
	   
	   private static final Logger LOGGER= LoggerFactory.getLogger(ConjurSpringTests.class);


	   @Value("${jenkins-app/dbUserName}")
		private byte[] pass1;
	   
	   @Value("${jenkins-app/dbPassword}")
		private byte[] pass2;

		@Value("${jenkins-app/dbUrl}")
		private byte[] pass3;	   

		
	
// @Test 
// void testForAllEnvVariables() {
////  assertNotNull(System.getenv().getOrDefault("CONJUR_AUTHN_LOGIN", null));
////  assertNotNull(System.getenv().getOrDefault("CONJUR_AUTHN_API_KEY", null));
//  assertNotNull(System.getenv().getOrDefault("CONJUR_ACCOUNT", null));
////  assertNotNull(System.getenv().getOrDefault("CONJUR_CERT_FILE", null));
////  assertNotNull(System.getenv().getOrDefault("CONJUR_SSL_CERTIFICATE",null)); 
////  assertNotNull(System.getenv().getOrDefault("CONJUR_AUTHN_API_KEY", null)); 
////  assertNotNull(System.getenv().getOrDefault("CONJUR_AUTHN_TOKEN_FILE", null));
// }
 
// @Test
//	void checkForConnection() {
//		assertNotNull(ConjurConnectionManager.getInstance());
//
//	}

 
  
  @Test void testForUserName() throws ApiException {
   assertNotNull(pass1); 
   LOGGER.debug("Pass1 value is: "+ pass1);
   String pass1Str = new String(pass1);
   assertNotNull("Maggiee2210", pass1Str);
   LOGGER.debug("Pass1 value is: "+ pass1Str);
 }
  
  @Test void testForPassword() throws ApiException {
	  assertNotNull(pass2); 
	  LOGGER.debug("Pass2 value is: "+ pass2);
	  String pass2Str = new String(pass2);
	  assertNotNull("secret", pass2Str);
	  LOGGER.debug("Pass2 value is: "+ pass2Str);
	 }
  
  @Test void testForUrl() throws ApiException {
	  assertNotNull(pass3); 
	  LOGGER.debug("Pass3 value is: "+ pass3);
	  String pass3Str = new String(pass3);
	  assertNotNull("https://www.logo.com", pass3Str);
	  LOGGER.debug("Pass3 value is: "+ pass3Str);
	 }
}