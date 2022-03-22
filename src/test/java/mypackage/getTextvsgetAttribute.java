package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextvsgetAttribute {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://admin-demo.nopcommerce.com/");
	    
	    WebElement emailinputbox = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
	    //emailinputbox.clear();
	    //emailinputbox.sendKeys("rashu983@gmail.com");
	    
	    //capturing text from inputbox
	    System.out.println("Result from getAttribute() method "+emailinputbox.getAttribute("value"));

	    System.out.println("Result from getText() method "+emailinputbox.getText());
	    
	    //login button
	    WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
	    System.out.println(button.getAttribute("type"));
	    System.out.println(button.getAttribute("class"));
	    
	    System.out.println(button.getText());
	    
	    String title = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[1]/h1")).getText();
	    System.out.println(title);
	    
		
	}

}
