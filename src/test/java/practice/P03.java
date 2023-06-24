package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {

       /* ...Exercise3...
        Navigate to  https://testpages.herokuapp.com/styled/index.html
        Click on  Calculater under Micro Apps
        Type any number in the first input
        Type any number in the second input
        Click on Calculate
        Get the result
        Print the result
      */

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.id("calculatetest")).click();

        driver.findElement(By.id("number1")).sendKeys("13");

        driver.findElement(By.id("number2")).sendKeys("7");

        driver.findElement(By.id("calculate")).click();

        WebElement result = driver.findElement(By.xpath("//*[@id='answer']"));
        String strResult = driver.findElement(By.xpath("//*[@id='answer']")).getText();

        System.out.println("Result : " + strResult);

        driver.close();
    }
}
