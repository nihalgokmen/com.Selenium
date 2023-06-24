package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P06 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        String url = "https://";

        driver.get(url+"www.google.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.navigate().to(url+"www.youtube.com");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());

        driver.close();
    }
}
