package mypackage;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownSorted {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.twoplugs.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
	    WebElement drpElement = driver.findElement(By.name("category_id"));
	    Select drpselect = new Select(drpElement);
	    
	    List<WebElement> options = drpselect.getOptions();
	    
	    
	    ArrayList originallist = new ArrayList();
	    ArrayList templist = new ArrayList();
	    
	    for(WebElement option:options) {
	    	originallist.add(option.getText());
	    	templist.add(option.getText());
	    }
	    System.out.println("Original list: "+originallist);
	    System.out.println("Temp list: "+templist);
	    
	    Collections.sort(templist);
	    
	    System.out.println("Original list : "+originallist);
	    System.out.println("Temp list after sorting: "+templist);
	    
	    if(originallist.equals(templist)) {
	    	System.out.println("Dropdown sorted...");
	    }
	    else {
	    	System.out.println("Dropdown unsorted");
	    }
	    
	    
	}

}
