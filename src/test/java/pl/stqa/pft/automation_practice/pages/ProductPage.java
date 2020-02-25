package pl.stqa.pft.automation_practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Page {

    public ProductPage(WebDriver driver) {
        super(driver);
    }


    public boolean checkifHeaderIsPresent() {
        return isElementPresent(By.cssSelector("h1[itemprop=name]"));
    }

    public void chooseSize(String productSize) {
        WebElement select = driver.findElement(By.id("group_1"));
        List<WebElement> options = select.findElements(By.tagName("option"));
        for (WebElement option : options) {
            if (productSize.equals(option.getText()))
                option.click();
        }
    }


    public void addProductToCart() {
        driver.findElement(By.cssSelector("p#add_to_cart button")).click();
    }
}