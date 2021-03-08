package org.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWork_9 {
    public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    String url = "https://swisnl.github.io/jQuery-contextMenu/demo.html";
        driver.get(url);
        System.out.println("Start test");

        try {
            WebElement o_element = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
            Thread.sleep(2000);
            Actions action = new Actions(driver);
            action.contextClick(o_element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
            String str;
            Alert alert = driver.switchTo().alert();
            Thread.sleep(2000);
            str = alert.getText();
            alert.accept();
            System.out.println("Текст на модельном окне: " + str);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Не удалось произвести действие!");
        }
        Thread.sleep(2000);
        driver.quit();
        System.out.println("End test");

    }
}
