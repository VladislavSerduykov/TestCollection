import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TestVK {
    @Test
    public void sendPictureToMyFriendInMessageVK() {
        System.setProperty("webdriver.chrome.driver","Path to your driver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://vk.com/");
        Actions action = new Actions(driver);
        WebElement login = driver.findElement(By.cssSelector("#index_email"));
        WebElement password = driver.findElement(By.cssSelector("#index_pass"));
        WebElement enter = driver.findElement(By.cssSelector("#index_login_button"));

        action.sendKeys(login,"Your login")
                .sendKeys(password, "Your password")
                .click(enter)
                .build()
                .perform();

        WebElement message = driver.findElement(By.xpath("//span[text()='Мессенджер']"));
        action.click(message)
                .build()
                .perform();

        action.click(driver.findElement(By.xpath("//span[text()='Name of your friend']")))
                .build()
                .perform();

        var photoButt = driver.findElement(By.xpath("//input[@aria-label='Прикрепить фото или видео']"));
        photoButt.sendKeys("Path to your file");
        var preview = driver.findElement(By.xpath("//img[@class='preview _preview']"));
        while (true) {
            if(preview.isDisplayed()){
                break;
            }
        }
        driver.findElement(By.xpath("//div[@class='im_editable im-chat-input--text _im_text']")).sendKeys(Keys.ENTER);
    }
}

