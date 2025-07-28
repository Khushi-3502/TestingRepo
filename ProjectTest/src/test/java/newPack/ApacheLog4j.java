package newPack;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApacheLog4j {

    // ✅ Log4j2 Logger instance
    private static final Logger logger = LogManager.getLogger(ApacheLog4j.class);

    public static void main(String[] args) {

        // ✅ Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KHUSHI SHAH\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        logger.info("Opened Browser Instance");

        driver.manage().window().maximize();
        logger.info("Window Maximized");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        logger.info("Implicit wait applied");

        driver.get("https://www.facebook.com/");
        logger.info("Application launchedddddddddddddddddd");

        try {
            driver.findElement(By.id("email")).isDisplayed();  // ⚠️ Note: "emails" may be incorrect ID
            logger.info("Web Element found.");
        } catch (Exception e) {
            logger.error("Web Element not founddddddddddddddd", e);
        }
    }
}
