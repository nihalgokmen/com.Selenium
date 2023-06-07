package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {

    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        WebElement addElementButonu = driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButtonElement = driver.findElement(By.xpath("//button[@class=‘added-manually’]"));

        if (deleteButtonElement.isDisplayed()){
            System.out.println("Delete button test PASSES");
        } else {
            System.out.println("Delete button test FAILED");
        }

        //4- Delete tusuna basin
        deleteButtonElement.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addElementsELementi = driver.findElement(By.xpath("//h3"));
                                        // driver.findElement(By.tagName("h3"))

        if (addElementsELementi.isDisplayed()){
            System.out.println("Add/Remove Elements Testi PASSED");
        }else {
            System.out.println("Add/Remove Elements Testi FAILED");
        }

        driver.close();
    }
}
