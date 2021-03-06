package MiHCM;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class LoginPage {

	 WebDriver driver;

	 

	    By hcmuser = By.id("Username");
	    By hcmpassword = By.id("Password");
	    By titleText =By.className("mi-login-caption");
	    By login = By.id("btnSignin");

	    public LoginPage(WebDriver driver){

	        this.driver = driver;

	    }

	 

	    //Set user name in textbox

	 

	    public void setUserName(String strUserName){

	 

	        driver.findElement(hcmuser).sendKeys(strUserName);
 

	    }


	    //Set password in password textbox
 

	    public void setPassword(String strPassword){

	         driver.findElement(hcmpassword).sendKeys(strPassword);

	 
	    }

	 

	    //Click on login button

	 

	    public void clickLogin(){

	 

	            driver.findElement(login).click();

	 

	    }
	    
	  

	 

	    //Get the title of Login Page

	 

	    public String getLoginTitle(){

	 

	     return    driver.findElement(titleText).getText();

	 

	    }

	 

	    /**

	 

	     * This POM method will be exposed in test case to login in the application

	 

	     * @param strUserName

	 

	     * @param strPasword

	 

	     * @return

	 

	     */

	 

	    public void logintoHCM(String strUserName,String strPasword){

	 

	        //Fill user name

	 

	        this.setUserName(strUserName);

	 

	        //Fill password

	 

	        this.setPassword(strPasword);

	 

	        //Click Login button

	 

	        this.clickLogin();        
	    }
	    
	   
	}