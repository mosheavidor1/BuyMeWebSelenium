package Class6;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.*;
public class Main {
    private static WebDriver driver;

    @BeforeClass
    public static void main() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dgotl\\Desktop\\WebDrivers\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
    }

    @Test
    public void run(){
        driver.get("https://www.google.co.il/");
    }

    @Test
    public void run2(){
        System.out.println(driver.getCurrentUrl());
        assertEquals("http://www.ebay.com",driver.getCurrentUrl());
    }

    @Test
    public void run3(){
        System.out.println(driver.getTitle());
        assertEquals("walla",driver.getTitle());
        driver.navigate().to("http://www.ebay.com");
    }

    @Test
    public void run4(){
        System.out.println(driver.getPageSource());
    }

    @Test
    public void run5(){
        System.out.println(driver.getWindowHandle());
        driver.navigate().back();

    }

    @AfterClass
    public static void finish(){
        driver.quit();
    }
}
