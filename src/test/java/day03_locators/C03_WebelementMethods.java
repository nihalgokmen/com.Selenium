package day03_locators;

import net.bytebuddy.implementation.bytecode.StackSize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;
import java.time.Duration;

public class C03_WebelementMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaCubuguElementi = driver.findElement(By.id("twotabsearchtextbox"));

        System.out.println(aramaCubuguElementi.isDisplayed()); // true
        System.out.println(aramaCubuguElementi.isEnabled()); // true

        System.out.println(aramaCubuguElementi.getText()); // varsa webelement uzerindeki yaziyi getirir

        aramaCubuguElementi.sendKeys("Nutella"); // yazar
        Thread.sleep(2000);
        aramaCubuguElementi.clear(); // siler

        System.out.println(aramaCubuguElementi.getSize()); // (694, 38)
        System.out.println(aramaCubuguElementi.getSize().height); // 38

        System.out.println(aramaCubuguElementi.getTagName()); // input
        System.out.println(aramaCubuguElementi.getAttribute("class")); // nav-input nav-progressive-attribute
        // arama cubugunun class elementindeki attribute'i verir

        System.out.println(aramaCubuguElementi.getLocation()); // (279, 11) --> piksel konumu

        System.out.println(aramaCubuguElementi.getRect().getDimension()); // (912, 38)


        Thread.sleep(3000);
        driver.close();
    }
}
