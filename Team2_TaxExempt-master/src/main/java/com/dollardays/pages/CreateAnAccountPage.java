package com.dollardays.pages;

	import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.google.common.io.Files;

import org.hamcrest.core.StringContains;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import sun.net.ftp.FtpDirEntry.Type;

	public class CreateAnAccountPage {
	 
		WebDriver driver;
		String text1; String text2; String text3; String text4; String text5; String text6;
		
		
	    
	    public CreateAnAccountPage(WebDriver driver)
		  {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		  }

		@FindBy(className="dropdown-toggle") 
		private WebElement signInIcon;
			public void  signInDropDown() {
				
			}

		@FindBy(linkText = "Create account") 
		private WebElement account;
			public void createAccountutton() {
				
			}
			
		@FindBy(id="ctl00_cphContent_txtFName")
		private WebElement fname;
			public WebElement getfirstName() {
				return fname;
			}
			
		@FindBy(id= "ctl00_cphContent_txtLName") 
		private WebElement lname;
			public WebElement getlastName() {
				return lname;
			}
			
		@FindBy(id= "ctl00_cphContent_txtClientEmail")
		private WebElement email;
			public WebElement getemailAdd() {
				return email;
			}
		
		@FindBy(id= "ctl00_cphContent_txtPhoneMain") 
		private WebElement pNo;
			public WebElement getphoneNumber() {
				return pNo;
			}	
			
		@FindBy(id= "ctl00_cphContent_txtPassword") 
		private WebElement pWord;
			public WebElement getpassword() {
				return pWord;
			}
			
		@FindBy(id= "ctl00_cphContent_txtPasswordConfirm") 
		private WebElement confirmpword;
			public WebElement getconfirmPassword() {
				return confirmpword;
			}	
		
		@FindBy(id= "ctl00_cphContent_btnRegister") 
		private WebElement createAccount;
				public void createaccount() {
					
				}		

		@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div/div/div/div/div/div[1]") 
		private WebElement alertBox;
			public WebElement alertb() {
				System.out.println(alertBox.getText());
				return alertBox;
			}
			
			public  void actual() {
			String actual = driver.findElement(By.id("ctl00_cphContent_txtFName-error")).getText();
			   System.out.println("This Field is Required ----" +actual);
	           Assert.assertTrue(actual.contains("(Required"));		
			}
			
			public void actual1() {
				String actual=  driver.findElement(By.id("ctl00_cphContent_txtLName-error")).getText();
				 System.out.println("This Field is Required ----" +actual);
	 		     Assert.assertTrue(actual.contains("(Required"));
			}
			
			public void actual2() {
				String actual=  driver.findElement(By.id("ctl00_cphContent_txtClientEmail-error")).getText();
				 System.out.println("This Field is Required ----" +actual);
				 Assert.assertTrue(actual.contains("(Required"));
			}
			
			public void actual3() {
				String actual=  driver.findElement(By.id("ctl00_cphContent_txtPhoneMain-error")).getText();
			 	System.out.println("This Field is Required----- " +actual);
			 	Assert.assertTrue(actual.contains("(Required"));
			}
		
			public void actual4() {
				String actual=  driver.findElement(By.id("ctl00_cphContent_txtPassword-error")).getText();
				 System.out.println("This Field is Required----- " +actual);
				 Assert.assertTrue(actual.contains("(Required"));
			}
			
			public void actual5() {
				 String actual=  driver.findElement(By.id("ctl00_cphContent_txtPasswordConfirm-error")).getText();
				 System.out.println("This Field is Required ------" +actual);
				 Assert.assertTrue(actual.contains("(Required"));
			
			}
			
			public void actual6() {
				WebElement alertBox = driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[5]/div/div/div/div/div/div[1]"));
				String actual = alertBox.getText();
			
				System.out.println(actual);
				
			}
			
			
public void createAccount(String fName,String lName,String eMail, String phoneno,String pword,String confirmpW) throws InterruptedException, IOException 
		          {
				    signInIcon.click();
					account.click();
					getfirstName().sendKeys(fName);
					String text1 = fname.getAttribute("value");
					getlastName().sendKeys(lName);
					String text2 = lname.getAttribute("value");
					getemailAdd().sendKeys(eMail);
					String text3 = email.getAttribute("value");
					getphoneNumber().sendKeys(phoneno);
					String text4 =  pNo.getAttribute("value");
					getpassword().sendKeys(pword);
					String text5 = pWord.getAttribute("value");
					getconfirmPassword().sendKeys(confirmpW);
					String text6 = confirmpword.getAttribute("value");
					
					createAccount.click();
		
		CreateAnAccountPage objForError = new CreateAnAccountPage(driver);
		
							if(text1.isEmpty()) {
								 objForError.actual();
										   
							} if(text2.isEmpty()) {
									objForError.actual1();		
											 
							}  if(text3.isEmpty()) {
									objForError.actual2();	
											 
							}  if(text4.isEmpty()) {
									objForError.actual3();		
										 	
							}  if(text5.isEmpty()) {
									objForError.actual4();	 	
											 
							} if (text6.isEmpty()) { 
									objForError.actual5();	
											 	
							}
							
							
					String ATitle = driver.getTitle();
					String ETitle = "Your account has been created";
					if(ATitle == ETitle ) {
						System.out.println("Account has been created");
					}else{
						objForError.actual6();
}
							
}

	}				
		        		
			
		 
	
	
	
			
			
	
	
	
	
		
		
			
			
	

