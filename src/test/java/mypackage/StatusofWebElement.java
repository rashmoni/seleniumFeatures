package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusofWebElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed() isEnabled()
		
     WebElement searchStore = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
     System.out.println("Display status: "+searchStore.isDisplayed());//true
     System.out.println("Display status: "+searchStore.isEnabled());//true
     
     //isSelected() is used for radiobuttons,checkboxes,dropdown
     
     WebElement male = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
     WebElement female = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
     
     System.out.println(male.isSelected());//False
     System.out.println(female.isSelected());//False
     
     male.click();//select male radiobutton
     
     System.out.println(male.isSelected());//True
     System.out.println(female.isSelected());//False
     
     female.click();//select female radiobutton
     
     System.out.println(male.isSelected());//False
     System.out.println(female.isSelected());//True
     
     
     
     
     
     
	}

}
