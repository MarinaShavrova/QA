package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
    //webDriver.get ("http://localhost:8080");
        driver.navigate().to("https://www.google.com/");
        WebElement login = driver.findElement(By.name("q"));
        login.sendKeys("Погода днепр");
        login.submit();
       if ( "Результатов".startsWith("Результатов")){
           System.out.println("ok");
       }else {
           System.out.println("no");
       }

       // html body#gsr.srp.vasq.wf-b div#main.main div#cnt.big div#appbar.appbar div#extabar div div#slim_appbar.WE0UJf div.LHJvCe div#result-stats

        /*
     //WebElement login = webDriver.findElement(By.name("login"));
   WebElement password = webDriver.findElement(By.name("password"));




/*
        System.out.println(login.getText());
        System.out.println(login.getTagName());

        System.out.println(password.getText());
        System.out.println(password.getTagName());
        */


        //login.sendKeys("admin");
      //  password.sendKeys("qwert");
     //   password.submit();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        Thread.sleep(2000);
        System.out.println("ok");

        driver.quit();
    }
}
