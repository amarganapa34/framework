package UI.webpages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver ldriver) {
        driver = ldriver;
    }

//    @FindBy(xpath = "//*[text()=' Account']")  WebElement accountLink;

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")  WebElement SighIn;
    @FindBy(xpath = "//*[@id=\"userName\"]")  WebElement Username;
    @FindBy(xpath = "//*[@id=\"password\"]")  WebElement Password;
    @FindBy(xpath = "/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")  WebElement loginButton;
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")  WebElement SighOut;


    public void clickOnAccountLink(){
//        accountLink.click();
        SighIn.click();
    }

    public void enterEmailID(String email){
        Username.sendKeys(email);
    }

    public void enterPassword(String password){
        Password.sendKeys(password);
    }

    public void loginToApplication(String email, String password){
        Username.sendKeys(email);
        Password.sendKeys(password);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public void clickOnLogOutLink(){
        SighOut.click();
    }




}