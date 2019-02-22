
package Class6;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertEquals;


public class Chrome {

    private static WebDriver driver;
    private static Object webdriver;


    @BeforeClass
    public static void main() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\chromedriver.exe");


        driver = new ChromeDriver();

    }

    @Test
    public void testChromeSelenium() {

        driver.navigate().refresh();
        String walla = driver.getTitle();
        assertEquals("ynet", "walla");
        driver.get("https:/walla.co.il/");
    }


}
