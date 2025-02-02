package com.automation.pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
public class ProductPage {
    private final Page page;
    private final Locator appleMonitorButton;
    private final Locator addToCartButton;
    public ProductPage(Page page) {
        this.page = page;
        appleMonitorButton = page.locator("text=Apple monitor 24");
        addToCartButton = page.locator("text=Add to cart");
    }
    public void addAppleMonitorToCart() {
        appleMonitorButton.click();
        addToCartButton.click();
    }
}