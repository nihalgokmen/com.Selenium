package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.ShadowRootType;

import java.time.Duration;

public class P02 {

    /*
            . .Exercise2...
        1-Driver oluşturalim
        2-Java class'imiza chnomedriver.exet i tanitalim
        3-Driver'in tum ekranı kaplamasini saglayalim
        4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        5-"https://www.otto.de” adresine gidelim
        6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        7-Title ve url inin "0TT0” kelimesinin içerip icermedigini kontrol edelim
        8-Ardindan "https://wisequarter.com/” adresine gidip
        9-BU adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
        10-Bir onceki web sayfamiza geri donelim
        11-Sayfayı yenileyelim
        12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */

    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.otto.de");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();

        if (title.contains("OTTO") && url.contains("OTTO")){
            System.out.println("OTTO icerir, Test PASSED");
        }else {
            System.out.println("OTTO içermez, Test FAILED");
        }

        driver.navigate().to("https://wisequarter.com/");

        String wiseTitle = driver.getTitle();

        boolean isTrue = wiseTitle.contains("Quarter");
        if (isTrue){
            System.out.println("Title Quarter icerir, Test PASSED");
        }else {
            System.out.println("Title Quarter içermez, Test FAILED");
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().back();
        driver.close();






    }
}
