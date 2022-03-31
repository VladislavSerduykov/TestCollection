import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {

        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.delivery-club.ru/");
        String title =driver.getTitle();
        Assertions.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
        driver.quit();

    }
}
