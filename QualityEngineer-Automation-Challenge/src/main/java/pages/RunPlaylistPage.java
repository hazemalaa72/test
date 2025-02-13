package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RunPlaylistPage extends BasePage  {
    private final By runPlaylistButton = By.cssSelector("button[class=\"Button-sc-1dqy6lx-0 fAuiac e-9541-overflow-wrap-anywhere\"]");
    public RunPlaylistPage(WebDriver driver) {
        super(driver);
    }
    public void runPlaylist(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(runPlaylistButton));
        driver.findElement(runPlaylistButton).click();
    }
}
