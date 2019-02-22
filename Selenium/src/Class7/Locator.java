package Class7;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locator {

    private static WebDriver driver;

    @BeforeClass

    public static void main() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(("https://translate.google.com//"));

        List<WebElement>elements=driver.findElements(By.id("source"));
        WebElement a = elements.get(0);
        Assert.assertEquals(110,a.getSize().getHeight());
        a.click();
        a.sendKeys("hello");
        System.out.println(elements.size());
    }

    @Test
    public void run() {

      //  driver.findElement(By.xpath ("//textarea[@autocomplete='off']"));
       // driver.findElement(By.xpath ("/html/body[@class='epu-dt rtl-display-lang displaying-homepage']/div[@class='frame']/div[@class='page tlid-homepage homepage translate-text']/div[@class='homepage-content-wrap']/div[@class='tlid-source-target main-header']/div[@class='source-target-row']/div[@class='tlid-input input']/div[@class='source-wrap']/div[@class='input-full-height-wrapper tlid-input-full-height-wrapper']/div[@class='source-input']/div[@id='input-wrap']/textarea[@id='source']"));
        driver.findElement(By.xpath ("//textarea[@id='source']"));

    }


}



