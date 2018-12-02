package com.kodilla.testing2.crudapp;

import com.kodilla.testing.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class CrudAppTestSuite {
    private static final String BASE_URl=" https://agammkrawczyk.github.io";
    private WebDriver driver;
   private Random generator;
    @Before
    public void initTests(){
        driver=WebDriverConfig.getDriver( WebDriverConfig.CHROME );
        driver.get( BASE_URl );
        generator=new Random(  );
    }
    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action, \"createTask\")]//fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action, \"createTask\")]//fieldset[2]/textarea";
        final String XPATH_ADD_CARD = "//form[contains(@action, \"createTask\")]//fieldset[3]/button";
        String taskName = "Task Number " + generator.nextInt();
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_CARD));
        addButton.click();

        Thread.sleep(2000);
    }
@After
    public void cleanUpAftterTest(){
        driver.close();
}
}
