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

        WebElement iframe = null;
        try{

            iframe = driver.findElement(By.cssSelector("#iframeResult"));
            WebDriver frame = driver.switchTo().frame(iframe);
            System.out.println("Title основного фрейма: "+ driver.getTitle());
            WebDriver frame1 = driver.switchTo().frame(0);

            String code = frame1.getPageSource();

            int index = code.indexOf("W3Schools Online Web Tutorials");
           System.out.println("Искомый title: " + code.substring(index,index+30));

            if (code.substring(index,index+30).equals("W3Schools Online Web Tutorials")){
                System.out.println("Title - определен корректно");
            } else {
                System.out.println("Title отличается от заданного в задаче");
                        }


        } catch (NotFoundException e){
            System.out.println("Error!");
        }


        driver.quit();
        System.out.println("End test");
    }
}
