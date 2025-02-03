package com.automation.pages;

import com.microsoft.playwright.*;

public class RegisterPage {
    private Page page;

    public RegisterPage(Page page) {
        this.page = page;
    }

    public void navigateToRegisterPage() {
        page.navigate("https://www.demoblaze.com/");
        page.locator("text=Sign up").click();  // Click Sign Up button
    }

    public void register(String username, String password) {
        page.locator("#sign-username").fill(username);  // Username field
        page.locator("#sign-password").fill(password);  // Password field
        page.locator("text=Sign up").click();  // Click Sign Up button
    }

    public String getSuccessMessage() {
        return page.locator(".alert-success").textContent();  // Get success message after registration
    }
}
