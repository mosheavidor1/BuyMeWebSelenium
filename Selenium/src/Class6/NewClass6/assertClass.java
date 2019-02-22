package Class6.NewClass6;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class assertClass {
    private static WebDriver driver;


    @BeforeClass
    public static void main() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
    }


    @Test
    public void test1() {
        System.out.println(driver.getCurrentUrl());
        assertEquals("http://www.ynet.co.il", driver.getCurrentUrl());
        driver.navigate().to("http://www.google.com");
    }

    @Test
    public void test2() {
        System.out.println(driver.getTitle());
        assertEquals("http://www.google.com", driver.getTitle());
        driver.navigate().to("http://www.google.com");
    }

    @AfterClass
    public static void finish() {
        //  driver.quit();
    }
}



