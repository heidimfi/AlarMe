# AlarMe
Here we will share information, files, ideas and have discussions about the project AlarMe

package Sprint1;

import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Blackboard {
	
	
	
	
	
	
	public void blackboard() throws InterruptedException {
		
		// blackBoard
		WebDriver driver= new SafariDriver();
		driver.get("h"
				+ "ttps://ntnu.blackboard.com/webapps/portal/execute/tabs/tabAction?tab_tab_group_id=_70_1");
		driver.findElement(By.className("loginPrimary")).click();
		Thread.sleep(5000);
	    //need to write in username and password to log in
		WebElement username= driver.findElement(By.name("feidename"));
		username.sendKeys(""); //her skal vi kalle en metode
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys(""); //her skal vi kalle en metode
        driver.findElement(By.className("submit")).click();
        Thread.sleep(5000);   
        driver.findElement(By.linkText("Varsler")).click();
        Thread.sleep(5000);
        
 
        Thread.sleep(50000);
       
        
        // select øvinger under fremtid
    	Select s= new Select(driver.findElement(By.className("headerText")));
        List<WebElement> e= s.getOptions();
        for ( WebElement w: e) {
        	System.out.println(w.getText());
        }
        	
    	}
    	
	
		
        	 

	public static void main(String[] args) throws InterruptedException {
		Blackboard b= new Blackboard();
		b.blackboard();
		
	}

}

