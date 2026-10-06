
	package pages;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class MySpacePage {

	    WebDriver driver;
	    WebDriverWait wait;

	    public MySpacePage(WebDriver driver) {

	        this.driver = driver;

	        wait = new WebDriverWait(
	                driver,
	                Duration.ofSeconds(15));
	    }

	    private By mySpaceHeading =
	            By.xpath("//*[normalize-space()='My Space']");

	    private By premium =
	            By.xpath("//*[contains(normalize-space(),'Premium')]");

	    public boolean isMySpaceOpened() {

	        try {

	            return wait.until(
	                    ExpectedConditions.visibilityOfElementLocated(
	                            mySpaceHeading))
	                    .isDisplayed();

	        } catch (Exception e) {
	            return false;
	        }
	    }

	    public void clickPremium() {

	        wait.until(
	                ExpectedConditions.elementToBeClickable(premium))
	                .click();
	    }
	}

