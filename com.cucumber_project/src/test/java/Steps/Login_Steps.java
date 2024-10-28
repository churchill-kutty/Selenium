package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Steps {
	WebDriver driver;
	
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

	@Then("login should be succesfull")
	public void loginShouldBeSuccesfull() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.quit();
	   
	}
	
//	Scenerio=2
	@Given("user should enter the password as {string}")
	public void user_should_enter_the_password_as(String password) {
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	   
	}
	@Given("user should enter the username as {string}")
	public void user_should_enter_the_username_as(String username) {
		driver.findElement(By.xpath("//a[text()='Log in']")).sendKeys(username);
		
	}
	
	

	@Then("login should  not be succesfull")
	public void login_should_not_be_succesfull() {
		driver.quit();
	  
	}
}
