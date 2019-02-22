package HomeWork8;

import com.paulhammant.ngwebdriver.ByAngular;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.TestCase.assertEquals;

public class angularBonus {







        public static ChromeDriver driver;
        //public static NgWebDriver ngWebDriver;


        @BeforeClass
        public static void website() {

            System.setProperty("Webdriver.chrome.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\chromedriver.exe");
            driver = new ChromeDriver();
            //ngWebDriver = new NgWebDriver(driver);

            driver.manage().window().maximize();

        }


        @Test
        public void angular() {


            driver.get("https://dgotlieb.github.io/AngularJS/main.html");
            //ngWebDriver.waitForAngularRequestsToFinish();


            WebElement myFirstName = driver.findElement(ByAngular.model("firstName"));
            myFirstName.clear();
            WebDriverWait wait = new WebDriverWait(driver, 5);
            myFirstName.sendKeys("Moshe");
            assertEquals(driver.findElement(By.xpath("//input")).getAttribute("value"), "Moshe");

        }

    }



