package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Deneme {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        WebElement cellbuton = driver.findElement(By.id("swm-link"));

        if (cellbuton.isDisplayed()){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        System.out.println(cellbuton.getText());

        Thread.sleep(3000);
        driver.close();
    }
}
