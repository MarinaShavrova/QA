package org.selenium;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;


public class HomeWork_1 {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();

        webDriver.get("https://itstep.dp.ua/about-academy");
        System.out.println("Полученный title: "+ webDriver.getTitle());
        String title_1 = "О нас: история, преимущества и достижения Компьютерной Академии ШАГ.";

        if (title_1.equals(webDriver.getTitle()) ){
            System.out.println("Title - совпадает с заданным в задаче");
        } else {
            System.out.println("Title - НЕ совпадает с заданным в задаче");
        }

        Thread.sleep(3000);
        webDriver.navigate().to("https://itstep.dp.ua/formy-obucheniya/");
        System.out.println("Полученный title: "+ webDriver.getTitle());
        String title_2 = "Формы и направления обучения в Компьютерной Академии ШАГ Днепропетровск";

        if (title_2.equals(webDriver.getTitle())){
            System.out.println("Title - совпадает с заданным в задаче");
        } else {
            System.out.println("Title - НЕ совпадает с заданным в задаче");
        }
        Thread.sleep(3000);

        webDriver.navigate().to("https://itstep.dp.ua/testirovanie-po-qa/");
        System.out.println("Полученный title: "+ webDriver.getTitle());
        String title_3 = "Курсы тестирования ПО, курсы тестировщиков в Днепропетровске – КА ШАГ";

        if (title_3.equals(webDriver.getTitle())){
            System.out.println("Title_3 - совпадает с заданным в задаче");
        } else {
            System.out.println("Title_3 - НЕ совпадает с заданным в задаче");
        }
        Thread.sleep(3000);

        webDriver.quit();
        webDriver.close();

    }
}
