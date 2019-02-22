package Class6.NewClass6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class elementFireFox {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");



        try{


            driver.findElement(By.id("gbw"));



        }catch (Exception e){
            System.out.println("Element not found");
        }

    }

}




