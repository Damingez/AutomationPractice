package pl.stqa.pft.automation_practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class SumUpPage extends Page {
    public SumUpPage(WebDriver driver) {
        super(driver);
    }

    public void clickCheckout() {
        driver.findElement(By.cssSelector("a[title=\"Proceed to checkout\"]"));
    }

    public void clickContinueShopping() {
        driver.findElement(By.cssSelector("span[title=\"Continue shopping\"]"));
    }

    public double getProductTotal() {
        wait.until(visibilityOfElementLocated(By.cssSelector("span.ajax_block_products_total")));
        double productPrice = getTextValueAndConvertToDouble(By.cssSelector("span.ajax_block_products_total"));
        return productPrice;
    }

    public double getShippingCost() {
        wait.until(visibilityOfElementLocated(By.cssSelector("span.ajax_cart_shipping_cost")));
        double shippingCost = getTextValueAndConvertToDouble(By.cssSelector("span.ajax_cart_shipping_cost"));
        return shippingCost;
    }

    public double getTotal() {
        wait.until(visibilityOfElementLocated(By.cssSelector("span.ajax_block_cart_total")));
        double total = getTextValueAndConvertToDouble(By.cssSelector("span.ajax_block_cart_total"));
        return total;
    }
    private double getTextValueAndConvertToDouble(By by) {
       String text = driver.findElement(by).getAttribute("textContent");
       String cleanedString = text.replace("$","");
       return Double.parseDouble(cleanedString);
    }
}
