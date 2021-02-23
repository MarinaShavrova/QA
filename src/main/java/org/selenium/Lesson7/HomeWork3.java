package org.selenium.Lesson7;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class HomeWork3 {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.google.com/");
        WebElement login = driver.findElement(By.name("q"));
        login.sendKeys("пастила в домашних условиях на olx");
        login.submit();
        Thread.sleep(5000);
        try {
            WebElement test = driver.findElement(By.cssSelector(".LHJvCe"));
            WebElement test1 = driver.findElement(By.cssSelector(" #result-stats > nobr:nth-child(1)"));

            String source = test.getText();
            String delete = test1.getText();
            source = source.replace (delete, "");
            System.out.println (source);
            if(source.equals("Результатов: примерно 12 900")){
                System.out.println("Текст совпадает");
            }else {
                System.out.println("Текст не совпадает");
            }
        } catch (NoSuchElementException e){
            System.out.println("Элемент не найден");
        }

               driver.quit();
    }


}
