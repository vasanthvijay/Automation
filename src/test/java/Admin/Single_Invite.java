package Admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Reusability.*;
import Admin_Elements.Invite_Page;

public class Single_Invite extends Launch_Browser{
	public static List<String> campusdatas1=new ArrayList<String>();
	
	@Test(priority = 0)
    public static void ReadDatacampusdata() throws Exception {
		System.out.println("hello");
		
		Reusability.Read_Excel_Data.ReadDatacampusdata("../ai.neopat/File/login_Details.xlsx");
	}
	
	
	public static void Student_Single_Invite(String campusdata1, String campusdata2, String campusdata3, String campusdata4) throws Exception {
		
		System.out.println("log");
		PageFactory.initElements(driver, Invite_Page.class);
		
		Invite_Page.Select_Campus.click();
		Reusability.Dropdown_Selection.Dropdown_selection(Invite_Page.Campus_list,campusdata1);
		
		Invite_Page.Select_batch.click();
		Reusability.Dropdown_Selection.Dropdown_selection(Invite_Page.Batch_list,campusdata2);
		
		try {
			Invite_Page.Select_Degree_and_Spec.click();
		Reusability.Dropdown_Selection.Dropdown_selection(Invite_Page.Degree_Spec_list,campusdata3);
		}catch(Exception e) {
			Reusability.Dropdown_Selection.Dropdown_selection(Invite_Page.Degree_Spec_list,campusdata3);
		}
		
		try {
			Invite_Page.Select_Department.click();
			Reusability.Dropdown_Selection.Dropdown_selection(Invite_Page.Department_list,campusdata4);
		}catch(Exception e) {
			Reusability.Dropdown_Selection.Dropdown_selection(Invite_Page.Department_list,campusdata4);
		}
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
 
		
		Reusability.JS_Executor.ClickElement(driver, Invite_Page.Create_mail_id);
		String val=Reusability.single_mail_id_generator.generate_name();
		System.out.println("New mail ID:" +val);
		Invite_Page.Create_mail_id.sendKeys(val);
	    Thread.sleep(2000);
		
		
		Reusability.JS_Executor.ClickElement(driver, Invite_Page.Invite_btn);
		Thread.sleep(5000);
	}

	
	

	
}
