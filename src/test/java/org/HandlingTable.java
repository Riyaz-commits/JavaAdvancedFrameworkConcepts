package org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Collectors;

public class HandlingTable {


    @Test
    public void testTabelMinval() throws IOException, InterruptedException {
        Properties prop = new Properties();

        ChromeOptions handlingSSL = new ChromeOptions();

        //Using the accept insecure cert method with true as parameter to accept the untrusted certificate
        handlingSSL.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(handlingSSL);
        driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table-price.html");

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='prods']//tr"));
                   Optional<List<WebElement>> op=    rows.stream().skip(1).map(tr->tr.findElements(By.tagName("td")))
                               .min(Comparator.comparing(e->Integer.parseInt(e.get(2).getText())));

                   if (op.isPresent())
                   {
                       List<WebElement> cells= op.get();
                       System.out.println(cells.get(2).getText());
                       Thread.sleep(2000);
                       cells.get(3).findElement(By.tagName("input")).click();
                       driver.findElement(By.xpath("//input[@value=' Verify ']")).click();
                  String Result=     driver.findElement(By.xpath("//td[@id='status']")).getText();
                  if (Result.equalsIgnoreCase("PASS"))
                      System.out.println("It fetched the correct Minimum value from the table");

                   }
    }
}