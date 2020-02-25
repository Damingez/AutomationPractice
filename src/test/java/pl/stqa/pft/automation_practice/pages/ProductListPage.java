package pl.stqa.pft.automation_practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductListPage extends Page {

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkHeaderFromProductLists(String header) {
        return driver.findElement(By.cssSelector("div#block_top_menu a[title=" + header + "]")).isDisplayed();
    }

    public void clickOnWomenToolbar() {
        driver.findElement(By.cssSelector("a[title=Women]")).click();
    }

    public void clickOnDressesToolbar() {
        driver.findElement(By.cssSelector("a[title=Dresses]")).click();
    }

    public void clickOnTShirtsToolbar() {
        driver.findElement(By.cssSelector("a[title=T-shirts]")).click();
    }

    public void clickOnProductDetailsWIthIndex(int productIndex) {
        List<WebElement> products = driver.findElements(By.cssSelector("a.product_img_link"));
        products.get(productIndex).click();
        // new Actions(driver).moveToElement(products.get(productIndex)).perform();
    }

}
