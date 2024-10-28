package Steps_Messho;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Meesho_AddCart_Product {
	public WebDriver driver;
	public Actions a;


	@Given("user should be navigate the product")
	public void userShouldBeNavigateTheProduct() {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.meesho.com/");

	}

	@Given("user Should be move to the Cursor in men link and click on casual shoe")
	public void userShouldBeMoveToTheCursorInMenLinkAndClickOnCasualShoe() throws InterruptedException {

		Thread.sleep(2000);
		WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
		Thread.sleep(2000);
		WebElement casualshoe = driver.findElement(By.xpath("//p[text()='Casual Shoes']"));
		a=new Actions(driver);
		a.moveToElement(men).click(casualshoe).perform();

	}



	@Given("user Should be Click on Adab trendy men Casul Shoes")
	public void userShouldBeClickOnAdabTrendyMenCasulShoes() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Aadab Trendy Men Casual Shoes']")).click();

	}

	@Given("user should be Select the Size number{int}")
	public void userShouldBeSelectTheSizeNumber(Integer int1) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='IND-7']")).click();

	}

	@Given("user should be Click on AddCart")
	public void userShouldBeClickOnAddCart() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();


	}

	@Then("AddCart Should be Succesfull")
	public void addcartShouldBeSuccesfull() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();


	}
}
