package InterviewSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {

       WebDriver driver =new ChromeDriver();
       driver.get("https://omayo.blogspot.com/  ");
       driver.manage().window().maximize();
		WebElement radiobutton=driver.findElement(By.id("radio1"));
		radiobutton.click();
   
   
     boolean radiobutton1=radiobutton.isSelected();
     if(radiobutton1) {
    	 
    	 
    	 System.out.println("Radio button is selected");
     }
     else {
    	 System.out.println("Radio button is not selected");
    	 
     }
		
         
	}

}
