package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {

    public static LoadProp loadProp = new LoadProp();
    public static final String USERNAME = loadProp.getProperty("SAUCE_USERNAME");
    public static final String ACCESS_KEY = loadProp.getProperty("SAUCE_ACCESS_KEY");
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com/wd/hub";

    public static final boolean SAUCE_LAB = Boolean.parseBoolean(System.getProperty("Sauce"));
    public static final String browser = System.getProperty("browser");


    //To open browser
    public void SetUpBrowser() {
        System.out.println(USERNAME);
        System.out.println(ACCESS_KEY);

        // IF SAUCE LAB IS TRUE
        if (SAUCE_LAB) {
            System.out.println("Running in SauceLab...........in browser" + browser);


            if (browser.equalsIgnoreCase("chrome")) {
                DesiredCapabilities caps = DesiredCapabilities.chrome();
                caps.setCapability("platform", "windows 8");
                caps.setCapability("version", "78.0");

                try {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                    driver.get("https://demo.nopcommerce.com/");
                } catch (MalformedURLException e) {
                    e.fillInStackTrace();
                }
            } else if (browser.equalsIgnoreCase("firefox")) {
                DesiredCapabilities caps = DesiredCapabilities.firefox();
                caps.setCapability("platform", "windows 7");
                caps.setCapability("version", "56");
                caps.setCapability("name", "Testing on firefox56");

                try {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                } catch (MalformedURLException e) {
                    e.fillInStackTrace();
                }
            } else if (browser.equalsIgnoreCase("ie")) {
                DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
                caps.setCapability("platform", "windows 10");
                caps.setCapability("version", "11.0");

                try {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                } catch (MalformedURLException e) {
                    e.fillInStackTrace();
                }
            } else {
                System.out.println("wrong browser name or empty" + browser);
            }
        }
        else {
            if (browser.equalsIgnoreCase("chrome")) {

                System.setProperty("webdriver.chrome.driver", "src/test/Resources/BrowserDrivers/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
                driver.get("https://demo.nopcommerce.com/");
            }
            else if (browser.equalsIgnoreCase("firefox")) {

                System.setProperty("webdriver.firefox.driver", "src/test/Resources/BrowserDrivers/geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
                driver.get("https://demo.nopcommerce.com/");
            }
            else {
                 System.out.println("You have selected wrong browser" + browser);
            }
//To close browser
            //  public void closeBrowser ()

            {
                driver.close();
            }


        }
    }
}