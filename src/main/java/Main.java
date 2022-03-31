import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        var driver= new ChromeDriver();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://www.youtube.com/watch?v=gjz_shIWZe8");

        WebElement element = driver.findElement(By.xpath("//button[@class='ytp-mute-button ytp-button']"));

        Actions actionProvider = new Actions(driver);

        actionProvider.click(element).pause(2000).click(element).build().perform();
    }
}
