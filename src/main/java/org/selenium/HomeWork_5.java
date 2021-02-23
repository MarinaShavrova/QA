package org.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomeWork_5 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String url = "file:///C:/Users/Marinka/Desktop/Lesson5%20hw/windows.html";
        System.out.println("Start test");
        driver.get(url);
        try {
            WebElement confirm = driver.findElement(By.cssSelector("#confirm > button"));
            confirm.click();
            String alertMessage = driver.switchTo().alert().getText();
            System.out.println("Кнопка: dismiss \n Текст из модального окна: " + alertMessage);
            driver.switchTo().alert().dismiss();
        } catch (Exception e) {
            System.out.println("Error");
        }
        try {
            WebElement confirm = driver.findElement(By.cssSelector("#confirm > button"));
            confirm.click();
            Alert alert = driver.switchTo().alert();
            String alertMessage = driver.switchTo().alert().getText();
            System.out.println("Кнопка: accept \n Текст из модального окна: " +alertMessage);
            alert.accept();
        } catch (Exception e) {
            System.out.println("Error");
        }

        try {
            WebElement prompt = driver.findElement(By.cssSelector("#prompt > button:nth-child(1)"));
            prompt.click();
            Alert simpleAlert = driver.switchTo().alert();
            String alertMessage_prompt = driver.switchTo().alert().getText();
            System.out.println("Кнопка: dismiss \n Текст из модального окна: " +alertMessage_prompt);
            driver.switchTo().alert().sendKeys("Text");
            simpleAlert.dismiss();

        } catch (Exception e) {
            System.out.println("Error");
        }

        try {
            WebElement prompt = driver.findElement(By.cssSelector("#prompt > button:nth-child(1)"));
            prompt.click();
            Alert simpleAlert = driver.switchTo().alert();
            String alertMessage_prompt = driver.switchTo().alert().getText();
            System.out.println("Кнопка: accept\n Текст из модального окна: " +alertMessage_prompt);
            driver.switchTo().alert().sendKeys("Text");
            simpleAlert.accept();
        } catch (Exception e) {
            System.out.println("Error");
        }
        WebElement iframe = null;
        try{
            iframe = driver.findElement(By.cssSelector("#main > div:nth-child(7) > iframe:nth-child(1)"));

            System.out.println("Ok");
        } catch (NotFoundException e){
            System.out.println("Error!");
        }
        WebDriver frame1 =  driver.switchTo().frame(iframe);
        WebElement select = (WebElement) frame1.findElement(By.cssSelector("body > h1:nth-child(1)"));

        System.out.println("Текст во фрейме: "+ select.getText());


        try{
            WebElement iframeYoutube = driver.findElement(By.xpath("/html/body/div/div[7]/iframe"));

            System.out.println("Ok");
        } catch (NotFoundException e){
            System.out.println("Error!");
        }
       // WebDriver frameYoutube =  driver.switchTo().frame(iframeYoutube);
        // WebElement selectYoutube = (WebElement) frameYoutube.findElement(By.cssSelector(".ytp-share-button"));

       // System.out.println("Текст во фрейме: "+ selectYoutube.getText());

        Thread.sleep(2000);
        driver.quit();
        System.out.println("End test");



    }

}
       /* try {
            driver.findElement(By.id("timerAlertButton")).click();
            WebDriverWait wait = new WebDriverWait(driver,100);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert simpleAlert = driver.switchTo().alert();
            Thread.sleep(5000);
            simpleAlert.accept();
            System.out.println("Unexpected alert accepted");
        } catch (Exception e) {
            System.out.println("unexpected alert not present");
        }


       // Alert alert = driver.switchTo().alert();
        // Capturing alert message.
       // String alertMessage = driver.switchTo().alert().getText();
       // driver.switchTo().alert().dismiss();
        // Displaying alert message
     //   System.out.println(alertMessage);



        // Accepting alert
      //  alert.accept();

       /*
        try{
            Alert alert = driver.switchTo().alert();
            String alertMessage= alert.getText();
            driver.switchTo().alert().dismiss();
            System.out.println("Alert msg is : "+alertMessage);
            System.out.println("Ok");

        } catch (NotFoundException e){
            System.out.println("Error!");

        }

*/










