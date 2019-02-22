import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main<AftrClass> {
    private static WebDriver driver;

    @BeforeClass
    public static void main() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moshe\\Desktop\\קורס אוטומציה\\selenium\\chromedriver.exe");
        ChromeOptions options =new ChromeOptions();
        options.addArguments("-incognito");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.co.il");
        driver.manage().window().maximize();

    }

    @Test
    public void run() {
        driver.get("https://www.google.co.il/");
    }


    @Test
    public void run2() {
        System.out.println(driver.getCurrentUrl());
         //Assert.assertEquals("https://www.ebay.com",driver.getCurrentUrl());
        Assert.assertEquals("https://www.google.co.il",driver.getCurrentUrl());
    }

    @Test
    public void run3() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("https://www.google.co.il",driver.getTitle());
        driver.navigate().to("https://www.ebay.com");
    }


    //  @Test
    // public void run4() {
    // System.out.println(driver.getPageSource());


    //  }}


    @Test
    public void run5() {
        System.out.println(driver.getWindowHandle());

        driver.navigate().back();

    }
    @AfterClass

    public static void finish(){

        driver.quit();
    }
}

//for firefox download geco driver 64.
