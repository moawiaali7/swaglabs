package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CommonAPI {

    public WebDriver driver;
    String username="moawiaali_2XLITx";
    String password="LSrMnH8KvmWsSPjj6Nmv";


    public void getLocalDriver(String browserName)  {
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else  if (browserName.equalsIgnoreCase("")) {
            driver = new FirefoxDriver();
        }
    }
    public void getRemoteDriver(String envName,String os,String osVersion,String browser,String browserVersion,String username,String password) throws MalformedURLException {
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability("os",os);
        cap.setCapability("osVersion",osVersion);
        cap.setCapability("browser",browser);
        cap.setCapability("browserVersion",browserVersion);
        if (envName.equalsIgnoreCase("browserstack")){
            cap.setCapability("resolution","1024x768");
            driver = new RemoteWebDriver(new URL("http://"+username+":"+password+"@hub-cloud.browserstack.com:80/wd/hub"),cap);
        }else if (envName.equalsIgnoreCase("saucelabs")){
            driver = new RemoteWebDriver(new URL("http://"+username+":"+password+"@ondemand.saucelabs.come:80/wd.hub"),cap);
        }


    }


    @Parameters({"useCloudEnv","os","osVersion","browserName","browserVersion","url"})
    @BeforeMethod
    public void setup(boolean useCloudEnv,String envName,String os,String osVersion,String browserName,String browserVersion,String url) throws MalformedURLException {
        if(useCloudEnv){
            getRemoteDriver(envName,os,osVersion,browserName,browserVersion ,username,password);
        }else {
            getLocalDriver(browserName);
        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @AfterMethod
    public void teardown() {
        driver.close();
    }

    //generic method
    public void clickOn(WebElement element) {
        element.click();
    }
    public void type(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void typeAndEnter(WebElement element, String text) {
        element.sendKeys(text, Keys.ENTER);
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    public void hoverOver( WebDriver driver ,WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public String getCurrentTitle() {
        return driver.getTitle();

    }

    public void selectOptionFromDropdown(WebElement dropdown , String option) {

        Select select = new Select(dropdown);
        try {
            select.selectByVisibleText(option);
        } catch (Exception e) {
            select.selectByValue(option);

        }
    }

}
