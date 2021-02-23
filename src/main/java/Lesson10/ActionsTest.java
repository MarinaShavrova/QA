package Lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.List;

public class ActionsTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
String str = "C:\\Users\\Marinka\\Desktop\\Lesson5 hw\\actions.html";
        driver.get(str);
        Actions actions = new Actions(driver);
        try{
            List<WebElement> li = driver.findElements(By.tagName("li"));
            actions.click(li.get(1)).keyDown(Keys.CONTROL).moveToElement(li.get(6)).pause(2000)
                    .click().perform(); //метод запускает выполнени


        }catch(Exception e){
            e.printStackTrace();
        }

        driver.quit();
    }

}

