package com.login.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

// @author srinidhi


public class LoginOR {

	WebDriver driver;
	
	public LoginOR(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@id='username']") WebElement username;
	@FindBy(how=How.ID,using="password") WebElement password;
	@FindBy(how=How.XPATH,using="//li[contains(text(),'Pharmacy')]") WebElement lstPharm;
	@FindBy(how=How.ID,using="loginButton") WebElement btnLogin;
	@FindBy(how=How.LINK_TEXT,using="Logout") WebElement lnkLogout;
	@FindBy(how=How.LINK_TEXT,using="Register a patient") WebElement lnkRAP;
	@FindBy(how=How.XPATH,using="//*[@id=\"content\"]/h2") WebElement lblRAP;
	@FindBy(how=How.XPATH,using="//input[@name='givenName']") WebElement txtGiveName;
	@FindBy(how=How.XPATH,using="//input[@name='familyName']") WebElement txtFamName;
	@FindBy(how=How.XPATH,using="//button[@id='next-button']") WebElement btnNxt;
	@FindBy(how=How.XPATH,using="//select[@id='gender-field']") WebElement optGender;
	@FindBy(how=How.XPATH,using="//input[@name='birthdateDay']") WebElement txtBday;
	@FindBy(how=How.XPATH,using="//select[@name='birthdateMonth']") WebElement ddMonth;
	@FindBy(how=How.XPATH,using="//input[@name='birthdateYear']") WebElement txtbYear;
	@FindBy(how=How.XPATH,using="//input[@name='address1']") WebElement txtadd1;
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']") WebElement txtPhone;
	@FindBy(how=How.XPATH,using="//select[@name='relationship_type']") WebElement ddRelationTyp;
	@FindBy(how=How.XPATH,using="//input[@placeholder='Person Name']") WebElement txtRelation;
	@FindBy(how=How.XPATH,using="//input[@id='submit']") WebElement btnubmit;
	//@FindBy(how=How.XPATH,using="//*[@id='content']/div[9]/div[2]/div/ul/li[1]") WebElement lnkStartVisit;
	@FindBy(how=How.LINK_TEXT,using="Start Visit") WebElement lnkStartVisit;
	@FindBy(how=How.XPATH,using="//*[@id='start-visit-with-visittype-confirm']") WebElement btnconfirmvisit;
	@FindBy(how=How.XPATH,using="//*[@id='attachments.attachments.visitActions.default']") WebElement lnkattach;
	@FindBy(how=How.XPATH,using="//*[@id='visit-documents-dropzone']/div[2]") WebElement attachdoc;
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Enter a caption']") WebElement txtArea;
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Upload file')]") WebElement btnConfirmUpload;
	@FindBy(how=How.XPATH,using="//*[@id='content']/div[1]/div[1]/div/div[1]/h1/span[1]/span") WebElement redirectPatient;
	@FindBy(how=How.LINK_TEXT,using="End Visit") WebElement lnkEndVisit;
	@FindBy(how=How.XPATH,using="//*[@id='end-visit-dialog']/div[2]/button[1]") WebElement popEndvisit;
	@FindBy(how=How.LINK_TEXT,using="Delete Patient") WebElement lnkDelete;
	@FindBy(how=How.XPATH,using="//input[@id='delete-reason']") WebElement txtReason;
	@FindBy(how=How.XPATH,using="//*[@id='delete-patient-creation-dialog']/div[2]/button[1]") WebElement btnconfirmdelete;
	@FindBy(how=How.XPATH,using="//*[@id='patient-search']") WebElement txtSrchPatient;
	@FindBy(how=How.XPATH,using="//*[@id='patient-search-results-table']/tbody/tr/td") WebElement result;
	
	
	
	public void SuccessLogin(String uid, String pwd) throws InterruptedException
	{
		username.sendKeys(uid);
		password.sendKeys(pwd);
		lstPharm.click();
		btnLogin.click();
		Thread.sleep(5000);
		WebElement Hmepge= lnkLogout;
		boolean status= Hmepge.isDisplayed();
		if(status)
		{
			System.out.println("Login Successful");
		}
		else 
		{
			System.out.println("Login Failed");
		}
	
}
	public void RegPatient() throws InterruptedException
	
	{
		lnkRAP.click();
		Thread.sleep(3000);
		lblRAP.isDisplayed();
		txtGiveName.sendKeys("Pooja");
		txtFamName.sendKeys("Hari");
		btnNxt.click();
		Select gender=new Select(optGender);
		gender.selectByVisibleText("Female");
		btnNxt.click();
		txtBday.sendKeys("29");
		Select bdMonth=new Select(ddMonth);
		bdMonth.selectByVisibleText("May");
		txtbYear.sendKeys("1994");
		btnNxt.click();
		txtadd1.sendKeys("Chennai");
		btnNxt.click();
		txtPhone.sendKeys("9640609823");
		btnNxt.click();
		Select ddRelType=new Select(ddRelationTyp);
		ddRelType.selectByVisibleText("Sibling");
		txtRelation.sendKeys("Srinidhi");
		btnNxt.click();
		btnubmit.click();		
		Thread.sleep(10000);
		lnkStartVisit.click();
		btnconfirmvisit.click();
		lnkattach.click();
		//attachdoc.sendKeys("/home/srinidhi/Pictures/Understanding-Creative-Work-Culture.jpg");
		//txtArea.sendKeys("Attached");
		//btnConfirmUpload.click();
		redirectPatient.click();
		lnkEndVisit.click();
		Thread.sleep(3000);
		popEndvisit.click();
		Thread.sleep(3000);
		lnkDelete.click();
		txtReason.sendKeys("Testing completed");
		btnconfirmdelete.click();
		txtSrchPatient.sendKeys("Srinidhi");
		result.isDisplayed();
		Thread.sleep(3000);
			
		
		
	}
	
}
