import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssParamTest {
    @Test
    public void thirdTest() {
        // Copy path to your driver.
        var path = " ";
        // Choose your driver version.
        var typeDriver = " ";
        System.setProperty(typeDriver,path);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://devby.io/");
        WebElement element = driver.findElement(By.xpath("//a[text()='Вход']"));
        var par = element.getCssValue("display");
        Assertions.assertTrue(par.equals("flex"));
    }
}
