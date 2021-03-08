package Lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Application {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String url = "C:\\Program Files\\JetBrains\\IntelliJ IDEA 2020.1\\IdeaProjects\\SeleniumQA2020\\src\\main\\resources\\index.html";
        driver.get(url);
        System.out.println("Start test");
        Thread.sleep(20000);
       WebElement h1 = driver.findElement(By.cssSelector("#main > header:nth-child(1) > h1:nth-child(1)"));
       System.out.println(h1.getText());

    }


}
