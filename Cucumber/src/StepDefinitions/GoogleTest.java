package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleTest {
	public static String Cdriver="webdriver.chrome.driver";
	public static String Path="D:\\QA\\Selenium Automation\\1st Class\\chromedriver_win32\\chromedriver.exe";
	public static String ural="https://www.google.com/";
	static WebDriver Chromedri;
	
	@Given("^I Write Someting \"([^\"]*)\"$")
	public void i_Write_Someting(String A1) throws Throwable {
		System.setProperty(Cdriver, Path);
		Chromedri= new ChromeDriver();
		Chromedri.get(ural);
		Chromedri.manage().window().maximize();
		WebElement TextBox =Chromedri.findElement(By.xpath("//input[@title='Search']"));
	    TextBox.sendKeys(A1);
	    TextBox.click();
	    System.out.println("Google Chrome is opening and navigate to Google");
	     
	}

	@When("^Click google Search Button$")
	public void click_google_Search_Button() throws Throwable {
		 WebElement box=Chromedri.findElement(By.xpath("//input[@value='Google Search']"));
	     box.click();
	     System.out.println("Click the Bahamas");
	}

	@Then("^I Find Something$")
	public void i_Find_Something() throws Throwable {
		WebElement TextBox =Chromedri.findElement(By.xpath("//*[@id=\"rhs_block\"]/div/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div/div/div/div[1]/span"));
		TextBox.click();
		String  title=TextBox.getText();
		System.out.println(title);
		
	}
   
}



