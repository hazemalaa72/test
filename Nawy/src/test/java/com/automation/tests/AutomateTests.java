package com.automation.tests;
import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.RegisterPage;
import com.microsoft.playwright.*;
import org.testng.Assert;
import org.testng.annotations.*;
public class AutomateTests {
    private Browser browser;
    private Page page;
    private RegisterPage registerPage;
    private LoginPage loginPage;
    private HomePage homePage;
    private CartPage cartPage;

    @BeforeMethod
    public void setup() {
        Playwright playwright = Playwright.create();  // Initialize Playwright
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));  // Launch browser
        page = browser.newPage();  // Create a new page
        registerPage = new RegisterPage(page);  // Initialize RegisterPage
        loginPage = new LoginPage(page);  // Initialize LoginPage
        homePage = new HomePage(page);  // Initialize HomePage
        cartPage = new CartPage(page);  // Initialize CartPage
    }

    @Test(priority = 1)
    public void testRegister() {
        registerPage.navigateToRegisterPage();
        registerPage.register("newuser123", "password123");
        String successMessage = registerPage.getSuccessMessage();
        Assert.assertEquals(successMessage,"Sign up successful");
    }

    @Test(priority = 2)
    public void testLogin() {
        loginPage.navigateToLoginPage();
        loginPage.login("newuser123", "password123");
        String loginMessage = loginPage.getLoginSuccessMessage();
        Assert.assertEquals(loginMessage,"Welcome");
    }

    @Test(priority = 3)
    public void testLogout() {
        loginPage.navigateToLoginPage();
        loginPage.login("newuser123", "password123");

        // Now log out
        loginPage.logout();

        // Verify that the user is logged out by checking that the "Log in" button is visible again
        Assert.assertTrue(loginPage.isLoggedOut(), "User is not logged out successfully");
    }

    @Test(priority = 4)
    public void testCreateOrder() {
        homePage.navigateToHomePage();
        homePage.addAppleMonitorToCart();
        cartPage.goToCart();
        cartPage.placeOrder();
        String orderSuccessMessage = cartPage.getOrderSuccessMessage();
        Assert.assertEquals(orderSuccessMessage,"Thank you for your purchase!");
    }

    @AfterMethod
    public void tearDown() {
        if (page != null) {
            page.close();
        }
        if (browser != null) {
            browser.close();
        }
    }
}
