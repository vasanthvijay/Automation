package Admin;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Elements.Home_page;
import Admin_Elements.Manage_Student_Page;
import Reusability.Action_Class;

public class Manage_Students extends Launch_Browser {

	@Test(priority = 0)
	 public static void Manage_students_Module() throws InterruptedException {
			
			PageFactory.initElements(driver, Home_page.class);
			Reusability.Waits.elementToBeClickable(driver, Home_page.manage_tab);
		    Action_Class.moveToTwoElement(driver, Home_page.manage_tab, Home_page.manage_students);
	}
	@Test(priority = 1)
	public static void Invite_Function() {   
		PageFactory.initElements(driver, Manage_Student_Page.class);
		Reusability.Waits.elementToBeClickable(driver, Manage_Student_Page.add_btn);
		Manage_Student_Page.add_btn.click();
		
	}
}
