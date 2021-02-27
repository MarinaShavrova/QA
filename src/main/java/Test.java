//import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.json.JsonOutput;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Test {


    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Browserstack Guide"); //name locator for text box
        WebElement searchbutton = driver.findElement(By.name("Google"));//name locator for google search

        searchbutton.click();
        String expectedUrl = driver.getCurrentUrl();
        if (expectedUrl.equals("http://google.com")){
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
        System.out.println("1111111");
        System.out.println();
        driver.quit();
    }

}