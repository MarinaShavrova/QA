package org.selenium.Lesson7;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class AlertTest {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();

        webDriver.get("C:\\Users\\Admin\\IdeaProjects\\SeleniumQA2020\\src\\main\\resources\\windows.html");
     /*   WebElement button = null;
        try{
            button = webDriver.findElement(By.cssSelector("#alert > button"));
            button.click();
            WebDriver.TargetLocator targetLocator = webDriver.switchTo();// позволяет переключаться  между окнами
            Alert alert = targetLocator.alert();//вызываем метод alert(), чтоб получить объект Алерт

          String expectedText = "It is simple alert";
           String actualTest = alert.getText();

           if(expectedText.equals(actualTest)){
                System.out.println("Ok: Модальное окно содержит текст "+actualTest);
           } else {
               System.out.println("Error: Модальное окно содержит текст "+actualTest);
            }

            alert.accept();


            System.out.println("Все прошло хорошо");
        }catch (NoSuchElementException e){
            System.out.println("Элемент не найден");
        }

        Thread.sleep(2000);
*/
        WebElement iframe = null;
        try{
            iframe = webDriver.findElement(By.cssSelector("#iframe > iframe:nth-child(1)"));
            System.out.println("Ok");
        } catch (NotFoundException e){
            System.out.println("Error!");
        }

        WebDriver frame =  webDriver.switchTo().frame(iframe);
        WebElement select = (WebElement) frame.findElement(By.cssSelector("li.ui-state-default:nth-child(1)"));

        select.click();
        Thread.sleep(2000);
        webDriver.quit();
        System.out.println("End test");

    }
}