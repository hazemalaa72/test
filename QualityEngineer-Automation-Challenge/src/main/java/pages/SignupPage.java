package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupPage extends BasePage {
    private final By signupButton = By.cssSelector("button[data-testid=\"signup-button\"]");
    private final By signupEmailField = By.id("username");
    private final By nextAfterEmailBtton = By.cssSelector("button[data-encore-id=\"buttonPrimary\"]");
    private final By signupPasswordField = By.id("new-password");
    private final By nameField = By.id("displayName");
    private final By birthDayField = By.id("day");
    private final By birthYearField = By.id("year");
    private final By genderField = By.cssSelector("label[for=\"gender_option_male\"]> span[class=\"Indicator-sc-hjfusp-0 jRuGOG\"]");
    private final By submitSignupButton = By.cssSelector("button[data-testid=\"submit\"]");
    public SignupPage(WebDriver driver) {
        super(driver);
    }
    public void signup(String email, String password,String name,String birthDay,String birthMonth,String birthYear) {
        driver.findElement(signupButton).click();
        driver.findElement(signupEmailField).sendKeys(email);
        driver.findElement(signupEmailField).sendKeys(Keys.ENTER);
        driver.findElement(signupPasswordField).sendKeys(password);
        driver.findElement(signupPasswordField).sendKeys(Keys.ENTER);
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(birthDayField).sendKeys(birthDay);
        WebElement birthMonthField = driver.findElement(By.id("month"));
        Select select = new Select(birthMonthField);
        select.selectByValue(birthMonth);
        driver.findElement(birthYearField).sendKeys(birthYear);
        driver.findElement(genderField).click();
        driver.findElement(submitSignupButton).click();
    }
}
