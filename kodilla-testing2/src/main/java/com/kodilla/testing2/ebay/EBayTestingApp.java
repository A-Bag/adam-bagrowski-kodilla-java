package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static final String SEARCHFIELD = "_nkw";
    public static final String SEARCHBUTTON = "gh-btn";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.ebay.com");

        WebElement searchField = driver.findElement(By.name(SEARCHFIELD));
        searchField.sendKeys("Lenovo T570");
        WebElement searchButton = driver.findElement(By.id(SEARCHBUTTON));
        searchButton.click();
    }
}
