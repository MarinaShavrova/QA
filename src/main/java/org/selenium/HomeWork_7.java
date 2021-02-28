package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork_7 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String url = "file:///C:/Users/Marinka/Desktop/Lesson7%20hw/windows.html";
        System.out.println("Start test");
        driver.get(url);
        System.out.println("Start title: "+ driver.getTitle());

        String parentHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@id=\"button1\"]")).click();
        Thread.sleep(2000);

        String secondPageHandle = "";
        for (String windowHandle : driver.getWindowHandles()) {
            secondPageHandle = windowHandle;
            if (!windowHandle.equals(parentHandle)) {
                break;
            }
        }

        WebDriver window1 = driver.switchTo().window(secondPageHandle);
        System.out.println("Second Title: " + window1.getTitle());
        String stringText = "Компьютерная Академия ШАГ Днепр – №1 на рынке IT-образования Украины";
        if (stringText.equals(window1.getTitle())) {
            System.out.println("Title - совпадает");
        } else {
            System.out.println("Title - не совпадает c заданным в задании");
        }

        driver.switchTo().window(parentHandle);
        WebElement new_Browser_Tab = driver.findElement(By.cssSelector("#content > p:nth-child(5) > button"));
        new_Browser_Tab.click();

        Thread.sleep(2000);


        String thirdPageHandle = "";
        for (String windowHandle : driver.getWindowHandles()) {
             WebDriver currentWindow = driver.switchTo().window(windowHandle);
            thirdPageHandle = windowHandle;
            if (!windowHandle.equals(parentHandle)) {
                break;
            }
            Thread.sleep(1000);
            currentWindow.close();

        }
        System.out.println("Third Title: " + driver.getTitle());



        Thread.sleep(2000);
        System.out.println("Test end");
        driver.quit();


    }
}
