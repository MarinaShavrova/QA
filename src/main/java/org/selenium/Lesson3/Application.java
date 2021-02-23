package org.selenium.Lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
       /* webDriver.get("https://allo.ua/");
        System.out.println("Что-то запустилось");
        webDriver.navigate().to("http://allo.ua/");
        System.out.println("Запустилось "+ webDriver.getCurrentUrl());
        Thread.sleep(1000);


        String [] urls = {"http://allo.ua/", "http://olx.ua", "http://rozetka.com.ua/"};
        for (int i=0; i<urls.length; i++){
            webDriver.navigate().to(urls[i]);
            System.out.println("Loaded" + webDriver.getCurrentUrl());
            Thread.sleep(1000);
        }
*/
        String [] urls = {"http://allo.ua/", "http://olx.ua", "http://rozetka.com.ua/"};
        for (int i=urls.length - 1;i>0; i--){
            webDriver.navigate().back();
            System.out.println("Loaded" +urls[i-1]+ webDriver.getCurrentUrl());
            Thread.sleep(1000);
        }

        webDriver.quit();
    }
}
