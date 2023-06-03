package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locator_findElement {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon ana sayfaya gidin
        driver.get("https://www.amazon.com");

        // arama cubuguna nutella yazdirip
        /*
            Test otomasyonu yaparken bir web elementi kullanmak istersek 2 seye ihtiyacimiz var;
            1- o webelementi benzersiz olarak tarif edebilecegimiz bir locator
            2- bu locator'i soyledigimizde bize webelementi bulup getirecek method

            Ornegin; amazon sitesindeki arama kutusunun unique tarif edicisi olarak
            id = "twotabsearchtextbox" kullanabiliriz
         */

        WebElement aramaCubuguElementi = driver.findElement(By.id("twotabsearchtextbox"));
      //data turu      objenin adi     = findElement : webelementi bulan method
      //                                          by : webelemeti bulacagimiz locator'un turunu yazdigimz method
      //                         twotabsearchtextbox : unique unique tarif icin id attribute degeri

        /*

         */

        aramaCubuguElementi.sendKeys("Nutella");
        // istenen webelement'e istenen yaziyi gonderir

        // enter tusuna basarak arama yapin
        aramaCubuguElementi.submit();
        // istenen webelementi uzerinde enter tusuna basar


        Thread.sleep(5000);
        driver.close();
    }
}
