package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlesMultipleDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.orangehrm.com/contact-sales/");
	    
	    
	    WebElement noOfEmpsEle = driver.findElement(By.name("NoOfEmployees"));
	    WebElement noOfIndutry = driver.findElement(By.name("NoOfEmployees"));
	    

	}

}
