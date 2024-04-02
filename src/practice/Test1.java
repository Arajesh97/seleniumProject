package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;

	@BeforeClass
	public void startup() {
		driver = new ChromeDriver();
	}

	@AfterClass
	public void tearDown() {
	driver.quit();
	}

	@Test
	public void tc001() throws Exception {
		driver.navigate().to("https://183.82.103.245.nareshit/login.php");
//		driver.navigate().to("https://amazon.in");
		System.out.println("Application opened");//console
		Reporter.log("Application Opened");// htmlReport
		driver.findElement(By.name("txtUserName")).sendKeys("mobile");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		Reporter.log("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("Logout completed");
	}

}
