package com.automation.pages;

import com.microsoft.playwright.*;

public class CartPage {
    private Page page;

    public CartPage(Page page) {
        this.page = page;
    }

    public void goToCart() {
        page.locator("text=Cart").click();  // Navigate to the cart
    }

    public void placeOrder() {
        page.locator("text=Place Order").click();  // Click Place Order
    }

    public String getOrderSuccessMessage() {
        return page.locator(".sweet-alert").textContent();  // Get order success message
    }
}
