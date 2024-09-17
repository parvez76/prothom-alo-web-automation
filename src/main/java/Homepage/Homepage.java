package Homepage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

    @Getter
    WebDriver driver;


    By LoginBtn = By.xpath("//div[@class='_4XyKZ TY-0a']//span[@class='content'][normalize-space()='Login']");
    By Email = By.xpath("//input[@placeholder='Email']");
    By Password = By.xpath("//input[@placeholder='Password']");
    By Login = By.xpath("//button[@class='button Tq1xe']");
    By Categories = By.xpath("//*[@id=\"navbar\"]/div[1]/nav/ul");
    By Latest_Category = By.xpath("//a[@aria-label='সর্বশেষ']");
    public Homepage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement LoginButton(){return driver.findElement(LoginBtn);}
    public WebElement Email(){return driver.findElement(Email);}
    public WebElement Password(){return driver.findElement(Password);}
    public WebElement Login(){return driver.findElement(Login);}
    public WebElement Categories(){return driver.findElement(Categories);}
    public WebElement Latest_Category(){return driver.findElement(Latest_Category);}


}
