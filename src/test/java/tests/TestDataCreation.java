package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestDataCreation {

    @Test
    public void CreatTestData() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        driver.navigate().to("http://accountsdemo.herokuapp.com");
        Cookie cookie = new Cookie("zaleniumMessage", "Go to home page");
        driver.manage().addCookie(cookie);

        cookie = new Cookie("zaleniumMessage", "Populate email field");
        driver.manage().addCookie(cookie);
        driver.findElement(By.id("user_email")).sendKeys("letslearnandshare@gmail.com");

        cookie = new Cookie("zaleniumMessage", "Populate pasword");
        driver.manage().addCookie(cookie);
        driver.findElement(By.id("user_password")).sendKeys("!abcd1234");

        cookie = new Cookie("zaleniumMessage", "Click commit button");
        driver.manage().addCookie(cookie);
        driver.findElement(By.name("commit")).click();

        cookie = new Cookie("zaleniumMessage", "Click Clients link");
        driver.manage().addCookie(cookie);
        driver.findElement(By.linkText("CLIENTS")).click();

        cookie = new Cookie("zaleniumMessage", "Type Thoughtworks");
        driver.manage().addCookie(cookie);
        driver.findElement(By.id("search")).sendKeys("Thoughtworks");

        cookie = new Cookie("zaleniumMessage", "Click Search button");
        driver.manage().addCookie(cookie);
        driver.findElement(By.className("searchBtn")).click();

        cookie = new Cookie("zaleniumMessage", "Click Select Client");
        driver.manage().addCookie(cookie);
        driver.findElement(By.linkText("Select Client")).click();

        cookie = new Cookie("zaleniumMessage", "Click Edit Clients Details");
        driver.manage().addCookie(cookie);
        driver.findElement(By.linkText("Edit Client Details")).click();

        cookie = new Cookie("zaleniumMessage", "Clear contact name field");
        driver.manage().addCookie(cookie);
        driver.findElement(By.id("client_contact_person_name")).clear();

        cookie = new Cookie("zaleniumMessage", "Populate contact name field");
        driver.manage().addCookie(cookie);
        driver.findElement(By.id("client_contact_person_name")).sendKeys("ThoughtworksNew");

        cookie = new Cookie("zaleniumMessage", "Clear contact address field");
        driver.manage().addCookie(cookie);
        driver.findElement(By.id("client_address")).clear();

        cookie = new Cookie("zaleniumMessage", "Populate contact address field");
        driver.manage().addCookie(cookie);
        driver.findElement(By.id("client_address")).sendKeys("twAddressNew");

        cookie = new Cookie("zaleniumMessage", "Clear commit button");
        driver.manage().addCookie(cookie);
        driver.findElement(By.name("commit")).click();

        cookie = new Cookie("zaleniumMessage", "Click logout button");
        driver.manage().addCookie(cookie);
        driver.findElement(By.cssSelector("span.glyphicon-log-out")).click();
        driver.quit();
    }
}
