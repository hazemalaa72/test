package com.automation.pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
public class RegisterPage {
    private final Page page;
    private final Locator usernameInput;
    private final Locator emailInput;
    private final Locator passwordInput;
    private final Locator signUpButton;
    public RegisterPage(Page page) {
        this.page = page;
        usernameInput = page.locator("input[name='username']");
        emailInput = page.locator("input[name='email']");
        passwordInput = page.locator("input[name='password']");
        signUpButton = page.locator("text=Sign up");
    }
    public void register(String username, String email, String password) {
        usernameInput.fill(username);
        emailInput.fill(email);
        passwordInput.fill(password);
        signUpButton.click();
    }
}