package StepDefinationFive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinationFiveD {

	WebDriver driver;

	@Given("^user launch Chrome browser & user opens URL \"([^\"]*)\"$")
	public void user_launch_Chrome_browser_user_opens_URL(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ashique\\eclipse\\java-2021-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
	}

	@Then("^double click on Signin$")
	public void double_click_on_Signin() throws Throwable {
		Actions act = new Actions(driver);
		WebElement signin = driver.findElement(By.xpath("//span[contains(text(), 'Hello, Sign in')]"));
		act.moveToElement(signin).doubleClick().click().perform();
	}

	@Then("^user enters Email on Sign-In box and click on continue$")
	public void user_enters_Email_on_Sign_In_box_and_click_on_continue() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("ashiqur.rahman2701@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
	}

	@Then("^user enters Password on password box and click Sign-In button$")
	public void user_enters_Password_on_password_box_and_click_Sign_In_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("Ashique@127");
		Thread.sleep(1000);
	}

	@Then("^user should successfully Signin$")
	public void user_should_successfully_Signin() throws Throwable {
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(1000);

	}

	@Then("^browser close and quit$")
	public void browser_close_and_quit() throws Throwable {
		driver.close();
		driver.quit();

	}

}
