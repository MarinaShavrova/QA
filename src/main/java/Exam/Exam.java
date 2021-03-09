package Exam;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Exam {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Marinka\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String url = "http://shop.demoqa.com/shop/";
        driver.get(url);
        System.out.println("Start test");
try{
    WebElement o_element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/select"));
    o_element.click();
     Select select = new Select(o_element);
       select.selectByValue("popularity");

    Thread.sleep(2000);
    WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[10]/div/span[1]"));
    element.click();
    Thread.sleep(2000);
    WebElement name_shoes = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[5]/div/h3/a"));
    name_shoes.click();
    System.out.println("Полученный title: "+ driver.getTitle());
    Thread.sleep(3000);

    WebElement text = driver.findElement(By.xpath("//*[@id=\"product-1287\"]/div[1]/div[2]/h1"));
    System.out.println(text.getText());
    String str = "ROSE GOLD SIMPLE STRAP PLATFORM SANDALS";
    if(text.getText().equals(str)){
        System.out.println("Pass");
    } else {
        System.out.println("Error");
    }
// Переход на предыдущую вкладку
    driver.navigate().back();
// Переход на главную страницу со списком продуктов
    driver.navigate().to("http://shop.demoqa.com/shop/");

    WebElement search = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div/div/a"));
    search.click();
// Ввод текста в поле - Поиск
    search.findElement(By.xpath("/html/body/div[2]/header/div[3]/div[2]/form/input[1]")).sendKeys("Sun Glasses");
    driver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[3]/div[2]/form/button")).submit();
    Thread.sleep(3000);
// Переход на продукт
    WebElement glasses = driver.findElement(By.cssSelector("div.noo-product-item:nth-child(4) > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1)"));
    glasses.click();
    Thread.sleep(3000);
    WebElement webElement = driver.findElement(By.cssSelector("p.price > ins:nth-child(2) > span:nth-child(1) > bdi:nth-child(1)"));
// Получение стоимости товара
    System.out.println("Полученный текст на экране: "+ webElement.getText());
     String test = webElement.getText();
     String test1 = test.substring(1);
    System.out.println(test1);
    String str1 = "55.00";
    if (test1.equals(str1)){
        System.out.println("Pass: "+test1);
    } else {
        System.out.println("Error");
    }

} catch (NoSuchElementException e) {
    e.getMessage();
} finally {
    assert driver != null;
    driver.quit();
}
      System.out.println("End test");
    }
}
