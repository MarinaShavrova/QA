package Lesson12;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static org.junit.Assert.*;

public class ApplicationTest {
   private WebDriver driver;



    @Before
    public void setUp(){
       System.out.println("Before test");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String url = "C:\\Program Files\\JetBrains\\IntelliJ IDEA 2020.1\\IdeaProjects\\SeleniumQA2020\\src\\main\\resources\\index.html";
        driver.get(url);
    }

    @Test
    public void testHeader() throws InterruptedException {
       Thread.sleep(20000);
       WebElement h1 = driver.findElement(By.tagName("h1"));
    System.out.println(h1.getText());

     //   WebDriverWait wait = new WebDriverWait(driver, 15);
      //  WebElement h1 = wait.until(new Function<WebDriver, WebElement>() {
        //    @Override
         //   public WebElement apply(WebDriver webDriver) {
           //     return driver.findElement(By.tagName("h1"));
         //   }
      //  });

    }

    @Test
    public void testHeaderFluentWait()  {

       /* FluentWait<WebDriver> fluentWait  = new FluentWait<>(driver);
      
        //общее время ожидания 30 секунд
        fluentWait.withTimeout(30, TimeUnit.SECONDS);
        //проверка каждую секунду
        fluentWait.pollingEvery(1, TimeUnit.SECONDS);
        fluentWait.ignoring(NoSuchElementException.class);
        WaitH1 waitH1 = new WaitH1();
        fluentWait.until(waitH1);*/
        long timeoutSeconds;
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);
    }

}
class WaitH1 implements Function<WebDriver, WebElement>{
int count;
    @Override
    public WebElement apply(WebDriver driver) {
        System.out.println("Wait "+count+" second");
        return driver.findElement(By.tagName("h1"));
    }
}