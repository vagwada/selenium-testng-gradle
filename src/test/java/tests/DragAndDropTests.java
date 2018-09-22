package tests;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragAndDrop;

public class DragAndDropTests extends BaseTest{

    DragAndDrop dragDropPage;

    @Test
    public void DragColumnAtoB(){
        homePage.clickDragAndDropLink();
        dragDropPage = new DragAndDrop(driver);

//        WebElement From = dragDropPage.GetColumnA();
//        WebElement To = dragDropPage.GetColumnB();

        //Element which needs to drag.
        WebElement From=driver.findElement(By.id("column-a"));

        //Element on which need to drop.
        WebElement To=driver.findElement(By.xpath("column-b"));

        //Using Action class for drag and drop.
        Actions act=new Actions(driver);

        //Dragged and dropped.
        act.dragAndDrop(From, To).build().perform();
        String columnAText = From.getText();
        String columnBText = To.getText();

        Assert.assertEquals("B", columnAText);
        Assert.assertEquals("A", columnBText);

    }
}
