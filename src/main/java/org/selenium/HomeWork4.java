package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork4 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String url = "file:///C:/Users/Marinka/Desktop/Lesson4%20hw/select_hw.html";
        System.out.println("Start test");
        driver.get(url);
        WebElement selectElem = driver.findElement(By.cssSelector("#auto"));
        Select select = new Select(selectElem);
        WebElement text = driver.findElement(By.cssSelector("#out1"));
        System.out.println(text.getText());
               //Поиск по selectByIndex
        try {
            select.selectByIndex(1);
           String string1 = "value:volvo";
           if (text.getText().equals(string1)) {
                System.out.println("Найдено совпадение - \"value:volvo\" в output элементе с id = out1");
            } else {
                System.out.println("Совпадений не найдено!");
            }
        } catch (Exception e) {
            System.out.println("Error - value:volvo");
        }
        //Поиск по selectByValue
           try {
               select.selectByValue("saab");
               String string2 = "value:saab";
               if (text.getText().equals(string2)) {
                   System.out.println("Найдено совпадение - \"value:saab\" в output элементе с id = out1");
               } else {
                   System.out.println("Совпадений не найдено!");
               }
           } catch (NoSuchElementException e){
               System.out.println("Error - value:saab");
        }
        //Поиск по selectByVisibleText
        try {
            select.selectByVisibleText("Mercedes");
            String string3 = "value:mercedes";
            if (text.getText().equals(string3)) {
                System.out.println("Найдено совпадение - \"value:mercedes\" в output элементе с id = out1");
            } else {
                System.out.println("Совпадений не найдено!");
            }
        } catch (NoSuchElementException e){
            System.out.println("Error - value:mercedes");
        }

            Thread.sleep(2000);
        driver.quit();
        System.out.println("End test");
    }

}
