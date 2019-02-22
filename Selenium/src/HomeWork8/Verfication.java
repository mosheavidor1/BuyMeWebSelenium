
package HomeWork8;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verfication {

    private static WebDriver driver;

    @BeforeClass

    public static void beforeTest() {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://dgotlieb.github.io/WebCalculator");


    }

    @Test
    public void test1() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(driver.findElement(By.id("seven")).getSize());
        System.out.println(driver.findElement(By.id("six")).isDisplayed());


        driver.findElement(By.id("seven")).click();
        driver.findElement(By.id("multiply")).click();
        driver.findElement(By.id("seven")).click();
        driver.findElement(By.id("equal")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String solution = driver.findElement(By.id("screen")).getText();
        String expected = "49";
        Assert.assertEquals(expected, solution);
    }


    @Test

    public void test2() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(driver.findElement(By.id("two")).getSize().height);
        System.out.println(driver.findElement(By.id("six")).getSize().width);
        System.out.println(driver.findElement(By.id("nine")).getLocation().x);
        System.out.println(driver.findElement(By.id("nine")).getLocation().y);

        int result1 = driver.findElement(By.id("nine")).getLocation().x;
        int answer1=686;

        int result2 = driver.findElement(By.id("nine")).getLocation().y;
        int answer2 = 167;
        Assert.assertEquals(answer1, result1);
        Assert.assertEquals(answer2, result2);





    }





        @AfterClass
        public static void endTest() {
            driver.quit();
        }


    }


