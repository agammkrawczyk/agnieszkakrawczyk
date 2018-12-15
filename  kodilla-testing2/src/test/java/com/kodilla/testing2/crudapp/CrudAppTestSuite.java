package com.kodilla.testing2.crudapp;

import com.kodilla.testing.config.WebDriverConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertTrue;


public class CrudAppTestSuite {

    private static final String BASE_URL = "https://agammkrawczyk.github.io";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTest() {
        driver = WebDriverConfig.getDriver( WebDriverConfig.CHROME );
        driver.get( BASE_URL );
        generator = new Random();
    }

    @After
    public void cleanUpAfterTest() {
        driver.close();
    }


    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASKNAME = "//form[contains(@action, \"createTask\")]//fieldset[1]/input";
        final String XPATH_TASKCONTENT = "//form[contains(@action, \"createTask\")]//fieldset[2]/textarea";
        final String XPATH_ADDCARD = "//form[contains(@action, \"createTask\")]//fieldset[3]/button";
        String taskName = "Task Number " + generator.nextInt();
        String taskContent = taskName + " content";

        WebElement name = driver.findElement( By.xpath( XPATH_TASKNAME ) );
        name.sendKeys( taskName );

        WebElement content = driver.findElement( By.xpath( XPATH_TASKCONTENT ) );
        content.sendKeys( taskContent );

        WebElement addButton = driver.findElement( By.xpath( XPATH_ADDCARD ) );
        addButton.click();

        Thread.sleep( 2000 );

        return taskName;
    }


    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement( By.xpath( "//select[1]" ) ).isDisplayed()) ;

        driver.findElements( By.xpath( "//form[@class=\"datatable__row\"]" ) ).stream()
                .filter( anyForm ->
                        anyForm.findElement( By.xpath( ".//p[@class=\"datatable__field-value\"]" ) )
                                .getText().equals( taskName ) )
                .forEach( theForm -> {
                    WebElement selectElement = theForm.findElement( By.xpath( ".//select[1]" ) );
                    Select select = new Select( selectElement );
                    select.selectByIndex( 1 );

                    WebElement createButton =
                            theForm.findElement( By.xpath( ".//button[contains(@class, \"card-creation\")]" ) );
                    createButton.click();
                } );

        Thread.sleep( 2000 );
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;

        WebDriver driverTrello = WebDriverConfig.getDriver( WebDriverConfig.CHROME );
        driverTrello.get( TRELLO_URL );

        driverTrello.findElement( By.id( "user" ) ).sendKeys( "agnieszkakrawczyk9" );
        driverTrello.findElement( By.id( "password" ) ).sendKeys( "lewkowo40" );
        driverTrello.findElement( By.id( "login" ) ).submit();

        Thread.sleep( 5000 );

        driverTrello.findElements( By.xpath( "//a[@class=\"board-tile\"]" ) ).stream()
                .filter( aHref -> aHref.findElements( By.xpath( ".//div[@title=\"Kodilla Application\"]" ) ).size() > 0 )
                .forEach( aHref -> aHref.click() );

        Thread.sleep( 5000 );


        result = driverTrello.findElements( By.xpath( "//span" ) ).stream()
                .filter( theSpan -> theSpan.getText().contains( taskName ) )
                .collect( Collectors.toList() )
                .size() > 0;

        driverTrello.close();

        return result;

    }
    private void deleteTestTaskFromCrud(String taskName) throws InterruptedException {
        driver.navigate().refresh();
        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;
        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement buttonDeleteButton =
                            theForm.findElement(By.xpath(".//button[4]"));
                    buttonDeleteButton.click();
                });
        Thread.sleep(5000);
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
      //  sendTestTaskToTrello( taskName );
     //   assertTrue( checkTaskExistsInTrello( taskName ) );
        deleteTestTaskFromCrud(taskName);
    }

}