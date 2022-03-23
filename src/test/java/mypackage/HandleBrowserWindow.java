package mypackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    //getWindowHandles()
	    
	    String windowID=driver.getWindowHandle();//return id of the single browser window
	    
	    System.out.println(windowID);
	    
	    //getWindowHandles()
	    
	    driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/a")).click();
	    
	    Set<String> windowIDs= driver.getWindowHandles();//return IDs of the multiple browser windows
	    
	    //First method -iterator()
	    /*
	    Iterator<String> it = windowIDs.iterator();
	    
	    String parentWindowID=it.next();
	    String childWindowID=it.next();
	    
	    System.out.println("Parent window ID: "+parentWindowID);
	    System.out.println("Child window ID: "+childWindowID);
	    */
	    //Second method -Using List
	    
	    List<String>  windowIDsList=new ArrayList(windowIDs);//converting Set into List
	    
	    String parentWindowID= windowIDsList.get(0);//parent window id
	    String childWindowID= windowIDsList.get(1);//child window id
	    
	    System.out.println("Parent window ID: "+parentWindowID);
	    System.out.println("Child window ID: "+childWindowID);
	    
	    //How to use window IDs for switching
	    
	    driver.switchTo().window(parentWindowID);
	    System.out.println("Parent window title: "+driver.getTitle());
	    
	    driver.switchTo().window(childWindowID);
	    System.out.println("Child window title: "+driver.getTitle());
	    
	    
	    //For each loop
	    for(String winid:windowIDsList) {
	    	String title = driver.switchTo().window(winid).getTitle();
	    	System.out.println(title);
	    }
	    
       //driver.close();//close single browser window which is pointing to the driver
        //driver.quit();//close all the browser windows
       for(String winid:windowIDsList) {
    	   String title = driver.switchTo().window(winid).getTitle();
    	   
    	   if(title.equals("OrangeHRM")||title.equals("another title")) {
    		   
    		   driver.close();
    	   }
    	   
       }
       
	}

}
