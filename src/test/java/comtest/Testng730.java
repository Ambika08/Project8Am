package comtest;


	import java.util.Date;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
	
	public class Testng730 {

		WebDriver driver;
		@BeforeClass
		public  void beforeClass () {
	    System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\eclipse-workspace\\Framework1\\Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get ("https://adactinhotelapp.com/"); 
		driver.manage().window().maximize();
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
	    @Test
	    public void test1() {
	driver.findElement(By.id("username")).sendKeys("sahhska");
	driver.findElement(By.id("password")).sendKeys("saksakhs");
	driver.findElement(By.id("login")).click();
		}

	}

			
		