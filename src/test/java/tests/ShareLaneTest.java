package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShareLaneTest {
    //1.Open browser, site https://www.sharelane.com/cgi-bin/register.py
    //2.Enter value in ZIP code field
    //3. Click 'Continue' button

    @Test
    public void fillZipcodeFieldTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("22222");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();

        driver.findElement(By.name("first_name")).sendKeys("Anastasiya");
        driver.findElement(By.name("last_name")).sendKeys("Shevtsova");
        driver.findElement(By.name("email")).sendKeys("ashevtsova888@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("123456789");
        driver.findElement(By.name("password2")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@value='Register']")).click();

        WebDriver driverEmpty = new ChromeDriver();
        driverEmpty.get("https://www.sharelane.com/cgi-bin/register.py");
        driverEmpty.findElement(By.name("zip_code")).sendKeys("11111");
        driverEmpty.findElement(By.xpath("//*[@value='Continue']")).click();
        driverEmpty.findElement(By.xpath("//*[@value='Register']")).click();

    }
}

