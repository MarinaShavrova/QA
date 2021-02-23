package org.selenium.Lesson4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Application {
    public static void main(String[] args)  {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        //String url = "file:///C:/Users/Admin/IdeaProjects/SeleniumQA2020/index1.html";
       // webDriver.get(url);
   /*     List<WebElement> h2 = webDriver.findElements(By.tagName("h2"));
        for(WebElement w : h2) {
         //   WebElement h2 = webDriver.findElement(By.tagName("h2"));
            System.out.println("text " + w.getText());
            System.out.println("text " + w.getTagName());
            System.out.println("text " + w.getSize());
            System.out.println("display "+ w.isDisplayed());
            System.out.println("==================");

        }
        */
     //  WebElement link =  webDriver.findElement(By.partialLinkText("Google"));
       WebElement link =  webDriver.findElement(By.name("Google"));
        link.submit();


        String expectedUrl = webDriver.getCurrentUrl();
        if (expectedUrl.equals("http://google.com")){
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
     webDriver.quit();


    }
}
