package com.kodilla.testing.ebay;

import com.kodilla.testing.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayTestingApp {


        public static final String SEARCHFIELD = "gh-ac";
        public static void main(String[] args) {
            WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
            driver.get("https://www.ebay.pl");

            WebElement searchField = driver.findElement(By.id(SEARCHFIELD));
            searchField.sendKeys("laptop");


        }
    }


