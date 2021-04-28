package comtest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.Utility;

public class Loginpage extends Utility {

	public Loginpage() {
		PageFactory.initElements (driver,this);
	}
	@FindBy(id="username")
	private WebElement txtUsername;
	@FindBy(name="password")
	private WebElement Password;	
	@FindBy(xpath="//input[@id='login']")
	private WebElement  btnLogin;
	public WebElement getTxtUsername() {
		return txtUsername;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
}
	
