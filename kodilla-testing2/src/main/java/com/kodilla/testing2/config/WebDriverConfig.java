package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverConfig {
    public final static String CHROME = "CHROME_DRIVER";
    public final static String IE = "IE_DRIVER";
    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "C:\\Selenium-drivers\\InternetExplorer\\IEDriverServer.exe");

        if (driver.equals(CHROME)) {
            return new ChromeDriver();
        } else if (driver.equals(IE)) {
            return new InternetExplorerDriver();
        } else {
            return null;
        }
    }
}
