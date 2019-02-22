package HomeWork7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private static final String locator = "123";   // will affect only this page .

    public static void clickLogin(WebDriver driver) {
        driver.findElement(By.id("123")).click();

    }

        public static void EnterUserName (WebDriver drive){
        drive.findElement(By.id("5656")).sendKeys("Hello");

    }
}
