package newPack;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Specify the location of the config properties file.
		
		File src1 = new File("C:\\Users\\KHUSHI SHAH\\git\\TestingRepo\\ProjectTest\\src\\test\\resources\\config.properties");
		
		FileInputStream fis1 = new FileInputStream(src1);
		
		//create Properties class object to read properties file
		
		Properties pro1 = new Properties();
		
		pro1.load(fis1);
		
		//Locators properties
        File src2 = new File("C:\\Users\\KHUSHI SHAH\\git\\TestingRepo\\ProjectTest\\src\\test\\resources\\locators.properties");
		
		FileInputStream fis2 = new FileInputStream(src2);
		
		//create Properties class object to read properties file
		
		Properties pro2 = new Properties();
		
		pro2.load(fis2);
		
        File src3 = new File("C:\\Users\\KHUSHI SHAH\\git\\TestingRepo\\ProjectTest\\src\\test\\resources\\testdata.properties");
		
		FileInputStream fis3 = new FileInputStream(src3);
		
		//create Properties class object to read properties file
		
		Properties pro3 = new Properties();
		
		pro3.load(fis3);
		
		//now setting up the properties for all 
		
		System.setProperty(pro1.getProperty("driverProperty"),pro1.getProperty("driverPath"));
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(pro1.getProperty("URL_1"));
		
		//getProperty() method will accept key and return value of that key
		
		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
		
		driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
		



	}

}
