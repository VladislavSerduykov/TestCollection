import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdTest {
    @Test
    public void thirdTest() {
        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://devby.io/");
        WebElement element = driver.findElement(By.xpath("//a[text()='Вход']"));
        var par = element.getCssValue("display");
        Assertions.assertTrue(par.equals("flex"));
    }
}
