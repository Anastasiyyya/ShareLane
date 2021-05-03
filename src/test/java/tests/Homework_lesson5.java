package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Homework_lesson5 {

    @Test
    public void clickRegister(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("9999");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();

        driver.findElement(By.name("first_name")).sendKeys("Anastasiya");
        driver.findElement(By.name("last_name")).sendKeys("S");
        driver.findElement(By.name("email")).sendKeys("a@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("123456789");
        driver.findElement(By.name("password2")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@value='Register']")).click();

        driver.quit();

    }

    @Test
    public void EmptyName(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("100000");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();

        driver.findElement(By.name("first_name")).sendKeys(" ");
        driver.findElement(By.name("last_name")).sendKeys(" ");
        driver.findElement(By.name("email")).sendKeys("a@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("123456789");
        driver.findElement(By.name("password2")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@value='Register']")).click();

        driver.quit();
    }

    @Test
    public void checkEmail(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("100000");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();

        driver.findElement(By.name("first_name")).sendKeys("Anastasiya");
        driver.findElement(By.name("last_name")).sendKeys("S");
        driver.findElement(By.name("email")).sendKeys("@");
        driver.findElement(By.name("password1")).sendKeys("123456789");
        driver.findElement(By.name("password2")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@value='Register']")).click();

        driver.quit();
    }


    @Test
    public void differentPasswordsTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("100000");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();

        driver.findElement(By.name("first_name")).sendKeys("Anastasiya");
        driver.findElement(By.name("last_name")).sendKeys("S");
        driver.findElement(By.name("email")).sendKeys("a@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("123");
        driver.findElement(By.name("password2")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@value='Register']")).click();

        driver.quit();

    }

    @Test
    public void FieldZipCodeTest() {
        int number;
        do {
            number = (int) (Math.random() * 100000);
        } while (number <= 9999);
        String numberStr = Integer.toString(number);

        System.out.println(number);

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys(numberStr);
        driver.findElement(By.xpath("//*[@value='Continue']")).click();

        driver.quit();
    }
}


