package comtest;

import org.openqa.selenium.WebElement;
import org.sample.Utility;

public class Testsample extends Utility {
public static void main(String[] args) {
getDriver();
launchUrl("http://adactinhotelapp.com/");
Loginpage loginpage = new Loginpage();
WebElement txtUsername = loginpage.getTxtUsername();
enterText(txtUsername,"karthi007");
WebElement password = loginpage.getPassword();
enterText(password, "Karthi@1987");
loginpage.getBtnLogin().click();
}
}

