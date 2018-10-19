package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormAuthentication;
import org.openqa.selenium.WebElement;
import java.util.List;


public class HerokuFormAuthenticationTests extends BaseTest {

    @Test(groups = {"Smoke", "Regression"})
    public void testLogin() {
        homePage.clickFormAuthenticationLink();
        FormAuthentication loginPage = new FormAuthentication(driver);
        loginPage.login(propertyReader.readProperty("username"), propertyReader.readProperty("password"));

        // Verify we're logged-in
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("secure"));

        List<WebElement> el = driver.findElements(By.xpath("//*"));
        int count=0;
        for ( WebElement e : el ) {
            System.out.println( e.getTagName()+"    "+e.getText());

            count++;

        }
        System.out.println(count );

        // Verify we're logged-out
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a/i")).click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("login"));
    }

    @Test(groups = {"Smoke", "Regression"})
    public void testLoginBadUsername() {
        homePage.clickFormAuthenticationLink();
        FormAuthentication loginPage = new FormAuthentication(driver);
        loginPage.login("user", propertyReader.readProperty("password"));

        // Verify we're not logged-in
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("login"));
        String msg = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
        Assert.assertTrue(msg.contains("Your username is invalid"));

    }

    @Test(groups = {"Smoke", "Regression"})
    public void testLoginBadPassword() {
        homePage.clickFormAuthenticationLink();
        FormAuthentication loginPage = new FormAuthentication(driver);
        loginPage.login(propertyReader.readProperty("username"), "password");

        // Verify we're not logged-in
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("login"));
        String msg = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
        Assert.assertTrue(msg.contains("Your password is invalid"));

    }
}
