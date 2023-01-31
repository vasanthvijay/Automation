package Admin_Elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Invite_Page {

	@FindBy(xpath = "//label[text()=\"Choose Campus\"]")
	public static WebElement Select_Campus;
	
	@FindBy(xpath = "//label[text()=\"Choose Batch\"]")
	public static WebElement Select_batch;
	
	@FindBy(xpath = "//label[text()=\"Choose Degree & Specialization\"]")
	public static WebElement Select_Degree_and_Spec;
	
	@FindBy(xpath = "//label[text()=\"Choose Department\"]")
	public static WebElement Select_Department;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter one student email ID per line']")
	public static WebElement Create_mail_id;
	
	@FindBy(xpath = "//span[@class='ui-button-text ui-clickable']")
	public static WebElement Invite_btn;
	
	@FindBy(xpath = "//p-dropdownitem/li")
	public static List<WebElement> Campus_list; 
	
	@FindBy(xpath = "//p-dropdownitem/li/span")
	public static List<WebElement> Batch_list;
	
	@FindBy(xpath = "//p-dropdownitem/li/span")
	public static List<WebElement> Degree_Spec_list;
	
	@FindBy(xpath = "//p-dropdownitem/li/span")
	public static List<WebElement> Department_list;
	
	
}
