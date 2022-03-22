package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDRopDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.hdfcbank.com/");
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[12]/div[1]/div/div/div[1]/div/div[3]/div/div/div/div/div[1]/div/div/div[3]/div/div/a/img")).click();
	    driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
	}

}
