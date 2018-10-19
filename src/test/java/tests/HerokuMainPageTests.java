package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HerokuMainPageTests extends BaseTest {

    @Test(groups = {"Smoke"})
    public void testAbTestingLink() {
        homePage.clickAbTestingLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("abtest"));
    }

    @Test(groups = {"Smoke"})
    public void testBrokenImagesLink() {
        homePage.clickBrokenImagesLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("broken_images"));
    }

//    @Test(groups = {"Smoke"})
//    public void testChallengingDomLink() {
//        homePage.clickChallengingDomLink();
//        String currentUrl = driver.getCurrentUrl();
//        Assert.assertTrue(currentUrl.contains("challenging_dom"));
//    }

    @Test(groups = {"Smoke"})
    public void testCheckboxesLink() {
        homePage.clickCheckboxesLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("checkboxes"));
    }

    @Test(groups = {"Smoke"})
    public void testContextMenuLink() {
        homePage.clickContextMenuLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("context_menu"));
    }

    @Test(groups = {"Smoke"})
    public void testDisappearingElementsLink() {
        homePage.clickDisappearingElementsLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("disappearing_elements"));
    }

    @Test(groups = {"Smoke"})
    public void testDragAndDropLink() {
        homePage.clickDragAndDropLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("drag_and_drop"));
    }

    @Test(groups = {"Smoke"})
    public void testDropdownLink() {
        homePage.clickDropdownLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dropdown"));
    }

    @Test(groups = {"Smoke"})
    public void testDynamicContentLink() {
        homePage.clickDynamicContentLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dynamic_content"));
    }

    @Test(groups = {"Smoke"})
    public void testDynamicControlsLink() {
        homePage.clickDynamicControlsLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dynamic_controls"));
    }

    @Test(groups = {"Smoke"})
    public void testDynamicLoadingLink() {
        homePage.clickDynamicLoadingLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dynamic_loading"));
    }

    @Test(groups = {"Smoke"})
    public void testclickExitIntentLink() {
        homePage.clickExitIntentLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("exit_intent"));
    }

    @Test(groups = {"Smoke"})
    public void testFileDownloadLink() {
        homePage.clickFileDownloadLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("download"));
    }

    @Test(groups = {"Smoke"})
    public void testFileUploadLink() {
        homePage.clickFileUploadLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("upload"));

    }

    @Test(groups = {"Smoke"})
    public void testFloatingMenuLink() {
        homePage.clickFloatingMenuLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("floating_menu"));

    }

    @Test(groups = {"Smoke"})
    public void testForgotPasswordLink() {
        homePage.clickForgotPasswordLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("forgot_password"));

    }

    @Test(groups = {"Smoke"})
    public void testAuthenticationFormLink() {
        homePage.clickFormAuthenticationLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("login"));

    }


}
