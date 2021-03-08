package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.json.JsonOutput;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeWork_11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String url = "http://www.seleniumeasy.com/test/dynamic-data-loading-demo.html";
        driver.get(url);
        System.out.println("Start test");

        try {
            WebElement botton = driver.findElement(By.cssSelector("#save"));
            botton.click();
            driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

            String ignoreImageURl = "http://seleniumeasy.com/test/img/loader-image.gif";
            if( driver.findElement(By.id("loading")).isDisplayed()){
                WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/img"));
                Thread.sleep(2000);
                System.out.println("Element is Visible");
                System.out.println(driver.findElement(By.cssSelector("#loading > img:nth-child(1)")).getAttribute("src"));
                WebElement webElement = driver.findElement(By.cssSelector("#loading"));
                System.out.println(webElement.getText());
            }else{
                System.out.println("Element is InVisible");
            }

       } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(2000);
        driver.quit();
        System.out.println("End test");
    }
}
