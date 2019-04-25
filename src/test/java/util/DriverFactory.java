package util;

import com.machinepublishers.jbrowserdriver.JBrowserDriver;
import com.machinepublishers.jbrowserdriver.Settings;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.DriverManagerType.*;
import static io.github.bonigarcia.wdm.DriverManagerType.FIREFOX;

public class DriverFactory {
  /**/

    private static WebDriver driver;

//    public static WebDriver getDriver() {
//        return driver;
//    }

    public static void setDriver(WebDriver driver) {
        DriverFactory.driver = driver;
    }

    public static WebDriver getDriver(String browser) throws MalformedURLException {

        switch (browser) {
            case "remote":
                DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
                desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
                desiredCapabilities.setCapability("screenResolution", "1280x720");
                URL seleniumUrl = new URL("http://localhost:4444/wd/hub");
                URL remoteUrl = new URL("http://csc2cxn00001139.cloud.kp.org:4444/wd/hub");
//                driver = new RemoteWebDriver(remoteUrl, desiredCapabilities);
                driver = new RemoteWebDriver(seleniumUrl, desiredCapabilities);
                break;
            case "chrome":
                WebDriverManager.getInstance(CHROME).setup();
                driver = new ChromeDriver();
                break;
            case "chromeHeadless":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
//                options.addArguments("--disable-gpu");
//                options.addArguments("--remote-debugging-port=9222");
                WebDriverManager.getInstance(CHROME).setup();
                driver = new ChromeDriver(options);
                break;
            case "ie":
                WebDriverManager.getInstance(IEXPLORER).setup();
                InternetExplorerOptions caps = new InternetExplorerOptions();
                caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true); //disable protected mode settings
                caps.setCapability("initialBrowserUrl", "www.google.com");
                caps.setCapability("ignoreZoomSetting", true);
                driver = new InternetExplorerDriver(caps);
                break;
            case "edge":
                WebDriverManager.getInstance(EDGE).setup();
                driver = new EdgeDriver();
                break;
            case "opera":
                WebDriverManager.getInstance(OPERA).setup();
                driver = new OperaDriver();
                break;
            case "firefox":
                WebDriverManager.getInstance(FIREFOX).setup();
                driver = new FirefoxDriver();
                break;
            case "firefoxHeadless":
                FirefoxOptions ffoptions = new FirefoxOptions();
                ffoptions.setHeadless(true);
                WebDriverManager.getInstance(FIREFOX).setup();
                driver = new FirefoxDriver(ffoptions);
                break;
            case "jbrowserdriver":
                Capabilities capabilities = Settings.builder()
                        .buildCapabilities();
                driver = new JBrowserDriver(capabilities);
                break;
            default:
                throw new WebDriverException();
        }

        return driver;
    }
}
