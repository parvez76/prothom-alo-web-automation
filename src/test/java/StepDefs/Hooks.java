package StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilis.TestContextSetup;

import java.io.IOException;

public class Hooks {
    private final TestContextSetup testContextSetup;

    public Hooks(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Before
    public void BeforeScenario() throws IOException, InterruptedException {
        // Initialize a new driver before each scenario
        testContextSetup.testBase.WebDriverManager();
    }

    @After
    public void AfterScenario() throws IOException, InterruptedException {
        // Close the driver after each scenario
        testContextSetup.testBase.CloseDriver();
    }
}
