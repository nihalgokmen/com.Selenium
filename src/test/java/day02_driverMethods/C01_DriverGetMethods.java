package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        // Sisteme webdriver'imizin ne olacagini ve bu driver'in hangi dosa yolunda oldugunu soyler

        WebDriver driver = new ChromeDriver();
        // PC'mizdeki Chrome browser'in otomasyonla calisacak bir kopyasini olusturur

        // Chrome disinda bir browser kullanmak istersek o browser'in driver'ini indirip
        // System.setProperty("Webdriver.safari.driver", "safari driver'in dosya yolu");

        // Olusrturdugumuz driver objesi bizim elimiz ve gozumuz gibidir.

        driver.get("https://www.amazon.com"); // Istenen url'e bizi goturur
        // www yazmasak da calisir ancak https:// yazmazsak calismaz

        System.out.println(driver.getTitle()); // bize title'i dondurur
        // Amazon.com. Spend less. Smile more.

        System.out.println(driver.getCurrentUrl()); // gidilen url'i dondurur
        // https://www.amazon.com/

        System.out.println(driver.getPageSource()); // gidilen web sayfasinin kaynak kodlarini dondurur

        System.out.println(driver.getWindowHandle()); // acilan her bir pencereye verilen unique hash code degeridir

        System.out.println(driver.getWindowHandles());
        // eger driver calsirken birden fazla pencere veya tab olusturduysa
        // acilan tum windows/tab'lerin unique hash code'larini bir set olarak dondurur

        Thread.sleep(3000); // mili saniye olarak yazdigimiz sayi suresince kodu bekletir
        driver.close(); // acilan browser'i kapatir



    }
}
