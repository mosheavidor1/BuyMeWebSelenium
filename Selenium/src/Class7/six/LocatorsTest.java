import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsTest {
    private static WebDriver driver;

    @BeforeClass
    public static void g() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dgotl\\Desktop\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.com//");

        List<WebElement> elements = driver.findElements(By.id("source"));
        WebElement a = elements.get(3);

        System.out.println(elements.size());
    }


    @Test
    public void run2(){

        driver.findElement(By.id("source")).click();

        WebElement b = driver.findElement(By.id("source"));
        b.click();
        Assert.assertEquals(10,b.getSize().getHeight());


        driver.findElement(By.id("source")).sendKeys("abc");

        List<WebElement> elements = driver.findElements(By.id("source"));
        WebElement a = elements.get(0);
        a.click();

        System.out.println(elements.size());
    }
    @Test
    public void run(){
        driver.findElement(By.xpath("/html/body[@class='epu-dt displaying-homepage']/div[@class='frame']/div[@class='page tlid-homepage homepage translate-text']/div[@class='homepage-content-wrap']/div[@class='tlid-source-target main-header']/div[@class='source-target-row']/div[@class='tlid-input input']/div[@class='source-wrap']/div[@class='input-full-height-wrapper tlid-input-full-height-wrapper']/div[@class='source-input']/div[@id='input-wrap']/textarea[@id='source']"));
        driver.findElement(By.xpath("//textarea[@id='source']"));
    }
}
