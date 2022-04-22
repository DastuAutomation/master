package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeLogInPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System Property for Chrome Driver   
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\HI\\Desktop\\DriverPath\\chromedriver.exe");  
	      
	       // Instantiate a ChromeDriver class.       
	    WebDriver driver = new ChromeDriver(); 
	    driver.navigate().to("http://www.javatpoint.com/");  
        
        //Maximize the browser  
         driver.manage().window().maximize();  
       //Scroll down the webpage by 5000 pixels  
         JavascriptExecutor js = (JavascriptExecutor)driver;  
         js.executeScript("scrollBy(0, 5000)");   
           
         driver.quit();
         
	}

}
