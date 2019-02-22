package HomeWork7;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GitHub {


    public WebDriver driver;

    @Test
    public void run() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\geckodriver.exe");

        driver = new FirefoxDriver();


        driver.navigate().to("https://github.com");


        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div/div/div/form/label/input[1]")).sendKeys("Selenium");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div/div/div/form/label/input[1]")).sendKeys(Keys.ENTER);
    }
}














