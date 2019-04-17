package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import util.NavigationTimeHelper;
import java.util.Map;
import java.util.logging.Logger;

public class HerokuMainPageTests extends BaseTest {

    private static Logger LOGGER = Logger.getLogger("HerokuMainPageTests.class");

    @Test(groups = {"Smoke"})
    public void testAbTestingLink() {
        homePage.clickAbTestingLink();
        String currentUrl = driver.getCurrentUrl();
        navigationTimeHelper = new NavigationTimeHelper(driver);
        Map<String, Object> timings = navigationTimeHelper.getTimings();
        printTimings(navigationTimeHelper, currentUrl);
        Assert.assertTrue(currentUrl.contains("abtest"));
    }

    @Test(groups = {"Smoke"})
    public void testBrokenImagesLink() {
        homePage.clickBrokenImagesLink();
        String currentUrl = driver.getCurrentUrl();
        navigationTimeHelper = new NavigationTimeHelper(driver);
        Map<String, Object> timings = navigationTimeHelper.getTimings();
        printTimings(navigationTimeHelper, currentUrl);
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
        navigationTimeHelper = new NavigationTimeHelper(driver);
        Map<String, Object> timings = navigationTimeHelper.getTimings();
        printTimings(navigationTimeHelper, currentUrl);
        Assert.assertTrue(currentUrl.contains("checkboxes"));
    }

    @Test(groups = {"Smoke"})
    public void testContextMenuLink() {
        homePage.clickContextMenuLink();
        String currentUrl = driver.getCurrentUrl();
        navigationTimeHelper = new NavigationTimeHelper(driver);
        Map<String, Object> timings = navigationTimeHelper.getTimings();
        printTimings(navigationTimeHelper, currentUrl);
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
        navigationTimeHelper = new NavigationTimeHelper(driver);
        Map<String, Object> timings = navigationTimeHelper.getTimings();
        printTimings(navigationTimeHelper, currentUrl);
        Assert.assertTrue(currentUrl.contains("drag_and_drop"));
    }

    @Test(groups = {"Smoke"})
    public void testDropdownLink() {
        homePage.clickDropdownLink();
        String currentUrl = driver.getCurrentUrl();
        navigationTimeHelper = new NavigationTimeHelper(driver);
        Map<String, Object> timings = navigationTimeHelper.getTimings();
        printTimings(navigationTimeHelper, currentUrl);
        Assert.assertTrue(currentUrl.contains("dropdown"));
    }

    @Test(groups = {"Smoke"})
    public void testDynamicContentLink() {
        homePage.clickDynamicContentLink();
        String currentUrl = driver.getCurrentUrl();
        navigationTimeHelper = new NavigationTimeHelper(driver);
        Map<String, Object> timings = navigationTimeHelper.getTimings();
        printTimings(navigationTimeHelper, currentUrl);
        Assert.assertTrue(currentUrl.contains("dynamic_content"));
    }

    @Test(groups = {"Smoke"})
    public void testDynamicControlsLink() {
        homePage.clickDynamicControlsLink();
        String currentUrl = driver.getCurrentUrl();
        navigationTimeHelper = new NavigationTimeHelper(driver);
        Map<String, Object> timings = navigationTimeHelper.getTimings();
        printTimings(navigationTimeHelper, currentUrl);
        Assert.assertTrue(currentUrl.contains("dynamic_controls"));
    }

    @Test(groups = {"Smoke"})
    public void testDynamicLoadingLink() {
        homePage.clickDynamicLoadingLink();
        String currentUrl = driver.getCurrentUrl();
        navigationTimeHelper = new NavigationTimeHelper(driver);
        Map<String, Object> timings = navigationTimeHelper.getTimings();
        printTimings(navigationTimeHelper, currentUrl);
        Assert.assertTrue(currentUrl.contains("dynamic_loading"));
    }

    @Test(groups = {"Smoke"})
    public void testclickExitIntentLink() {
        homePage.clickExitIntentLink();
        String currentUrl = driver.getCurrentUrl();
        navigationTimeHelper = new NavigationTimeHelper(driver);
        Map<String, Object> timings = navigationTimeHelper.getTimings();
        printTimings(navigationTimeHelper, currentUrl);
        Assert.assertTrue(currentUrl.contains("exit_intent"));
    }

    @Test(groups = {"Smoke"})
    public void testFileDownloadLink() {
        homePage.clickFileDownloadLink();
        String currentUrl = driver.getCurrentUrl();
        navigationTimeHelper = new NavigationTimeHelper(driver);
        Map<String, Object> timings = navigationTimeHelper.getTimings();
        printTimings(navigationTimeHelper, currentUrl);
        Assert.assertTrue(currentUrl.contains("download"));
    }

    @Test(groups = {"Smoke"})
    public void testFileUploadLink() {
        homePage.clickFileUploadLink();
        String currentUrl = driver.getCurrentUrl();
        navigationTimeHelper = new NavigationTimeHelper(driver);
        Map<String, Object> timings = navigationTimeHelper.getTimings();
        printTimings(navigationTimeHelper, currentUrl);
        Assert.assertTrue(currentUrl.contains("upload"));

    }

    @Test(groups = {"Smoke"})
    public void testFloatingMenuLink() {
        homePage.clickFloatingMenuLink();
        String currentUrl = driver.getCurrentUrl();
        navigationTimeHelper = new NavigationTimeHelper(driver);
        Map<String, Object> timings = navigationTimeHelper.getTimings();
        printTimings(navigationTimeHelper, currentUrl);
        Assert.assertTrue(currentUrl.contains("floating_menu"));

    }

    @Test(groups = {"Smoke"})
    public void testForgotPasswordLink() {
        homePage.clickForgotPasswordLink();
        String currentUrl = driver.getCurrentUrl();
        navigationTimeHelper = new NavigationTimeHelper(driver);
        Map<String, Object> timings = navigationTimeHelper.getTimings();
        printTimings(navigationTimeHelper, currentUrl);
        Assert.assertTrue(currentUrl.contains("forgot_password"));

    }

    @Test(groups = {"Smoke"})
    public void testAuthenticationFormLink() {
        homePage.clickFormAuthenticationLink();
        String currentUrl = driver.getCurrentUrl();
        navigationTimeHelper = new NavigationTimeHelper(driver);
        Map<String, Object> timings = navigationTimeHelper.getTimings();
        printTimings(navigationTimeHelper, currentUrl);
        Assert.assertTrue(currentUrl.contains("login"));

    }

    private void printTimings(NavigationTimeHelper navigationTimeHelper, String pageName) {
        String logString = "\nPAGE TIMING STATS";
        //        Long loadTime = navigationTimeHelper.getdomLoading();
        Long responseTime = navigationTimeHelper.getresponseEnd() - navigationTimeHelper.getresponseStart();
        Long loadTime = navigationTimeHelper.getloadEventEnd() - navigationTimeHelper.getloadEventStart();
        Long domContentLoadTime = navigationTimeHelper.getdomContentLoadedEventEnd() - navigationTimeHelper.getdomContentLoadedEventStart();
        Long domLoad = navigationTimeHelper.getdomComplete() - navigationTimeHelper.getdomLoading();
        Long sumpin = navigationTimeHelper.getredirectStart();

        logString  = String.format("Page Name: %s\n Response Time: %s\n Load Time: %s\n " +
                "DOM Content Load Time: %s\n DOM Load Time: %s\n Redirect Start: %s",
                pageName, responseTime, loadTime, domContentLoadTime, domLoad, sumpin);

        LOGGER.info(logString);
    }


}
