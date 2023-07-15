package Amzon_Automation;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Amazon_Test_Case extends Amazon_Driver_Class
{
	@BeforeMethod
	public void Openbrowser()
	{
		Amazon_Driver_Class.Driver();
	}

	@AfterMethod
	public void Closebrowser()
	{
		//d.quit();
	}



	//BecauseOFCaptch I cant Able to login so skkiped the login but all steps are correct.
	/*@Test
	public static void Test_Case_01_ClickOnSignbutoon() throws Exception
	 * 
	{

		SoftAssert signin=new SoftAssert();
		System.out.println("Test_Case_01");
	    Amazon_Xpath_Webelement_Action.ActionSignInButton("");
	    Amazon_Xpath_Webelement_Action.ActionUsernameTextFilled("maheshkhandale009@gmail.com");
	    Amazon_Xpath_Webelement_Action.ActionContinueButton("");
	    Amazon_Xpath_Webelement_Action.ActionPasswordTextFilled("Ztoh@009");
	    Amazon_Xpath_Webelement_Action.ActionLoginButton("");
        //WebElement logo=d.findElement(By.xpath("//i[@role='img']"));

	}*/

	@Test
	public static void Amazon_Login()
	{
		System.out.println("Login_Test_Case");
		SoftAssert Soft=new SoftAssert();
		WebElement logo=d.findElement(By.xpath("//a[@id='nav-logo-sprites']"));

	}

	@Test
	public static void Search_An_Item() 
	{
		System.out.println("Search_An_Item");

		Amazon_Xpath_Webelement_Action.ActionSearchTextBox("oneplus 11");
		Amazon_Xpath_Webelement_Action.ActionSearchButton();
		
	}
	
	@Test
	public static void Disply_All_Product_On_First_Page()
	{
		System.out.println("Disply_All_Product_On_First_Page");

		System.out.println("******************All Product***********************");

		List<WebElement> allProduct = d.findElements(By.xpath("//h2[@class='a-color-base headline truncate-2line']"));
		for (WebElement webElement : allProduct) 
		{
			System.out.println(webElement.getText());
		}
		
	}
	
	@Test
	public static void AddProduct()
	{
		System.out.println("AddProduct_Test_Case");

		Amazon_Xpath_Webelement_Action.ActionSearchTextBox("oneplus 11");
		Amazon_Xpath_Webelement_Action.ActionSearchButton();
		Amazon_Xpath_Webelement_Action.ActionAddProduct();
		Amazon_Xpath_Webelement_Action.ActionAddToCart();
		Amazon_Xpath_Webelement_Action.ActionGoToCart();
		Amazon_Xpath_Webelement_Action.ActionDeleteProduct();
		Amazon_Xpath_Webelement_Action.ActionSearchTextBox("oneplus 10 pro");
		Amazon_Xpath_Webelement_Action.ActionSearchButton();
		Amazon_Xpath_Webelement_Action.ActionAppleWatch();
		Amazon_Xpath_Webelement_Action.ActionSamsung();
		Amazon_Xpath_Webelement_Action.ActionGoToCart();
	}
	
	@Test
	public static void DeleteProduct()
	{
		System.out.println("DeleteProduct-Test_case");

	
		
		Amazon_Xpath_Webelement_Action.ActionSearchTextBox("oneplus 11");
		Amazon_Xpath_Webelement_Action.ActionSearchButton();
		Amazon_Xpath_Webelement_Action.ActionAddProduct();
		Amazon_Xpath_Webelement_Action.ActionAddToCart();
		Amazon_Xpath_Webelement_Action.ActionGoToCart();
		Amazon_Xpath_Webelement_Action.ActionDeleteProduct();
		
	}
	
	
	




}
