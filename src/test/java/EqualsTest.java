import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class EqualsTest {
    @Test
    public void firstTest() {
        // Choose your driver version.
        var typeDriver = " ";
        // Copy path to your driver.
        var path = " ";
        System.setProperty(typeDriver,path);

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.delivery-club.ru/");

        String title =driver.getTitle();
        Assertions.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
        driver.quit();

    }
}
