package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04 {

    /*
        Navigate to website https://testpages.herokuapp.com/styled/index.html
        Under the ORIGINAL CONTENTS
        click on Alerts
        print the URL
        navigate back
        print the URL
        Click on Basic Ajax
        print the URL
        enter value 20 and ENTER
        and then verify Submitted Values is displayed open page
        close driver
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testpages.herokuapp.com/styled/index.html");

    }
}
