package pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='/intl/en/about/?fg=1&utm_source=google.com&utm_medium=referral&utm_campaign=hp-header']")
    @CacheLookup
    private WebElement about;

    @FindBy(id = "gb192")
    @CacheLookup
    private WebElement account;

    @FindBy(css = "a.gb_ta.gb_2f")
    @CacheLookup
    private WebElement addAShortcut;

    @FindBy(css = "a.gb_za.gb_Xf.gb_Le.gb_Eb")
    @CacheLookup
    private WebElement addAccount;

    @FindBy(css = "a[href='/advanced_search?hl=en&fg=1']")
    @CacheLookup
    private WebElement advancedSearch;

    @FindBy(css = "a[href='https://www.google.com/intl/en_us/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1']")
    @CacheLookup
    private WebElement advertising;

    @FindBy(css = "a.gb_2b.gb_6a")
    @CacheLookup
    private WebElement allYourBrandAccounts;

    @FindBy(id = "gb30")
    @CacheLookup
    private WebElement blogger;

    @FindBy(id = "gb10")
    @CacheLookup
    private WebElement books;

    @FindBy(css = "a[href='https://www.google.com/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpbfooter&fg=1']")
    @CacheLookup
    private WebElement business;

    @FindBy(id = "gb24")
    @CacheLookup
    private WebElement calendar;

    @FindBy(css = "a.gb_xb.gb_2f.gb_zb")
    @CacheLookup
    private WebElement change;

    @FindBy(id = "gb265")
    @CacheLookup
    private WebElement classroom;

    @FindBy(id = "gb53")
    @CacheLookup
    private WebElement contacts;

    @FindBy(id = "gb25")
    @CacheLookup
    private WebElement docs;

    @FindBy(id = "gb49")
    @CacheLookup
    private WebElement drive;

    @FindBy(id = "gb429")
    @CacheLookup
    private WebElement earth;

    @FindBy(css = "a.gb_fa.gb_Wf")
    @CacheLookup
    private WebElement evenMoreFromGoogle;

    @FindBy(id = "gb27")
    @CacheLookup
    private WebElement finance;

    @FindBy(css = "#gbw div div.gb_ib.gb_Ng.gb_R.gb_Mg.gb_Qg.gb_Kf div:nth-of-type(1) div:nth-of-type(1) a.gb_P")
    @CacheLookup
    private WebElement gmail1;

    @FindBy(id = "gb23")
    @CacheLookup
    private WebElement gmail2;

    @FindBy(id = "gb119")
    @CacheLookup
    private WebElement google1;

    @FindBy(id = "logo")
    @CacheLookup
    private WebElement google2;

    @FindBy(css = "a.gb_za.gb_Zf.gbp1.gb_Le.gb_Eb")
    @CacheLookup
    private WebElement googleAccount;

    @FindBy(css = "#gbw div div.gb_ib.gb_Ng.gb_R.gb_Mg.gb_Qg.gb_Kf div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(2) div:nth-of-type(1) div.gb_yb div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement googleProfile;

    @FindBy(name = "btnK")
    @CacheLookup
    private WebElement googleSearch;

    @FindBy(id = "gb300")
    @CacheLookup
    private WebElement hangouts;

    @FindBy(css = "#chm div:nth-of-type(2) div:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement help;

    @FindBy(css = "a[href='//myactivity.google.com/product/search?utm_source=google&hl=en&fg=1']")
    @CacheLookup
    private WebElement history;

    @FindBy(id = "gbqfbb")
    @CacheLookup
    private WebElement imFeelingLucky;

    @FindBy(css = "a[href='https://www.google.com/imghp?hl=en&tab=wi&authuser=0']")
    @CacheLookup
    private WebElement images;

    @FindBy(id = "gb136")
    @CacheLookup
    private WebElement keep;

    @FindBy(css = "a[href='//support.google.com/websearch/answer/186645?hl=en']")
    @CacheLookup
    private WebElement learnMore;

    @FindBy(id = "gb8")
    @CacheLookup
    private WebElement maps;

    @FindBy(css = "a.gb_ea.gb_2f")
    @CacheLookup
    private WebElement more;

    @FindBy(id = "gb260")
    @CacheLookup
    private WebElement myBusiness;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    @FindBy(id = "gb5")
    @CacheLookup
    private WebElement news;

    private final String pageLoadedText = "";

    private final String pageUrl = "/";

    @FindBy(id = "gb31")
    @CacheLookup
    private WebElement photos;

    @FindBy(id = "gb78")
    @CacheLookup
    private WebElement play;

    @FindBy(css = "a[href='https://myaccount.google.com/privacypolicy']")
    @CacheLookup
    private WebElement privacy1;

    @FindBy(css = "a[href='//www.google.com/intl/en_us/policies/privacy/?fg=1']")
    @CacheLookup
    private WebElement privacy2;

    @FindBy(id = "sbfblt")
    @CacheLookup
    private WebElement reportInappropriatePredictions;

    @FindBy(css = "#chm div:nth-of-type(2) div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement restartListening;

    @FindBy(id = "lst-ib")
    @CacheLookup
    private WebElement restartListeninghelphotwordDetectionIsOff1;

    @FindBy(id = "gs_taif0")
    @CacheLookup
    private WebElement restartListeninghelphotwordDetectionIsOff2;

    @FindBy(id = "gs_htif0")
    @CacheLookup
    private WebElement restartListeninghelphotwordDetectionIsOff3;

    @FindBy(id = "gb1")
    @CacheLookup
    private WebElement search;

    @FindBy(css = "a[href='//support.google.com/websearch/?p=ws_results_help&hl=en&fg=1']")
    @CacheLookup
    private WebElement searchHelp;

    @FindBy(css = "a[href='https://www.google.com/preferences?hl=en&fg=1']")
    @CacheLookup
    private WebElement searchSettings;

    @FindBy(id = "dk2qOd")
    @CacheLookup
    private WebElement sendFeedback;

    @FindBy(id = "fsettl")
    @CacheLookup
    private WebElement settings;

    @FindBy(id = "gb6")
    @CacheLookup
    private WebElement shopping;

    @FindBy(id = "gb_71")
    @CacheLookup
    private WebElement signOut;

    @FindBy(css = "#chm div:nth-of-type(3) div a")
    @CacheLookup
    private WebElement startListeningForOkGoogle;

    @FindBy(css = "a[href='https://store.google.com/?utm_source=hp_header&utm_medium=google_oo&utm_campaign=GS100042']")
    @CacheLookup
    private WebElement store;

    @FindBy(css = "a[href='//www.google.com/intl/en_us/policies/terms/?fg=1']")
    @CacheLookup
    private WebElement terms;

    @FindBy(id = "gb51")
    @CacheLookup
    private WebElement translate;

    @FindBy(css = "a.gb_Ob.gb_Vb")
    @CacheLookup
    private WebElement vinceAgwadavinceagwadagmailComDefault;

    @FindBy(css = "a[href='https://www.google.com/webhp?authuser=1']")
    @CacheLookup
    private WebElement vinceAutomationautomationvincegmailCom;

    @FindBy(id = "gb36")
    @CacheLookup
    private WebElement youtube;

    public GoogleSearchPage() {
    }

    public GoogleSearchPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public GoogleSearchPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public GoogleSearchPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on Account Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickAccountLink() {
        account.click();
        return this;
    }

    /**
     * Click on Add A Shortcut Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickAddAShortcutLink() {
        addAShortcut.click();
        return this;
    }

    /**
     * Click on Add Account Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickAddAccountLink() {
        addAccount.click();
        return this;
    }

    /**
     * Click on Advanced Search Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickAdvancedSearchLink() {
        advancedSearch.click();
        return this;
    }

    /**
     * Click on Advertising Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickAdvertisingLink() {
        advertising.click();
        return this;
    }

    /**
     * Click on All Your Brand Accounts Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickAllYourBrandAccountsLink() {
        allYourBrandAccounts.click();
        return this;
    }

    /**
     * Click on Blogger Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickBloggerLink() {
        blogger.click();
        return this;
    }

    /**
     * Click on Books Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickBooksLink() {
        books.click();
        return this;
    }

    /**
     * Click on Business Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickBusinessLink() {
        business.click();
        return this;
    }

    /**
     * Click on Calendar Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickCalendarLink() {
        calendar.click();
        return this;
    }

    /**
     * Click on Change Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickChangeLink() {
        change.click();
        return this;
    }

    /**
     * Click on Classroom Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickClassroomLink() {
        classroom.click();
        return this;
    }

    /**
     * Click on Contacts Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickContactsLink() {
        contacts.click();
        return this;
    }

    /**
     * Click on Docs Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickDocsLink() {
        docs.click();
        return this;
    }

    /**
     * Click on Drive Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickDriveLink() {
        drive.click();
        return this;
    }

    /**
     * Click on Earth Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickEarthLink() {
        earth.click();
        return this;
    }

    /**
     * Click on Even More From Google Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickEvenMoreFromGoogleLink() {
        evenMoreFromGoogle.click();
        return this;
    }

    /**
     * Click on Finance Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickFinanceLink() {
        finance.click();
        return this;
    }

    /**
     * Click on Gmail Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickGmail1Link() {
        gmail1.click();
        return this;
    }

    /**
     * Click on Gmail Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickGmail2Link() {
        gmail2.click();
        return this;
    }

    /**
     * Click on Google Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickGoogle1Link() {
        google1.click();
        return this;
    }

    /**
     * Click on Google Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickGoogle2Link() {
        google2.click();
        return this;
    }

    /**
     * Click on Google Account Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickGoogleAccountLink() {
        googleAccount.click();
        return this;
    }

    /**
     * Click on Google Profile Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickGoogleProfileLink() {
        googleProfile.click();
        return this;
    }

    /**
     * Click on Google Search Button.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickGoogleSearchButton() {
        googleSearch.click();
        return this;
    }

    /**
     * Click on Hangouts Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickHangoutsLink() {
        hangouts.click();
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickHelpLink() {
        help.click();
        return this;
    }

    /**
     * Click on History Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickHistoryLink() {
        history.click();
        return this;
    }

    /**
     * Click on Im Feeling Lucky Button.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickImFeelingLuckyButton() {
        imFeelingLucky.click();
        return this;
    }

    /**
     * Click on Images Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickImagesLink() {
        images.click();
        return this;
    }

    /**
     * Click on Keep Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickKeepLink() {
        keep.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickLearnMoreLink() {
        learnMore.click();
        return this;
    }

    /**
     * Click on Maps Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickMapsLink() {
        maps.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickMoreLink() {
        more.click();
        return this;
    }

    /**
     * Click on My Business Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickMyBusinessLink() {
        myBusiness.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Click on News Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickNewsLink() {
        news.click();
        return this;
    }

    /**
     * Click on Photos Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickPhotosLink() {
        photos.click();
        return this;
    }

    /**
     * Click on Play Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickPlayLink() {
        play.click();
        return this;
    }

    /**
     * Click on Privacy Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickPrivacy1Link() {
        privacy1.click();
        return this;
    }

    /**
     * Click on Privacy Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickPrivacy2Link() {
        privacy2.click();
        return this;
    }

    /**
     * Click on Report Inappropriate Predictions Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickReportInappropriatePredictionsLink() {
        reportInappropriatePredictions.click();
        return this;
    }

    /**
     * Click on Restart Listening Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickRestartListeningLink() {
        restartListening.click();
        return this;
    }

    /**
     * Click on Search Help Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickSearchHelpLink() {
        searchHelp.click();
        return this;
    }

    /**
     * Click on Search Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickSearchLink() {
        search.click();
        return this;
    }

    /**
     * Click on Search Settings Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickSearchSettingsLink() {
        searchSettings.click();
        return this;
    }

    /**
     * Click on Send Feedback Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickSendFeedbackLink() {
        sendFeedback.click();
        return this;
    }

    /**
     * Click on Settings Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickSettingsLink() {
        settings.click();
        return this;
    }

    /**
     * Click on Shopping Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickShoppingLink() {
        shopping.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickSignOutLink() {
        signOut.click();
        return this;
    }

    /**
     * Click on Start Listening For Ok Google Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickStartListeningForOkGoogleLink() {
        startListeningForOkGoogle.click();
        return this;
    }

    /**
     * Click on Store Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickStoreLink() {
        store.click();
        return this;
    }

    /**
     * Click on Terms Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickTermsLink() {
        terms.click();
        return this;
    }

    /**
     * Click on Translate Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickTranslateLink() {
        translate.click();
        return this;
    }

    /**
     * Click on Vince Agwadavinceagwadagmail.com Default Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickVinceAgwadavinceagwadagmailComDefaultLink() {
        vinceAgwadavinceagwadagmailComDefault.click();
        return this;
    }

    /**
     * Click on Vince Automationautomationvincegmail.com Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickVinceAutomationautomationvincegmailComLink() {
        vinceAutomationautomationvincegmailCom.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage clickYoutubeLink() {
        youtube.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage fill() {
        setRestartListeninghelphotwordDetectionIsOff1TextField();
        setRestartListeninghelphotwordDetectionIsOff2TextField();
        setRestartListeninghelphotwordDetectionIsOff3TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Restart Listeninghelphotword Detection Is Off Text field.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage setRestartListeninghelphotwordDetectionIsOff1TextField() {
        return setRestartListeninghelphotwordDetectionIsOff1TextField(data.get("RESTART_LISTENINGHELPHOTWORD_DETECTION_IS_OFF_1"));
    }

    /**
     * Set value to Restart Listeninghelphotword Detection Is Off Text field.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage setRestartListeninghelphotwordDetectionIsOff1TextField(String restartListeninghelphotwordDetectionIsOff1Value) {
        restartListeninghelphotwordDetectionIsOff1.sendKeys(restartListeninghelphotwordDetectionIsOff1Value);
        return this;
    }

    /**
     * Set default value to Restart Listeninghelphotword Detection Is Off Text field.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage setRestartListeninghelphotwordDetectionIsOff2TextField() {
        return setRestartListeninghelphotwordDetectionIsOff2TextField(data.get("RESTART_LISTENINGHELPHOTWORD_DETECTION_IS_OFF_2"));
    }

    /**
     * Set value to Restart Listeninghelphotword Detection Is Off Text field.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage setRestartListeninghelphotwordDetectionIsOff2TextField(String restartListeninghelphotwordDetectionIsOff2Value) {
        restartListeninghelphotwordDetectionIsOff2.sendKeys(restartListeninghelphotwordDetectionIsOff2Value);
        return this;
    }

    /**
     * Set default value to Restart Listeninghelphotword Detection Is Off Text field.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage setRestartListeninghelphotwordDetectionIsOff3TextField() {
        return setRestartListeninghelphotwordDetectionIsOff3TextField(data.get("RESTART_LISTENINGHELPHOTWORD_DETECTION_IS_OFF_3"));
    }

    /**
     * Set value to Restart Listeninghelphotword Detection Is Off Text field.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage setRestartListeninghelphotwordDetectionIsOff3TextField(String restartListeninghelphotwordDetectionIsOff3Value) {
        restartListeninghelphotwordDetectionIsOff3.sendKeys(restartListeninghelphotwordDetectionIsOff3Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage submit() {
        clickImFeelingLuckyButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the GoogleSearchPage class instance.
     */
    public GoogleSearchPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
