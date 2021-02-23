package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class HomeWork_6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String url = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe";
        System.out.println("Start test");
        driver.get(url);
        try{
            WebElement iframe1 = driver.findElement(By.xpath("/html/body/iframe"));
            System.out.println("Полученный title: "+ driver.getTitle());
            System.out.println("Ok");
        } catch (NotFoundException e){
            System.out.println("Error!");
        }
        WebElement iframe = null;
        try{
           iframe = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
            System.out.println("Полученный title: "+ driver.getTitle());
                       System.out.println("Ok");
        } catch (NotFoundException e){
            System.out.println("Error!");
        }
        WebDriver frame1 =  driver.switchTo().frame(iframe);

        WebDriver frame2 =  driver.switchTo().frame(0);
        String page = frame1.getPageSource();
        System.out.println(frame2);
        System.out.println("Полученный title: "+ driver.getTitle());

       // WebElement select = (WebElement) frame1.findElement(By.xpath("/html/body/iframe"));

       // List<WebElement> els = frame1.findElements(By.xpath("/html/body/iframe"));
      //  System.out.println("Полученный title: "+ driver.getTitle());


    //    System.out.println("Текст во фрейме: "+ driver.getTitle()+ "els "+els+"===="+els.size());
        driver.quit();
        System.out.println("End test");
    }
}
