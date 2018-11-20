package com.kodilla.testing2.google;

import com.kodilla.testing.config.WebDriverConfig;
import org.openqa.selenium.WebDriver;

public class GoogleTestingApp {
    public static void main(String[] args) {
        WebDriver driver= WebDriverConfig.getDriver( WebDriverConfig.FIREFOX );
        driver.get( "https://google.com" );
    }

}
