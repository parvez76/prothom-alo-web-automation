package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Homepage.Homepage;
import utilis.TestContextSetup;
public class TestCases {

    private TestContextSetup testContextSetup;
    private WebDriver driver;
    private Homepage homepage;
    private int wait1 = 10000;
    private int wait2 = 3000;


    public TestCases(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.driver = testContextSetup.driver;
        this.homepage = testContextSetup.pageObject.getHomePage();
    }
// T1
    @When("User can see LoginBtn on Homepage")
    public void user_can_see_LoginBtn_on_Homepage() throws InterruptedException {
        Assert.assertTrue(homepage.LoginButton().isDisplayed());
        Thread.sleep(wait1);
    }

    @Then("User clicks LoginBtn")
    public void user_clicks_loginbtn() throws InterruptedException {
        homepage.LoginButton().click();
        Thread.sleep(wait2);
    }
    @When("User clicks Email Field")
    public void user_clicks_email_field() throws InterruptedException {
        homepage.Email().click();
        Thread.sleep(wait2);
    }
    @Then("User enters value for Login")
    public void user_enters_value_for_login() throws InterruptedException {
        homepage.Email().sendKeys("johnwick3676@gmail.com");
        Thread.sleep(wait2);
    }
    @Then("User clicks Password Field")
    public void user_clicks_password_field() throws InterruptedException {
        homepage.Password().click();
        Thread.sleep(wait2);
    }
    @When("User enters Password")
    public void user_enter_password() throws InterruptedException {
        homepage.Password().sendKeys("john1234");
        Thread.sleep(wait2);
    }
    @Then("User clicks Login Submit")
    public void user_clicks_login_submit() throws InterruptedException {
        homepage.Login().click();
        Thread.sleep(wait2);
    }

    // T2

    @Given("User can see categories on Homepage")
    public void user_can_see_categories_on_homepage() throws InterruptedException {
        Assert.assertTrue(homepage.Categories().isDisplayed());
        Thread.sleep(wait1);
    }

    @When("User clicks on latest News")
    public void user_clicks_on_latest_news() throws InterruptedException {
        homepage.Latest_Category().click();
        Thread.sleep(wait2);
    }

    @Then("User can see latest news Section")
    public void user_can_see_latest_news_section() throws InterruptedException {
        homepage.Latest_Category().isDisplayed();
        Thread.sleep(wait2);
    }
}
