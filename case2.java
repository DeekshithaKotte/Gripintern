package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class case2 {  
  
    public static void main(String[] args) {  
      
           // System Property for Chrome Driver   
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\kotte\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
    			         
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("https://www.thesparksfoundationsingapore.org");  
        System.out.println("Page title is : " + driver.getTitle());
        if(driver.getTitle().equals("The Sparks Foundation | Home"))
        	System.out.print("Title sucessfully verified");
          
        driver.close();
        
    }  
  
}