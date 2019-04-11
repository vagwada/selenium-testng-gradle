package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class NavigationTimeHelper {
    private WebDriver driver = null;
    Map<String, Object> timings = null;
    private final String JavaScriptForPerformance = "var performance = window.performance || window.webkitPerformance || window.mozPerformance || window.msPerformance || {};var timings = performance.timing || {};return timings;";

    public NavigationTimeHelper (WebDriver adriver){
        this.driver = adriver;
        getAllTiming();
    }

    private void getAllTiming(){
        JavascriptExecutor jsrunner = (JavascriptExecutor) driver;
        timings = (Map<String, Object>) jsrunner.executeScript(JavaScriptForPerformance);
    }

    public Map<String, Object> getTimings() {
//        timings == null ? getAllTiming() :
        return timings;
    }

    private Long getTime(String name){        return (Long)timings.get((Object)name);     }
    public Long getnavigationStart(){        return getTime("navigationStart");    }
    public Long getunloadEventStart(){        return getTime("unloadEventStart");    }
    public Long getunloadEventEnd(){        return getTime("unloadEventEnd");    }
    public Long getredirectStart(){        return getTime("redirectStart");    }
    public Long getredirectEnd(){        return getTime("redirectEnd");    }
    public Long getfetchStart(){        return getTime("fetchStart");    }
    public Long getdomainLookupStart(){        return getTime("domainLookupStart");    }
    public Long getdomainLookupEnd(){        return getTime("domainLookupEnd");    }
    public Long getconnectStart(){        return getTime("connectStart");    }
    public Long getconnectEnd(){        return getTime("connectEnd");    }
    public Long getsecureConnectionStart(){        return getTime("secureConnectionStart");    }
    public Long getrequestStart(){        return getTime("requestStart");    }
    public Long getresponseStart(){        return getTime("responseStart");    }
    public Long getresponseEnd(){        return getTime("responseEnd");    }
    public Long getdomLoading(){        return getTime("domLoading");    }
    public Long getdomInteractive(){        return getTime("domInteractive");    }
    public Long getdomContentLoadedEventStart(){        return getTime("domContentLoadedEventStart");    }
    public Long getdomContentLoadedEventEnd(){        return getTime("domContentLoadedEventEnd");    }
    public Long getdomComplete(){        return getTime("domComplete");    }
    public Long getloadEventStart(){        return getTime("loadEventStart");    }
    public Long getloadEventEnd(){        return getTime("loadEventEnd");    }
}
