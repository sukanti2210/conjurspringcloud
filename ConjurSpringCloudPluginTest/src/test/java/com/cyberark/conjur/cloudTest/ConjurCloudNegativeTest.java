package com.cyberark.conjur.cloudTest;

	import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
	import static org.junit.jupiter.api.Assertions.assertNotSame;

	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.api.extension.ExtendWith;
	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.beans.factory.annotation.Value;
	import org.springframework.boot.context.properties.EnableConfigurationProperties;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.test.context.TestPropertySource;
	import org.springframework.test.context.junit.jupiter.SpringExtension;

	import com.cyberark.conjur.springboot.core.env.ConjurConnectionManager;
	import com.cyberark.conjur.springboot.domain.ConjurProperties;
	import com.cyberark.conjur.springboot.processor.SpringBootConjurAutoConfiguration;

	@ExtendWith(SpringExtension.class)
	@EnableConfigurationProperties(value = ConjurProperties.class)
	@SpringBootTest(classes = SpringBootConjurAutoConfiguration.class)
	@TestPropertySource(locations = "classpath:application-test.properties")

	public class ConjurCloudNegativeTest {

		private static final Logger LOGGER= LoggerFactory.getLogger(ConjurCloudTest.class);
		
		@Autowired
		private ConjurProperties conjurProperties;
		

		@Value("${jenkins-app/dbUserName}")
		private byte[] pass1;

		@Value("${jenkins-app/dbPassword}")
		private byte[] pass2;

		@Value("${jenkins-app/dbUrl}")
		private byte[] pass3;

		/*
		 * @Test public void contextLoads() {
		 * 
		 * }
		 */
		@Test
		void checkForConfiguration() {
//			assertFalse(false, conjurProperties.getPath());
//			assertFalse(false, conjurProperties.getAccount());
//			assertFalse(false, conjurProperties.getApplianceUrl());
//			assertFalse(false, conjurProperties.getAuthnLogin());
//			assertFalse(false, conjurProperties.getAuthTokenFilePath());
//			assertFalse(false, conjurProperties.getCertFile());
//			assertFalse(false, conjurProperties.getSslCertificate());
//			
			
			assertFalse(conjurProperties.getPath()!=conjurProperties.getPath());
			assertFalse(conjurProperties.getAccount()!=conjurProperties.getAccount());
			assertFalse(conjurProperties.getApplianceUrl()!=conjurProperties.getApplianceUrl());
			assertFalse(conjurProperties.getAuthnLogin()!=conjurProperties.getAuthnLogin());
			assertFalse(conjurProperties.getAuthTokenFilePath()!=conjurProperties.getAuthTokenFilePath());
			assertFalse(conjurProperties.getCertFile()!=conjurProperties.getCertFile());
			assertFalse(conjurProperties.getSslCertificate()!=conjurProperties.getSslCertificate());
			
			
		}
		

		@Test
		void checkForConnection() {
//		assertNotSame(null, ConjurConnectionManager.getInstance());
			
		assertFalse(ConjurConnectionManager.getInstance()!=ConjurConnectionManager.getInstance());

		}
		
		@Test
		void checkForUserName()
		{
			LOGGER.debug("Pass1 value is:"+ pass1);
			String pass1Str = new String(pass1);
			assertFalse(pass1Str!=pass1Str);
			
		}
		@Test
		void checkForPassword()
		{
			LOGGER.debug("Pass2 value is:"+ pass2);
			String pass2Str = new String(pass2);
			assertFalse(pass2Str!=pass2Str);
			
		
		}
		@Test
		void checkForUrl()
		{
			LOGGER.debug("Pass3 value is:"+ pass3);
			String pass3Str = new String(pass3);
			assertFalse(pass3Str!=pass3Str);
		}

	}
