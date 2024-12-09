package InterviewSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {

		 WebDriver driver =new ChromeDriver();
          
		  driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		  driver.manage().window().maximize();
		
	WebElement redbox=	driver.findElement(By.xpath("//input[@value='red']"));
	//input[@value='red']
	   redbox.click();
	   
	   if(redbox.isSelected()) {
		   
		 
		   
		   System.out.println("Redbox is checked");
		   
		   
		   
	   }
	   else {
		   
		   System.out.println("Redbox is not checked");
		   
	   }
		
		

	}

}
