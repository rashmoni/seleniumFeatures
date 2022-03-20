package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("https://frontend.nopcommerce.com/");
		
		
		
		//capture title of the page
		System.out.println("Title of the web page "+driver.getTitle());
		System.out.println("Current url of the web page "+driver.getCurrentUrl());
		System.out.println("Html of the current web page "+driver.getPageSource());
	}

}
