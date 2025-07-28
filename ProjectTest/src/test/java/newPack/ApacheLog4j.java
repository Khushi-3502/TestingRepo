package newPack;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApacheLog4j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a logger instance
	
		Logger logger = Logger.getLogger("ApacheLog4j");
		
		//Configure log4j.properties file
		
		PropertyConfigurator.configure("C:\\Users\\KHUSHI SHAH\\git\\TestingRepo\\ProjectTest\\src\\test\\resources\\log4j.properties");
		
		//open browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KHUSHI SHAH\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		logger.info("Opened Browser Instance");
		
		driver.manage().window().maximize();
		
		logger.info("window Maximized");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		logger.info("Implicit wait given");
		
		//lauch app
		
		driver.get("https://www.facebook.com/");
		
		logger.info("Application launched");
		
		//check if the web element is displayed or not
		
		try {
		
		    driver.findElement(By.id("emails")).isDisplayed();
		    logger.info("Web Element found.");
		}catch(Exception e)
		{
			logger.info("Web Element not found");
		}

	}

}
