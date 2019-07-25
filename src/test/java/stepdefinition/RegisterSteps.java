package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSteps {
	
	public static WebDriver driver;
	@Given("The user should be in orvis website")
	public void the_user_should_be_in_orvis_website() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\OrvisDev\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.orvis.com/");
		Thread.sleep(6000);
		WebElement popUp = driver.findElement(By.xpath("//a[@class='button-close close']"));
		popUp.click();
	}

	@When("The user should provide valid details")
	public void the_user_should_provide_valid_details() {
		WebElement lnkMyAccount = driver.findElement(By.xpath("//a[text()='My Account']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(lnkMyAccount).perform();
		WebElement btnRegister = driver.findElement(By.xpath("//a[text()='Register']"));
		btnRegister.click();
		WebElement btnSignUp = driver.findElement(By.xpath("//img[@alt='sign up']"));
		btnSignUp.click();
		WebElement txtEmail = driver.findElement(By.id("Text1"));
		txtEmail.sendKeys("rubysherly@gmail.com");
		WebElement txtFirstName = driver.findElement(By.id("FirstName"));
		txtFirstName.sendKeys("Ruby");
		WebElement txtLastName = driver.findElement(By.id("LastName"));
		txtLastName.sendKeys("Sherly");
		WebElement txtAddress1 = driver.findElement(By.id("Address1"));
		txtAddress1.sendKeys("Chennai");
		WebElement txtCity = driver.findElement(By.xpath("//input[@id='City']"));
		txtCity.sendKeys("Chennai");
		WebElement ddnState = driver.findElement(By.xpath("//select[@id='State']"));
		Select s = new Select(ddnState);
		s.selectByIndex(2);
		WebElement txtZip = driver.findElement(By.xpath("//input[@id='Zip']"));
		txtZip.sendKeys("0442451");
		WebElement txtPhoneno = driver.findElement(By.xpath("//input[@id='Phone']"));
		txtPhoneno.sendKeys("09952089652");
	}

	@Then("The user should click the Sign In button")
	public void the_user_should_click_the_Sign_In_button() {
		//WebElement btnSave = driver.findElement(By.xpath("//input[@id='save_changes']"));
				//btnSave.click();
	}
	

}
