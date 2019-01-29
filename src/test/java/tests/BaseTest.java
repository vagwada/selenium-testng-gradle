package tests;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HerokuAppMainPage;
import util.JunitListener;
import util.PropertyReader;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;

public class BaseTest {
    public static PropertyReader propertyReader;
    private static Logger LOGGER = null;

    public JunitListener junitListener;
    public WebDriver driver;
    public HerokuAppMainPage homePage;

    public BaseTest() {
        junitListener = new JunitListener();
        propertyReader = new PropertyReader();
//        LOGGER = LogManager.getLogger(BaseTest.class);
//        LOGGER.info("BaseTest completed");
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws MalformedURLException {
//        LOGGER.info("SetUp");
        setDriver();
        junitListener.setDriver(driver);
        homePage = new HerokuAppMainPage(driver);
        loadUrl();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws InterruptedException {
//        LOGGER.info("TearDown");
        sleep(5000);
//        driver.close();
//        if (driver != null) {
////            driver.quit();
//        }
    }

    public void setDriver() throws MalformedURLException {
        String browser = propertyReader.readProperty("browser");
        long implicitWait = Integer.parseInt(propertyReader.readProperty("implicitWaitInSeconds"));
        switch (browser) {
            case "remote":
                DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
                desiredCapabilities.setCapability(CapabilityType.PLATFORM, Platform.LINUX);
                desiredCapabilities.setCapability("screenResolution", "1280x720");
                URL seleniumUrl = new URL("http://localhost:4444/wd/hub");
                URL remoteUrl = new URL("http://csc2cxn00001139.cloud.kp.org:4444/wd/hub");
//                driver = new RemoteWebDriver(remoteUrl, desiredCapabilities);
                driver = new RemoteWebDriver(seleniumUrl, desiredCapabilities);
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", propertyReader.readProperty("macChromeDriver"));
                driver = new ChromeDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.firefox.driver", propertyReader.readProperty("winFirefoxDriver"));
                driver = new FirefoxDriver();
                break;
            default:
                throw new WebDriverException();
        }
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
    }

    public void loadUrl() {
        URL baseUrl;
        HttpURLConnection connection = null;
        try {
            baseUrl = new URL(propertyReader.readProperty("url"));
            connection = (HttpURLConnection) baseUrl.openConnection();
            connection.connect();
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
//                LOGGER.error("Unable to connect to the url connection");
//                LOGGER.error("Response Code " + connection.getResponseCode());
//                LOGGER.error("Response Message " + connection.getResponseMessage());
            }
            driver.get(propertyReader.readProperty("url"));
        } catch (IOException e) {
//            LOGGER.error("URL connection error");
            e.printStackTrace();
        }
    }
}
