package Gurulogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class bothIncorrect {
    @Test
    public void login_bothincorrect() throws InterruptedException
    {
        System.setProperty("webdriver.msedge.driver", "C:\\Users\\Deepa Deva\\msedgedriverr.exe");

        WebDriver driver = new EdgeDriver();


        driver.get("https://demo.guru99.com/test/login.html");


        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.name("passwd"));
        email.sendKeys("deepamagi@gmail.com");
        Thread.sleep(2000);
        password.sendKeys("abc123**");
        Thread.sleep(2000);
        WebElement login = driver.findElement(By.id("SubmitLogin"));
        login.click();
        //driver.close();

    }


}


