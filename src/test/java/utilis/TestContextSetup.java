package utilis;

import java.io.IOException;

import Reports.PageObject;
import org.openqa.selenium.WebDriver;

import Reports.PageObject;

public class TestContextSetup {

    public WebDriver driver;
    public String landingPageProductName;
    public PageObject pageObject;
    public TestBase testBase;


    public TestContextSetup() throws IOException, InterruptedException {
        testBase = new TestBase();
        pageObject = new PageObject(testBase.WebDriverManager());




    }

}
