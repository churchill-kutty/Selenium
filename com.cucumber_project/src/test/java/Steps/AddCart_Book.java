package Steps;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCart_Book {
	WebDriver driver;
	Actions a;
	
	@Given("user should navigate to demoweshop application")
	public void userShouldNavigateToDemoweshopApplication() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	}

	@Given("user should click on login link")
	public void userShouldClickOnLoginLink() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
	    
	}

	@Given("user should enter the username as javaseleniumA{int}@gmail.com")
	public void userShouldEnterTheUsernameAsJavaseleniumAGmailCom(Integer int1) {
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("javaseleniumA4@gmail.Com");
	    
	}

	@Given("user should enter the password as {int}")
	public void userShouldEnterThePasswordAs(Integer int1) {
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
	    
	   
	}

	@When("user click on login button")
	public void userClickOnLoginButton() {
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();;
	    
	   
	}
	@Given("user should click on book link")
	public void userShouldClickOnBookLink() {
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		
	   
	}

	@Given("user should click on Computing and Internet book")
	public void userShouldClickOnComputingAndInternetBook() {
	   driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[1]")).click();
	}

	@Given
	("user should click on Fiction book")
	public void userShouldClickOnFictionBook() {
		driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[2]")).click();
	  
	}

	@Then("Add cart Book succesfull")
	public void addCartBookSuccesfull() {
		
		WebElement ShoppingCart =driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		a= new Actions(driver);
		a.moveToElement(ShoppingCart).perform();
	   
	}

	
}
