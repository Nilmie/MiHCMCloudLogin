package Test;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
//import io.github.bonigarcia.wdm.WebDriverManager;

 

import org.testng.annotations.Test;

 

 

import MiHCM.HomePage;
import MiHCM.LoginPage;

 


    public class Login {

 

       public static WebDriver driver;

 

        LoginPage objLogin;

 

        HomePage objHomePage;

 

      

 

        /**

 

         * This test case will login in http://demo.guru99.com/V4/

 

         * Verify login page title as guru99 bank

 

         * Login to application

 

         * Verify the home page using Dashboard message

 

         */

 

        @Test(priority=0)

 

        public void test_Home_Page_Appear_Correct(){
         System.setProperty("webdriver.chrome.driver","C:\\seldrv\\chromedriver.exe");
                   
     //   WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa.mihcm.com");
        //Create Login Page object
        objLogin = new LoginPage(driver);

 

        //Verify login page title

 

      //  String loginPageTitle = objLogin.getLoginTitle();

 

       // Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

 

        //login to application

 

        objLogin.logintoHCM("nilmie.gamhewa@gmail.com", "Admin@1234");

 

        // go the next page

 

        objHomePage = new HomePage(driver);

 

        //Verify home page

 

        //Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
       driver.close();
        driver.quit();
        }
    }