package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HerokuAppMainPage;
import util.DriverFactory;
import util.JunitListener;
import util.NavigationTimeHelper;
import util.PropertyReader;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;

public class BaseTest {
    static PropertyReader propertyReader;
    private Logger LOGGER;

    public JunitListener junitListener;
    public WebDriver driver;
    public HerokuAppMainPage homePage;
    NavigationTimeHelper navigationTimeHelper;

    public BaseTest() {
        LOGGER = Logger.getLogger(BaseTest.class.getName());
        junitListener = new JunitListener();
        propertyReader = new PropertyReader();
        LOGGER.info("BaseTest completed");
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws MalformedURLException {
        LOGGER.info("SetUp");
        String browser = propertyReader.readProperty("browser");
        driver = DriverFactory.getDriver(browser);
        long implicitWait = Integer.parseInt(propertyReader.readProperty("implicitWaitInSeconds"));
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        junitListener.setDriver(driver);
        homePage = new HerokuAppMainPage(driver);
        loadUrl();
//        navigationTimeHelper = new NavigationTimeHelper(driver);
//        Map<String, Object> timings = navigationTimeHelper.getTimings();
////        Long loadTime = navigationTimeHelper.getdomLoading();
//
//        Long responseTime = navigationTimeHelper.getresponseEnd() - navigationTimeHelper.getresponseStart();
//        Long loadTime = navigationTimeHelper.getloadEventEnd() - navigationTimeHelper.getloadEventStart();
//        Long domContentLoadTime = navigationTimeHelper.getdomContentLoadedEventEnd() - navigationTimeHelper.getdomContentLoadedEventStart();
//        Long domLoad = navigationTimeHelper.getdomComplete() - navigationTimeHelper.getdomLoading();
//        Long sumpin = navigationTimeHelper.getredirectStart();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws InterruptedException {
        LOGGER.info("TearDown");
        sleep(5000);
//        driver.close();
        if (driver != null) {
            driver.quit();
        }
    }

    public void loadUrl() {
        URL baseUrl;
        HttpURLConnection connection = null;
        try {
            baseUrl = new URL(propertyReader.readProperty("url"));
            connection = (HttpURLConnection) baseUrl.openConnection();
            connection.connect();
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                LOGGER.severe("Unable to connect to the url connection");
                LOGGER.severe("Response Code " + connection.getResponseCode());
                LOGGER.severe("Response Message " + connection.getResponseMessage());
            }
            driver.get(propertyReader.readProperty("url"));
        } catch (IOException e) {
            LOGGER.severe("URL connection error");
            e.printStackTrace();
        }
    }
}
