package HomeWork8;

        import org.junit.AfterClass;
        import org.junit.BeforeClass;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

        import java.util.concurrent.TimeUnit;

        import static junit.framework.TestCase.assertEquals;

public class sync {

    public static ChromeDriver driver;


    @BeforeClass
    public static void website() {

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://dgotlieb.github.io/Selenium/synchronization.html");
    }

    @Test
    public void Implicit() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("checkbox")).isDisplayed();
        driver.findElement(By.id("btn")).click();
        driver.findElement(By.id("message")).isDisplayed();


    }

    @Test
    public void sleep() throws InterruptedException {

        driver.findElement(By.id("hidden")).click();
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("div[style=' ']")).isDisplayed();

    }

    @Test

    public void ExplicitWait() {
        driver.findElement(By.id("rendered")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish2")));
        String output = driver.findElement(By.id("finish2")).getText();
        assertEquals(output, "This is a new element");


    }

    @AfterClass
    public static void endTest() {
        driver.quit();


    }

}

