package Amzon_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Amazon_Xpath_Webelement_Action extends Amazon_Driver_Class
{
	//All_Xpaths

	//SigninButton
	static By SignInButton=By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span");
	//UsernameTextFilled
	static By UsernameTextFilled=By.xpath("//input[@name='email']");
	//ContinueButton
	static By ContinueButton=By.xpath("//*[@id=\"continue\"]");
	//PasswordTextFilled
	static By PasswordTextFilled=By.xpath("//*[@id=\"ap_password\"]");
	//LoginButton
	static By LoginButton=By.xpath("//*[@id=\"signInSubmit\"]");
	//Logo
	static By Logo=By.xpath("//*[@id=\"nav-logo-sprites\"]");
	//SearchTextBox
	static By SearchTextBox=By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	//SearchButton
	static By SearchButton=By.xpath("//*[@id=\"nav-search-submit-button\"]");
	//AddaProduct
	static By AddProduct=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span");
	//AddToCart
	static By AddToCart=By.xpath("//*[@id=\"submit.add-to-cart\"]");
	//GoToCartFromCart
	static By GotToCart=By.xpath("//*[@id=\"sw-gtc\"]/span/a");
	//DeleteProduct
	static By DeleteProduct=By.xpath("//input[@value='Delete']");
	//AppleWatch
	static By AppleWatch=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span");
	//Addtocart
	static By AddToCartSam=By.xpath("//*[@id=\"add-to-cart-button\"]");

	
	
	
	
	
	









	//All_Webelements
	static WebElement WebElementSignInButton()
	{
		WebElement SignInButtonRef=d.findElement(SignInButton);
		return SignInButtonRef;

	}
	static WebElement WebelementUsernameTextFileed()
	{
		WebElement UsernameTextFilledRef=d.findElement(UsernameTextFilled);
		return UsernameTextFilledRef;

	}
	static WebElement WebelementContinue()
	{
		WebElement ContinueButtonRef=d.findElement(ContinueButton);
		return ContinueButtonRef;
		
	}
	static WebElement WebelementPasswordTextFilled()
	{
		WebElement PasswordTextFilledRef=d.findElement(PasswordTextFilled);
		return PasswordTextFilledRef;
		
	}
	static WebElement WebelementLoginButton()
	{
		WebElement LoginButtonRef=d.findElement(LoginButton);
		return LoginButtonRef;
		
	}
	static WebElement webelementLogo()
	{
		WebElement LogoRef=d.findElement(Logo);
		return LogoRef; 
	}
	static WebElement webelementSerachTextBox()
	{
		WebElement SearchTextBoxRef=d.findElement(SearchTextBox);
		return SearchTextBoxRef;
		
	}
	static WebElement webelementSearchButton()
	{
		WebElement SearchButtonRef=d.findElement(SearchButton);
		return SearchButtonRef;
	}
	static WebElement webelementAddProduct()
	{
		WebElement AddProductRef=d.findElement(AddProduct);
		return AddProductRef;
		
	}
	static WebElement webelementAddToCart()
	{
		WebElement AddToCartRef=d.findElement(AddToCart);
		return AddToCartRef;
	}
	static WebElement webelementGotToCart()
	{
		WebElement GotToCartRef=d.findElement(GotToCart);
		return GotToCartRef;
	}
	static WebElement webelementDeleteProduct()
	{
		WebElement DeleteProductRef=d.findElement(DeleteProduct);
		return DeleteProductRef;
	}
	static WebElement webelementAppleWatch()
	{
		WebElement AppleWatchRef=d.findElement(AppleWatch);
		return AppleWatchRef;
		
	}
	static WebElement webelementSamsung()
	{
		WebElement SamsungRef=d.findElement(AddToCartSam);
		return SamsungRef;
		
		
	}



	//All_Actions

	public static void ActionSignInButton(String s)
	{
		WebElementSignInButton().click();

	}
	public static void ActionUsernameTextFilled(String s)
	{
		WebelementUsernameTextFileed().sendKeys(s);

	}
	public static void ActionContinueButton(String s)
	{
		WebelementContinue().click();
		
	}
	public static void ActionPasswordTextFilled(String s)
	{
		WebelementPasswordTextFilled().sendKeys(s);
	}
	public  static void ActionLoginButton(String s)
	{
		WebelementLoginButton().click();
	}
	
	public static void ActionSearchTextBox(String s)
	{
		webelementSerachTextBox().sendKeys(s);
		
	}
	public static void ActionSearchButton()
	{
		webelementSearchButton().click();
	}
	public static void ActionAddProduct()
	{
		webelementAddProduct().click();
	}
	public static void ActionAddToCart()
	{
		webelementAddToCart().click();
	}
	public static void ActionGoToCart()
	{
		webelementGotToCart().click();
	}
	public static void ActionDeleteProduct()
	{
		webelementDeleteProduct().click();
	}
	public static void ActionAppleWatch()
	{
		webelementAppleWatch().click();
	}
	public static void ActionSamsung()
	{
		webelementSamsung().click();
	}
	
	
	

}
