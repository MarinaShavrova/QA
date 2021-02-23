package Lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Application {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.gecko.driver","C:\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        String url = "https://allo.ua/";
        webDriver.get(url);
        Thread.sleep(1000);
        if (url.equals(webDriver.getCurrentUrl())){
            System.out.println("ok");
        } else {

            System.out.println("no");
        }
        /*
//Получить title - сайта из html
        System.out.println(webDriver.getTitle());
        // запись html в переменную
       String pageSourse = webDriver.getPageSource();
       //Объект, который записывает данные в файл index.html
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("index.html"));
        bufferedWriter.write(pageSourse); //сам процесс записи
        bufferedWriter.close(); //закрываем поток записи

        //System.out.println(webDriver.getPageSource());
        System.out.println("Ok");
         webDriver.close();



        WebDriver driver = new FirefoxDriver();
        driver.get("https://rozetka.com.ua/");
        String Url = driver.getCurrentUrl();
        if(Url.equals("https://rozetka.com.ua/")) {
            System.out.println("URL - совпадает");
        } else {
            System.out.println("URL - не совпадает");
        }

 */
    }
}

