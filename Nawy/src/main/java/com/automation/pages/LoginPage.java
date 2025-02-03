package com.automation.pages;

import com.microsoft.playwright.*;

public class LoginPage {
    private Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public void navigateToLoginPage() {
        page.navigate("https://www.demoblaze.com/");
        page.locator("text=Log in").click();  // Click Login button
    }

    public void login(String username, String password) {
        page.locator("#loginusername").fill(username);  // Username field
        page.locator("#loginpassword").fill(password);  // Password field
        page.locator("text=Log in").click();  // Click Log in button
    }

    public String getLoginSuccessMessage() {
        return page.locator(".alert-success").textContent();  // Get success message after login
    }
    public void logout() {
        // Click on the 'Log out' button to log the user out
        page.locator("text=Log out").click();
    }

    public boolean isLoggedOut() {
        // Check if the 'Log in' button is visible to confirm the user has logged out
        return page.locator("text=Log in").isVisible();
    }
}
