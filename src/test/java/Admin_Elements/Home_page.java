package Admin_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_page {

	@FindBy(xpath = "//div[@id='fullHeightForSidemenu']/ul/li[2]/span")
	public static WebElement feeds;
	
	@FindBy(xpath = "//div[@id='fullHeightForSidemenu']/ul/li[3]/span")
	public static WebElement tests;
	
	@FindBy(xpath = "//i[@class='icon icon-angle-down']")
	public static WebElement report_type_dropdown;
	
	@FindBy(xpath = "//div[@id='fullHeightForSidemenu']/ul/p-tieredmenu[1]")
	public static WebElement manage_tab;
	
	@FindBy(xpath = "//p-tieredmenu[1]/div/p-tieredmenusub/ul/li/p-tieredmenusub/ul/li[1]")
	public static WebElement manage_students;
	
}