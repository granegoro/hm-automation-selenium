import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


class SubmitFormTest {
    WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void test() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

        driver.get("http://localhost:9999/");
        System.out.println();
        //driver.findElement().sendKeys("Петр Петров");
        //driver.findElement().sendKeys("+79999999999");
        //driver.findElement().click();
        //driver.findElement().click();

       // String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
       // String actual = driver.findElement().getText();
       // Assertions.assertEquals(expected, actual);



    }


}
