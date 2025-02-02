package com.automation.pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
public class HomePage {
    private final Page page;
    private final Locator registerButton;
    private final Locator loginButton;
    private final Locator productLink;
    public HomePage(Page page) {
        this.page = page;
        registerButton = page.locator("text=Sign up");
        loginButton = page.locator("text=Log in");
        productLink = page.locator("text=Apple monitor 24");
    }
    public void navigateToRegister() {
        registerButton.click();
    }
    public void navigateToLogin() {
        loginButton.click();
    }
    public void navigateToProductPage() {
        productLink.click(); // Click the link that directs to the product page
    }
}