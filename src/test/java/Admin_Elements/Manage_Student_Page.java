package Admin_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Manage_Student_Page {

	@FindBy(xpath = "//button[@class='add-btn add-button-class']")
	public static WebElement add_btn;
}
