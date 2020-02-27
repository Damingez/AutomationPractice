package pl.stqa.pft.automation_practice.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculationOfTotalTest extends TestBase {

    @Test
    public void checkTotalOnSumUpPage() {
        Assert.assertTrue(app.productList().checkHeaderFromProductLists("Women"));
        app.productList().clickOnWomenToolbar();
        app.productList().clickOnProductDetailsWIthIndex(1);
        app.productPage().checkifHeaderIsPresent();
        app.productPage().chooseSize("M");
        app.productPage().addProductToCart();
        app.sumUpPage().checkTotaPricelCalc();

    }

}
