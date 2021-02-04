package com.dollardays.testcases;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.CreateAnAccountPage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;
import com.dollardays.utilities.VideoRecorder_utlity;

public class CreateAnAccountTest extends BaseTest {
	
	
	
  @DDDataProvider(datafile = "testdata/Credentials.xlsx", sheetName = "Sheet1", runmode = "Yes", testcaseID = "TC3")
  @Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
  
	public void accountCreating(Hashtable<String, String> datatable) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		
		ExtentTestManager.getTest().log(Status.INFO,"Create an Account TestCase");
		Thread.sleep(1000);
	  
		CreateAnAccountPage createAcc =  new CreateAnAccountPage(driver);
	    createAcc.createAccount(datatable.get("First Name"),datatable.get("Last Name"),datatable.get("Email Address"),
			  				  datatable.get("Phone"),datatable.get("Password"),datatable.get("Confirm Password"));
	    
	    
	    VideoRecorder_utlity.stopRecord();//End point of video recording
	  
  }}	  
	 
	  
 

