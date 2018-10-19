package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ChallengingDom;

import java.util.List;

public class HerokuChallengingDomTests extends BaseTest{

    @Test(groups = {"Regression"} )
    public void testTableHandling()  {

        homePage.clickChallengingDomLink();
        ChallengingDom ChallengingDomPage = new ChallengingDom(driver);

        //To locate table.
        WebElement mytable = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table"));

        //To locate rows of table.
        List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));

        //To calculate no of rows In table.
        int rows_count = rows_table.size();


        //Loop will execute for all the rows of the table
        LargeDeepDomTests.ParseTable(rows_table, rows_count);
    }
}
