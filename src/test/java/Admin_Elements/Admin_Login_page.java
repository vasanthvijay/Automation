package Admin_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Login_page {
	
	@FindBy(xpath = "//input[@id='emailAddress']")
	public static WebElement Email_text_box;

	@FindBy(xpath = "//input[@id='password']")
	public static WebElement password;
	
	@FindBy(xpath = "//button[@class='form__button ladda-button']")
	public static WebElement login_btn;

	
}
