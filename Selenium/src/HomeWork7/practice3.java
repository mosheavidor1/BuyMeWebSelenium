package HomeWork7;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class practice3 {
    private static WebDriver driver;
    private static Object webdriver;



    @BeforeClass

    public static void main() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\geckodriver.exe");


        driver = new FirefoxDriver();
    }

    @Test

    public void run() {
        driver.get("https://www.seleniumhq.org/");

        WebElement search=driver.findElement(By.name("q"));
        System.out.println(search);


    }

}



