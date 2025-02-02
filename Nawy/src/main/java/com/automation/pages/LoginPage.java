package com.automation.pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
public class LoginPage {
    private final Page page;
    private final Locator emailInput;
    private final Locator passwordInput;
    private final Locator loginButton;
    public LoginPage(Page page) {
        this.page = page;
        emailInput = page.locator("input[name='email']");
        passwordInput = page.locator("input[name='password']");
        loginButton = page.locator("text=Log in");
    }
    public void login(String email, String password) {
        emailInput.fill(email);
        passwordInput.fill(password);
        loginButton.click();
    }
}