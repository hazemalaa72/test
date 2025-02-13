package tests;

import org.testng.annotations.Test;
public class LoginTest extends TestBase{
    @Test(priority = 1)
    public void loginTest() {
        loginPage.login("hazemala72@gmail.com","hazemalaa12345");
    }
}
