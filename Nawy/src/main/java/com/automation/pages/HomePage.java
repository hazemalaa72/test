package com.automation.pages;

import com.microsoft.playwright.*;

public class HomePage {
    private Page page;

    public HomePage(Page page) {
        this.page = page;
    }

    public void navigateToHomePage() {
        page.navigate("https://www.demoblaze.com/");
    }

    public void addAppleMonitorToCart() {
        page.locator("text=Apple monitor 24").click();  // Click Apple Monitor 24
        page.locator("text=Add to cart").click();  // Add to cart button
    }
}
