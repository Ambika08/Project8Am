package comtest;


import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.sample.Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Excelvalue extends Utility {

	
	

		WebDriver driver;
		
		@BeforeClass
		private void launch () {
	    Utility.getDriver();
	    Utility.launchUrl("https://demo.automationtesting.in/Register.html");	    
		}
		
	    @AfterClass
		private void afterClass() {
	    driver.quit();
	
	    }
		@BeforeMethod
		private void beforeMetod() {
        Date date =new Date();
	    System.out.println(date);
	    }
	   @AfterMethod
	    public void afterMethod() {
	    Date date =new Date();
	    System.out.println(date);
	    }

	 public void Execle(){
		
	}

}
