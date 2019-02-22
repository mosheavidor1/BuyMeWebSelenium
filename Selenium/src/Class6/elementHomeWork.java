package Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class elementHomeWork<test> {
    private static WebDriver driver;
    private static Object webdriver;


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();



    String test;
            driver.get("https://www.google.com");

try{


               driver.findElement(By.id("gbw"));



           }catch (Exception e){
    System.out.println("Element not found");
           }

           }

        }




