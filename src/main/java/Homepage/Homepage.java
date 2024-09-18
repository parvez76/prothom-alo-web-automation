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
    By Politics_News = By.xpath("//a[@aria-label='রাজনীতি'][contains(text(),'রাজনীতি')]");
    By Bangladesh_News = By.xpath("//a[@aria-label='বাংলাদেশ']");

    By SearchBtn = By.xpath("//span[@class='OAIj1']");
    By SearchPage = By.xpath("//h1[@class='_8vt-y']");
    By SearchForm = By.id("searchForm");
    By SearchSubmit = By.xpath("//button[@type='submit']//*[name()='svg']");
    By SearchResults = By.xpath("//*[@id=\"container\"]/div/div/div[1]/div[3]/div[1]/div/div/div[2]");

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement LoginButton(){return driver.findElement(LoginBtn);}
    public WebElement Email(){return driver.findElement(Email);}
    public WebElement Password(){return driver.findElement(Password);}
    public WebElement Login(){return driver.findElement(Login);}

    public WebElement Categories(){return driver.findElement(Categories);}
    public WebElement Latest_Category(){return driver.findElement(Latest_Category);}
    public WebElement Politics_News() {return driver.findElement(Politics_News);}
    public WebElement Bangladesh_News(){return driver.findElement(Bangladesh_News);}

    public WebElement SearchBtn() {return driver.findElement(SearchBtn);}
    public WebElement SearchPage() {return driver.findElement(SearchPage);}
    public WebElement SearchForm() {return driver.findElement(SearchForm);}
    public WebElement SearchSubmit() {return driver.findElement(SearchSubmit);}
    public WebElement SearchResults() {return driver.findElement(SearchResults);}
}
