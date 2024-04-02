package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General extends Global {

	public void openApp() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
	}

	public void closeappliction() {
    driver.quit();
    System.out.println("Appliction closed");
	}

	public void login() {
driver.findElement(By.name(txt_LoginName)).sendKeys(un);
driver.findElement(By.name(txt_Password)).sendKeys(pw);
driver.findElement(By.name(login_Btn)).click();

	}

	public void logout() {

	}

}
