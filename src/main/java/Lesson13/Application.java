package Lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String url = "https://www.seleniumeasy.com/test/dynamic-data-loading-demo.html";
        driver.get(url);
        System.out.println("Start test");

        try{
            //implicitlyWait - явное ожидание
            WebElement botton = driver.findElement(By.cssSelector("#save"));
            botton.click();
            driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

            List<WebElement> allImagesUnderThisClass = driver.findElements(By.id("loading"));
            String ignoreImageURl = "http://seleniumeasy.com/test/img/loader-image.gif";
            for(WebElement elem : allImagesUnderThisClass){
                List<WebElement> imgs = elem.findElements(By.tagName("img"));
                System.out.println(imgs.size());
                for(WebElement img : imgs){
                    String source = img.getAttribute("src");
                    if(!source.equalsIgnoreCase(ignoreImageURl)){
                        System.out.println(source);
                    }
                }
            }

         /*   if( driver.findElement(By.id("loading")).isDisplayed()){
                WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/img"));
                Thread.sleep(2000);
              String src = ((JavascriptExecutor)driver).executeScript("return arguments[1].attributes['src'].value;", element).toString();
                System.out.println("Element is Visible "+src);
            }else{
                System.out.println("Element is InVisible");
            }*/
            Thread.sleep(2000);
            System.out.println("End test");
        }catch (Exception exception){
            exception.getMessage();
        }finally {
            assert driver != null;
            driver.quit();
        }


        System.out.println("OK");
    }
}
