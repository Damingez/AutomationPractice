package pl.stqa.pft.automation_practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}
