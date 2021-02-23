package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.List;

public class HomeWork_2 {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        String url = "file:C:\\Users\\Admin\\Desktop\\automation-practice-table.html";
        webDriver.get(url);

        List<WebElement> td = webDriver.findElements(By.tagName("td"));

        for(WebElement w : td) {
            System.out.println("td = " +w.getText());
        }
        Thread.sleep(3000);
        WebElement link = webDriver.findElement(By.linkText("details"));
        link.click();

        String expectedUrl = webDriver.getCurrentUrl();
        if(expectedUrl.equals("https://ru.wikipedia.org/wiki/%D0%91%D1%83%D1%80%D0%B4%D0%B6-%D0%A5%D0%B0%D0%BB%D0%B8%D1%84%D0%B0")){
            System.out.println("Ссылка загрузилась");
        }else {
            System.out.println("Ошибка");
        }
        Thread.sleep(3000);
        webDriver.quit();

    }
}