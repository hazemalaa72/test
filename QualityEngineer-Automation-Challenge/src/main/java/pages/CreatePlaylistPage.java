package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreatePlaylistPage extends BasePage  {
    private By createPlaylistButton = By.cssSelector("div[class=\"wv308QWnPnkI8n0GdqYO\"]>button[data-encore-id=\"buttonPrimary\"]");
    public CreatePlaylistPage(WebDriver driver) {
        super(driver);
    }
    public void createPlaylist(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(createPlaylistButton));
        driver.findElement(createPlaylistButton).click();

    }
}
