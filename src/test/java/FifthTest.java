import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FifthTest {

    @Test
    public void fifthTest() {
        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("");
    }
}
