package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.login.pages.LoginOR;


import Libraries.Utility;

public class TestExecution {
	@Test
	public void loginPass() throws InterruptedException, IOException {
	WebDriver driver=Utility.launchBrowser("firefox", "https://qa-refapp.openmrs.org/openmrs/login.htm");
	LoginOR wl=PageFactory.initElements(driver, LoginOR.class);
	wl.SuccessLogin("Admin","Admin123");
	wl.RegPatient();
	
}
}