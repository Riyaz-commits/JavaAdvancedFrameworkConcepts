package orgs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

public class DesignPatterns {

    @Test
    public void DesignLaunch() throws IOException, InterruptedException {


        ChromeOptions handlingSSL = new ChromeOptions();

        //Using the accept insecure cert method with true as parameter to accept the untrusted certificate
        //  handlingSSL.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium webdriver java");
        int suggest = driver.findElements(By.xpath("//li[@role='presentation']")).size();
        Thread.sleep(5000);
        System.out.println(suggest);
        int number = 3;
        for (int i = 0; i < suggest; i++) {
            if (i == number) {
                driver.findElement(By.xpath("//li[@role='presentation']")).click();
          String searchlks=      driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
                System.out.println(searchlks);

            }
        }
    }
}