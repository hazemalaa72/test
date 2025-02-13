package tests;
import org.testng.annotations.Test;
public class CreatePlaylist extends TestBase{
    @Test
    public void createPlayListTest(){
        loginPage.login("hazemala72@gmail.com","hazemalaa12345");
        createPlaylistPage.createPlaylist();
    }
}
