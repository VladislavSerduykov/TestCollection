import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class SecondTest {

    @Test
    public void secondTest() {

        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.delivery-club.ru/novorossijsk");

        WebElement button = driver.findElement(By.xpath("//span[@class = 'header__search-button__name']"));
        button.click();
        driver.findElement(By.xpath("//input[@placeholder='Ресторан, блюдо или товар']")).sendKeys("Трапезунд" + Keys.ENTER);
        button = driver.findElement(By.xpath("//button[@class='header-login-button']"));
        button.click();
    }
}
