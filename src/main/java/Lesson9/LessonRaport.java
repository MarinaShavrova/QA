package Lesson9;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;
import java.sql.DriverManager;
import java.util.Properties;

public class LessonRaport {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        System.out.println("Start test");

        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        String title = driver.getTitle();

        PrintStream file = new PrintStream("report.html");
        file.println("<html><head><title>Selenium test log</title></head><body>");
        file.println("<h1>Test</h1>");
        file.println("<h2>Test #1</h2>");
        if (true) {
            file.println("<p style ='color:green;'>Test OK</p>");
            File img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            InputStream inputStream = new FileInputStream(img);
            OutputStream outputStream = new FileOutputStream("img\\screen.png");
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            inputStream.close();
            outputStream.close();
            file.println("<a href='img/screen.png' target = '_blank'><img width='200' src='img/screen.png'/></a>");

        }else {
            file.println("<p style ='color:red;'>Test NO</p>");
        }

            driver.navigate().to("https://www.google.com/");
            WebElement login = driver.findElement(By.name("q"));
            login.sendKeys("пастила в домашних условиях на olx");
            login.submit();

        if (title.equals("SeleniumHQ Browser Automation")) {
            file.println("<p style ='color:green;'>Test OK</p>");
            File img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            InputStream inputStream = new FileInputStream(img);
            OutputStream outputStream = new FileOutputStream("img\\screen1.png");
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            inputStream.close();
            outputStream.close();
            file.println("<a href='img/screen1.png' target = '_blank'><img width='200' src='img/screen1.png'/></a>");

        }else {
            file.println("<p style ='color:red;'>Test NO</p>");
        }

        file.println("</body></html>");
        file.close();

        driver.quit();
        System.out.println("End test");
/*

if (true) {
    file.println("<p style ='color:green;'>Test OK</p>");
    File img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    InputStream inputStream = new FileInputStream(img);
    byte[] buffer = new byte[1024];
    int length = 0;

    if (title.equals("Google")) {
        OutputStream outputStream = new FileOutputStream("img\\screen1.png");
        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }
        outputStream.close();
    }

        if (title.equals("SeleniumHQ Browser Automation")) {
            file.println("<p style ='color:green;'>Test OK</p>");
            OutputStream outputStream = new FileOutputStream("img\\screen1.png");
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            outputStream.close();
        }

    inputStream.close();
    outputStream.close();



            file.println("<a href='img/screen.png' target = '_blank'><img width='200' csr='img/screen.png'/><img width='200' csr='img/screen1.png'/></a>");


}else {
            file.println("<p style ='color:red;'>Test NO</p>");
        }

        file.println("</body></html>");
        file.close();

        driver.quit();
        System.out.println("End test");
    }
}*/
        }
    }
