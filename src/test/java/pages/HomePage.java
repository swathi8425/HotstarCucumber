
	package pages;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class HomePage {

	    private WebDriver driver;
	    private WebDriverWait wait;

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    }

	    // Login button
	    private By loginButton = By.xpath(
	        "//*[normalize-space()='Log In' or normalize-space()='Login']"
	    );

	    // My Space - based on the HTML you provided
	    private By mySpace = By.xpath(
	        "//p[normalize-space()='My Space']"
	    );

	    // Premium
	    private By premium = By.xpath(
	        "//*[normalize-space()='Premium']"
	    );

	    public void clickLogin() {

	        WebElement element = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(loginButton)
	        );

	        clickUsingJS(element);
	    }

	    public void clickMySpace() {

	        WebElement element = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(mySpace)
	        );

	        clickUsingJS(element);
	    }

	    public void selectPremium() {

	        WebElement element = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(premium)
	        );

	        clickUsingJS(element);
	    }

	    private void clickUsingJS(WebElement element) {

	        ((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView({block:'center'});",
	            element
	        );

	        ((JavascriptExecutor) driver).executeScript(
	            "arguments[0].click();",
	            element
	        );
	    }
	}


