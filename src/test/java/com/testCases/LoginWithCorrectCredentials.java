package com.testCases;

import com.configuration.BaseTest;
import com.utilities.UserDetailsConfig;

import org.testng.annotations.Test;

import static com.utilities.TestDataConstants.*;

public class LoginWithCorrectCredentials extends BaseTest {

	@Test
	public void LoginInWithCorrectCredential()  {
		ObLogIn().enterUsername(USERNAME)
				.enterPassword(PASSWORD)
				.clickOnLoginInButton();

		if(ObLogIn().getPageURL().contains(HOME_PAGE_URL)) {
			infoLog(test,"User Logged-In Successfully");
		}
		else {
			errorLog(test,"User is not logged In Successfully");
		}
	}
}


