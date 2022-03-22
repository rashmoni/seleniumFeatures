package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementvsFindElements {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/register");
	    
	    //findElement --> returns single web element
	    
	    //1
	    /*
	    WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
	    searchbox.sendKeys("xyz");
	    //2
	    WebElement ele = driver.findElement(By.xpath("//div[@class = 'footer-upper']//a"));
	    System.out.println(ele.getText());
	    //3
	    
	    */
	    //findELement --> returns multiple web elements
	    List<WebElement> links = driver.findElements(By.xpath("//div[@class = 'footer-upper']//a"));
	    System.out.println("Number of element captured " +links.size());
	    
	    for(WebElement ele:links) {
	    	
	    	System.out.println(ele.getText());
	    }
	    	
	    
		
		
	    }

}
