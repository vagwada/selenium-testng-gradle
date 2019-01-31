package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LargeDeepDom;
import java.util.List;
import org.apache.commons.lang.time.StopWatch;

public class LargeDeepDomTests extends BaseTest {

    @Test(enabled = false)
    public void WalkDomTree(){
        homePage.clickLargeDeepDomLink();
        LargeDeepDom page = new LargeDeepDom(driver);
        page.verifyPageLoaded();
        List<WebElement> divList = driver.findElements(By.cssSelector("[id=\"sibling-7\\.1\"]"));
        List<WebElement> allDivs = driver.findElements(By.xpath("//div[contains(@id, 'sibling')]"));
        Assert.assertTrue(divList.size() > 0);
        Assert.assertTrue(allDivs.size() > 2);
    }

    @Test  
    public void ParseTable(){
        homePage.clickLargeDeepDomLink();
        LargeDeepDom page = new LargeDeepDom(driver);
        page.verifyPageLoaded();
              //To locate table.
        WebElement myTable = driver.findElement(By.xpath("//table[contains(@id, 'large-table')]"));

        //To locate rows of table.
        List < WebElement > rows_table = myTable.findElements(By.tagName("tr"));

        //To calculate no of rows In table.
        int rows_count = rows_table.size();

        //Loop will execute for all the rows of the table
        ParseTable(rows_table, rows_count);
    }

    static void ParseTable(List<WebElement> rows_table, int rows_count) {

        StopWatch watch = new StopWatch();
        watch.start();

        for (int row = 0; row < rows_count; row++) {

            //To locate columns(cells) of that specific row.
            List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));

            //To calculate no of columns(cells) In that specific row.
            int columns_count = Columns_row.size();
            System.out.println("Number of cells In Row " + row + " are " + columns_count);

            //Loop will execute till the last cell of that specific row.
            for (int column = 0; column < columns_count; column++) {
                //To retrieve text from the cells.
                String celltext = Columns_row.get(column).getText();
                System.out.println("Cell Value Of row number " + row + " and column number " + column + " Is " + celltext);
            }
        }

        watch.stop();
        System.out.println("Time Elapsed: " + watch.getTime()/1000 + " seconds."); // Prints: Time Elapsed: 2501
    }
}
