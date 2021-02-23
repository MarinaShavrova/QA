package org.selenium.Lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws InterruptedException, IOException {
    /*    System.setProperty("webdriver.gecko.driver", "C:\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.navigate().to ( "file:///C:/Users/Admin/IdeaProjects/SeleniumQA2020/index1.html");
        WebElement selectElement = webDriver.findElement(By.cssSelector("body > select:nth-child(7)"));

       // System.out.println(selectElement.getText());
        Select select = new Select(selectElement);
        List<WebElement> options = select.getOptions();

        String[] countries = {"USA","Canada","Russia","Ukraine"};

        if (options.size() == countries.length){
            for (int i=0; i<options.size(); i++){
                WebElement webElement = options.get(i);
                    if (options.get(i).getText().equals(countries[i])){
                        System.out.println("Exp "+options.get(i).getText()+" actual " + countries[i]);
                    }
            }
        } else {

            System.out.println("Exp "+options.size()+" actual " + countries.length);
        }
        System.out.println("Selected El: ");
        select.selectByIndex(1);
        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
        for (WebElement allSelectionEl : allSelectedOptions) {
            System.out.println(allSelectionEl.getText());
        }
        //     for (int i=0; i<options.size(); i++){
     //       WebElement webElement = options.get(i);
          //  System.out.println(webElement.getText());

/* webDriver.navigate().to("https://itstep.dp.ua/contacts");
     WebElement element = webDriver.findElement(By.xpath("/html/body/main/section[2]/div[3]/div[3]/div[2]/form/div/div[1]/input"));
     String placeholder = element.getAttribute("placeholder");

       Thread.sleep(5000);


        webDriver.quit();*/
        Scanner in = new Scanner(System.in);
        String source, delete;
        source = in.nextLine();
        delete = in.nextLine();
        source = source.replace (delete, "");
        System.out.println (source);

    }
}
