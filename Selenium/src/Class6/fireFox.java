package Class6;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import static org.junit.Assert.*;
public class fireFox{



@BeforeClass

public static void main() {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\geckodriver.exe");
}   FirefoxDriver driver = new FirefoxDriver();

    @Test

    public void run(){
        driver.get("https://www.ynet.co.il/");
    }
}
