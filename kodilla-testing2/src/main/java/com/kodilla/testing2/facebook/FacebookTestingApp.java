package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_BIRTHDAY_DAY_SELECT = "//div[@class=\"_5k_5\"]/span/span/select[@name=\"birthday_day\"]";
    public static final String XPATH_BIRTHDAY_MONTH_SELECT = "//div[@class=\"_5k_5\"]/span/span/select[@name=\"birthday_month\"]";
    public static final String XPATH_BIRTHDAY_YEAR_SELECT = "//div[@class=\"_5k_5\"]/span/span/select[@name=\"birthday_year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        WebElement dayElement = driver.findElement(By.xpath(XPATH_BIRTHDAY_DAY_SELECT ));
        Select selectDay = new Select(dayElement);
        selectDay.selectByValue("1");

        WebElement monthElement = driver.findElement(By.xpath(XPATH_BIRTHDAY_MONTH_SELECT));
        Select selectMonth = new Select(monthElement);
        selectMonth.selectByValue("1");

        WebElement yearElement = driver.findElement(By.xpath(XPATH_BIRTHDAY_YEAR_SELECT));
        Select selectYear = new Select(yearElement);
        selectYear.selectByValue("2000");
    }
}
