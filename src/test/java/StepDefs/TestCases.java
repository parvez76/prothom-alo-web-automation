package StepDefs;

import io.cucumber.java.Transpose;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
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

    @Given("User can see LoginBtn on Homepage")
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
    @And("User enters value for Login")
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
// t2
    @Given("User can see latest categories link on Homepage")
    public void user_can_see_latest_categories_link_on_homepage() throws InterruptedException {
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

    // t3

    @Given("User can see politics news categories link on Homepage")
    public void user_can_see_politics_news_categories_link_on_homepage() throws InterruptedException {
        Assert.assertTrue(homepage.Categories().isDisplayed());
        Thread.sleep(wait1);
    }

    @When("User clicks on Politics News")
    public void user_clicks_on_politics_news() throws InterruptedException {
        homepage.Politics_News().click();
        Thread.sleep(wait2);
    }

    @Then("User can see politics news Section")
    public void user_can_see_politics_news_section() throws InterruptedException {
        homepage.Politics_News().isDisplayed();
        Thread.sleep(wait2);
    }

    // t4

    @Given("User can see Bangladesh news categories link on Homepage")
    public void user_can_see_Bangladesh_news_categories_link_on_homepage() throws InterruptedException {
        Assert.assertTrue(homepage.Categories().isDisplayed());
        Thread.sleep(wait1);
    }

    @When("User clicks on Bangladesh News")
    public void user_clicks_on_Bangladesh_news() throws InterruptedException {
        homepage.Bangladesh_News().click();
        Thread.sleep(wait2);
    }

    @Then("User can see Bangladesh news Section")
    public void user_can_see_Bangladesh_news_section() throws InterruptedException {
        homepage.Bangladesh_News().isDisplayed();
        Thread.sleep(wait2);
    }

    // t5

    @Given("User can see search button on Homepage")
    public void user_can_see_search_button_on_homepage() throws InterruptedException {
        Assert.assertTrue(homepage.SearchBtn().isDisplayed());
        Thread.sleep(wait1);
    }

    @When("User clicks on search button")
    public void user_clicks_on_search_button() throws InterruptedException {
        homepage.SearchBtn().click();
        Thread.sleep(wait2);
    }

    @Then("Search Page is Displayed")
    public void search_page_is_displayed() throws InterruptedException {
        homepage.SearchPage().isDisplayed();
        Thread.sleep(wait1);
    }

    @When("User clicks on Search field")
    public void user_clicks_on_search_field() throws InterruptedException {
        homepage.SearchForm().click();
        Thread.sleep(wait2);
    }
    @And("User search for something")
    public void user_search_for_something() throws InterruptedException {
        homepage.SearchForm().sendKeys("বাংলাদেশ");
        Thread.sleep(wait2);
    }

    @When("User clicks on search icon")
    public void user_clicks_on_search_icon() throws InterruptedException {
        homepage.SearchSubmit().click();
        Thread.sleep(wait2);
    }

    @Then("Search Results are displayed")
    public void search_results_are_displayed() throws InterruptedException {
        homepage.SearchResults().isDisplayed();
        Thread.sleep(wait2);
    }
}
