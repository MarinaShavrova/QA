package Lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotExample {
    public static <Click> void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String url = "https://a-bank.com.ua/";
         System.out.println("Start test");
        driver.get(url);
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
//executor.executeScript("alert('Hello from selenium')");
//executor.executeScript("window.location = 'https://google.com.ua'"); //window.open - в новой вкладке
     // driver.manage().window().fullscreen();//F11

        //или
        //driver.manage().window().maximize();//полноэкранный режим

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

       // robot.mouseWheel(10);

        for (int i = 0; i<20; i++){
            robot.mouseWheel(i);
            Thread.sleep(500);
        }
        WebElement element= driver.findElement(By.cssSelector("a.root-3557130548:nth-child(4)"));
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        System.out.println("x= "+x+5+" y= "+y);

        Robot bot = new Robot();
        bot.mouseMove(x, y);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(777);//Здесь можно уравнение прямой проходящее через 2
        //точки!!!
        bot.mouseMove(x+5, y+5);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
/*
        robot.delay(1000);
        int mask = InputEvent.BUTTON1_DOWN_MASK;
        robot.mouseMove(x,y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mousePress(mask);
        robot.delay(1000);
        robot.mouseRelease(mask);

 */
        driver.quit();
        System.out.println("End test");

    }
}
