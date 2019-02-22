package HomeWork7;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class practice {

    private static WebDriver driver;
    private static Object webdriver;


    @BeforeClass
    public static void main() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moshe\\IdeaProjects\\Selenium\\chromedriver.exe");


        driver = new ChromeDriver();

    }

    @Test

    public void run() {
        driver.get("https://translate.google.com/");
        WebElement translateButton = driver.findElement(By.className("go-button"));

        System.out.println(translateButton);

    }

    @Test
    public void run2() {
        driver.get("https://www.amazon.com/");
        String amazonAdd = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        assertEquals(amazonAdd, driver.getTitle());
        WebElement amazonSearch = driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearch.sendKeys("Leather shoes");
        amazonSearch.submit();


    }

    @Test

    public void run3() {
        driver.get("https://translate.google.com/");
        driver.findElement(By.id("source")).sendKeys("שלום");
        WebElement translateButton = driver.findElement(By.className("go-button"));

    }


    @Test

    public void run4() {
        driver.get("https://www.youtube.com/?hl=iw&gl=IL");
        driver.findElement(By.name("search_query")).sendKeys("bohemian rhapsody");
        driver.findElement(By.id("search-icon-legacy")).submit();
    }

    @Test


    public void run5() {
        int i;

        driver.get("https://dgotlieb.github.io/Controllers/Controllers.html");
        List<WebElement> list = driver.findElements(By.name("group1"));
        for (i = 0; i < list.size(); i++) ;
        {
            WebElement x = list.get(i);
            if (x.getAttribute("value").equals("Cheese")) {
                System.out.println(x.getAttribute("value"));
                x.click();

            }

        }


        Select type = new Select(driver.findElement(By.name("dropdownmenu")));
        type.selectByValue("Milk");
        for (i = 0; i < type.getOptions().size(); i++) {

            System.out.println(type.getOptions().get(i).getText());
        }


    }


    @Test
    public void run6() {
        driver.get("https://translate.google.com/");

        WebElement theFirst = driver.findElement(By.className("go-button"));
        WebElement second = driver.findElement(By.xpath("//div[@role='button']"));
        System.out.println(theFirst);
        System.out.println(second);
    }

    @Test
    public void run7() {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("xxxx");
        driver.findElement(By.name("pass")).sendKeys("xxxx");
        driver.findElement(By.id("u_0_2")).click();


    }

    @Test
    public void run8() {
        driver.get("https://dgotlieb.github.io/Navigation/Navigation.html");
        driver.findElement(By.id("MyAlert")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();
    }

    @Test
    public void run9() {
        driver.get("https://dgotlieb.github.io/Navigation/Navigation.html");
        driver.findElement(By.id("MyPrompt")).click();
        Alert promt1 = driver.switchTo().alert();
        promt1.sendKeys("Moshe");
        promt1.accept();
        String output = "Moshe";
        assertEquals(output, driver.findElement(By.id("output")).getText());


    }

    @Test
    public void run10() {
        driver.get("https://dgotlieb.github.io/Navigation/Navigation.html");
        driver.findElement(By.id("MyConfirm")).click();
        Alert confirm = driver.switchTo().alert();
        confirm.accept();
        String output = "Confirmed";
        assertEquals(output, driver.findElement(By.id("output")).getText());
        driver.findElement(By.id("MyConfirm")).click();
        confirm.dismiss();
        output = "Canceled";
        assertEquals(output, driver.findElement(By.id("output")).getText());


    }

    @Test
    public void run11() {
        driver.get("https://dgotlieb.github.io/Navigation/Navigation.html");
        WebElement iframe = driver.findElement(By.cssSelector("iframe[src='newFrame.html']"));
        driver.switchTo().frame(iframe);
        System.out.println("Iframe text is :" + driver.findElement(By.id("iframe_container")).getText());
        driver.switchTo().defaultContent();
        assertEquals("Navigation", driver.findElement(By.id("title")).getText());


    }

    @Test
    public void run12() {
        driver.get("https://dgotlieb.github.io/Navigation/Navigation.html");
        String oldTab = driver.getWindowHandle();
        driver.findElement(By.id("openNewTab")).click();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        System.out.println("Tab text is : " + driver.findElement(By.id("new_tab_container")).getText());

        driver.close();
        driver.switchTo().window(oldTab);
        assertEquals("Navigation", driver.findElement(By.id("title")).getText());


    }

    @Test
    public void run13() {
        driver.get("https://dgotlieb.github.io/Navigation/Navigation.html");
        String winHandleBefore = driver.getWindowHandle();
        driver.findElement(By.cssSelector("a[href='newWindow.html']")).click();

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);

        }
        System.out.println("Tab text is : " + driver.findElement(By.id("new_window_container")).getText());
        String output = "This is a new Window";
        assertEquals(output, driver.findElement(By.id("new_window_container")).getText());
        driver.findElement(By.id("new_window_container")).getText();
        driver.close();
        driver.switchTo().window(winHandleBefore);
        assertEquals("Navigation", driver.findElement(By.id("title")).getText());
    }

    @Test
    public void run14() {

        driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward/");


        driver.findElement(By.id("identifierId")).sendKeys("mosheavidorster");
        driver.findElement(By.className("RveJvd ")).click();



            driver.findElement(By.className("zHQkBf")).sendKeys("5714208");
            driver.findElement(By.className("CwaK9 ")).click();


        }

    }




