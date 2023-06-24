package day05_relativeLocators_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C01_RelativeLocators {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        // 2 ) Berlin’i 3 farkli relative locator ile locate edin
        /*
            Aslinda biz Berlin elementini id='pid_thumb' seklinde locate edebiliriz
            relative locator, locate edilemeyen webelementler icin tasarlanmisti
            biz ornek olmasi icin Berlin elementi uzerinde deniyoruz
            (aradigimiz webelementin bir ozelligi) + locate edilen bir webelement'e gore konumu
         */

        // 3 ) Relative locator’larin dogru calistigini test edin

        // A)- tag'i img, NYC'nin altinda
        WebElement nyc = driver.findElement(By.id("pid3_thumb"));
        WebElement berlin1 = driver.findElement(RelativeLocator.with(By.tagName("img")).below(nyc));

        // test etmek icin berlin1 webelementinin id attribute'nun degerine bakalim - pid7_thumb
        if (berlin1.getAttribute("id").equals("pid7_thumb")){
            System.out.println("Berlin1 Locate Test PASSED");
        } else {
            System.out.println("Berlin1 Locate Test FAILED");
        }

        // B)- tag'i img, Boston'in saginda
        WebElement boston = driver.findElement(By.id("pid6_thumb"));
        WebElement berlin2 = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(boston));

        if (berlin2.getAttribute("id").equals("pid7_thumb")){
            System.out.println("Berlin2 Locate Test PASSED");
        }else {
            System.out.println("Berlin2 Locate Test FAILED");
        }

        // C)- tag'i img, Sailor'in ustunde
        WebElement sailor = driver.findElement(By.id("pid11_thumb"));
        WebElement berlin3 = driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailor));

        if (berlin3.getAttribute("id").equals("pid7_thumb")){
            System.out.println("Berlin3 Locate Test PASSED");
        }else {
            System.out.println("Berlin3 Locate Test FAILED");
        }


        Thread.sleep(3000);
        driver.close();
    }
}
