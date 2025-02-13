package tests;
import org.testng.annotations.Test;
public class RunPlaylist extends TestBase{
    @Test
    public void runPlayListTest(){
        loginPage.login("hazemala72@gmail.com","hazemalaa12345");
        createPlaylistPage.createPlaylist();
        runPlaylistPage.runPlaylist();
    }
}
