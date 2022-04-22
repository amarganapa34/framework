package UI.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"menu3\"]/li[1]/a/span" ) WebElement homePageLink;

	
	public HomePage(WebDriver ldrvier) {
		
		driver = ldrvier;

	}
	

	public void clickOnhomeLink() {
		homePageLink.click();
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
}
