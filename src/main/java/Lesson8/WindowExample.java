package Lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://a-bank.com.ua/");
        WebElement a = driver.findElement(By.cssSelector(".btn-block > a:nth-child(2) > div:nth-child(1) > button:nth-child(1) > div:nth-child(1)"));
        //Set<String> windowHandles = driver.getWindowHandles();
      String  main = driver.getWindowHandle();
        System.out.println("Befor");
        showWindows(driver.getWindowHandles());
        a.click();
        Thread.sleep(3000);

        showWindowsEach(driver.getWindowHandles());
        System.out.println("After");
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(main)){
                break;
            }
        }



        System.out.println("Title = " + driver.getTitle());

        driver.quit();
        System.out.println("End test");
        // driver.switchTo().window(s);
/*
        String parentWindowHandle = driver.getWindowHandle(); // save the current window handle.
        WebDriver popup = null;
        Iterator<String> iterator = getWindowHandles.iterator();
        while(iterator.hasNext()) {
            String windowHandle = iterator.next();
            popup = driver.switchTo().window(windowHandle);
            System.out.println(popup+ "======= "+ windowHandle);
        }
*/
    }

    public static String showWindows(Set<String> windowHandles) {
        System.out.println("win size " + windowHandles.size());
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()) {

            System.out.println("Первый ======= " + iterator.next());
        }
        return null;
    }

    public static void showWindowsEach(Set<String> windowHandles) {
        System.out.println("win size " + windowHandles.size());
        for (String windowHandle : windowHandles) {
            System.out.println("Второй ===="+windowHandles);
        }
    }
}

