package Reports;

import org.openqa.selenium.WebDriver;
import Homepage.Homepage;

public class PageObject {
    public static WebDriver driver;

    public Homepage homepage;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public Homepage getHomePage() {
        homepage = new Homepage(driver);

        return homepage;
    }
}
