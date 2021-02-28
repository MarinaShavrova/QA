package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomeWork_8 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String url = "file:///C:/Users/Marinka/Desktop/Lesson8%20hw/select.html";
        System.out.println("Start test");
        driver.get(url);

        try {
            WebElement selectElem = driver.findElement(By.cssSelector("#additives"));
            Select select = new Select(selectElem);

            select.selectByValue("Cheese");
            Thread.sleep(2000);
            WebElement test = driver.findElement(By.id("out2"));
            System.out.println("Значение в select элементе с id = out2 "+test.getText());
            if (test.getText().equals("Cheese")) {
                System.out.println("Найдено совпадение - \"Cheese\" в select элементе с id = out2");
            } else {
                System.out.println("Совпадений не найдено!");
            }

        } catch (Exception e) {
            System.out.println("Error - value:Cheese");
        }
        Actions actions = new Actions(driver);
        try {
            WebElement selectElem = driver.findElement(By.cssSelector("#additives"));
            Select select = new Select(selectElem);


           // WebElement pepperoni = driver.findElement(By.xpath("//option[@value='Pepperoni']"));
            select.selectByValue("Pepperoni");
            select.selectByValue("Cheese");

            Thread.sleep(2000);
            WebElement test = driver.findElement(By.id("out2"));

            System.out.println("Значение в select элементе с id = out2 \n"+test.getText());
            List <WebElement> allOption = select.getAllSelectedOptions();
String cheese = "";
String pepperoni = "";
String result = "";
            for(WebElement w : allOption) {
                result = w.getText();
                if (result.equals("Cheese")){
                    cheese = "ok";
                } else  if (result.equals("Pepperoni")){
                    pepperoni = "ok";
                }
            }

            if (cheese == "ok" && pepperoni == "ok") {
                System.out.println("Найдено совпадение - \"Cheese\" и \"Pepperoni\" в select элементе с id = out2");
            } else {
                System.out.println("Совпадений не найдено!");
            }






        } catch (Exception e) {
            System.out.println("Error - value:Pepperoni");
        }
        try {
            WebElement selectElem = driver.findElement(By.cssSelector("#additives"));
            Select select = new Select(selectElem);


            // WebElement pepperoni = driver.findElement(By.xpath("//option[@value='Pepperoni']"));
            select.selectByValue("Pepperoni");
            select.selectByValue("Cheese");
            select.selectByValue("Mushrooms");

            Thread.sleep(2000);
            WebElement test = driver.findElement(By.id("out2"));

            System.out.println("Значение в select элементе с id = out2 \n"+test.getText());
            List <WebElement> allOption = select.getAllSelectedOptions();
            String cheese = "";
            String pepperoni = "";
            String mushrooms = "";
            String result = "";
            for(WebElement w : allOption) {
                result = w.getText();
                if (result.equals("Cheese")){
                    cheese = "ok";
                } else  if (result.equals("Pepperoni")){
                    pepperoni = "ok";
                }else  if (result.equals("Mushrooms")){
                    mushrooms = "ok";
                }
            }

            if (cheese == "ok" && pepperoni == "ok" && mushrooms == "ok") {
                System.out.println("Найдено совпадение - \"Cheese\" и \"Pepperoni\", и \"Mushrooms\"в select элементе с id = out2");
            } else {
                System.out.println("Совпадений не найдено!");
            }

        } catch (Exception e) {
            System.out.println("Error - value:Pepperoni");
        }
        Thread.sleep(2000);
        driver.quit();
        System.out.println("End test");
    }


}