package Lesson2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.json.JsonOutput;

import java.io.IOException;

public class Aplication {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.gecko.driver","C:\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();

        webDriver.navigate().to("http://google.com");
        System.out.println("Посетили страничку google!");

       String title = "Google" ;
        if (title.equals(webDriver.getTitle())){
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
        Thread.sleep(1000);
        webDriver.navigate().to("https://rozetka.com.ua/");
        System.out.println("Rozetka!");
        Thread.sleep(1000);
        webDriver.quit();
    }
}
