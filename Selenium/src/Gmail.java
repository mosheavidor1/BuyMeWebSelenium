import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Gmail<test> {
    private static final org.openqa.selenium.support.ui.ExpectedConditions ExpectedConditions = null;
    private static WebDriver driver;
    private static Object webdriver;


    @Test


    public void main() {

        System.setProperty("webdriver.firefox.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\geckodriver.exe");





            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            String url = "https://mail.google.com/mail/u/0/#inbox";
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
            email_phone.sendKeys("mosheavidorster");
            driver.findElement(By.id("identifierNext")).click();
            WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(password));
            password.sendKeys("5714208");
            driver.findElement(By.id("passwordNext")).click();
            driver.findElement(By.xpath("//*[@id=\":ka\"]/div/div")).click();



        driver.findElement(By.cssSelector(".Am.Al.editable.LW-avf")).sendKeys("This an email test");
        driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).click();
        driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).sendKeys("mosheavidorster@gmail.com");

        driver.findElement(By.className("aoT")).sendKeys("test");

        driver.findElement(By.xpath("//div[text()='Send']")).click();

        }
    }

