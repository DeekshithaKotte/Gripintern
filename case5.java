package Testing;

import org.openqa.selenium.By;    
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

public class case5 {  
  
    public static void main(String[] args) {  
      
           // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kotte\\Downloads\\chromedriver_win32\\ChromeDriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("\r\n"
        		+ "https://www.thesparksfoundationsingapore.org/");
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          try {
          Thread.sleep(3000);
          }catch(Exception e) {
        	  e.printStackTrace();
          }
          
         // Click on the Search button  
        driver.findElement(By.linkText("Contact Us")).click();     
  
    }  
  
}
