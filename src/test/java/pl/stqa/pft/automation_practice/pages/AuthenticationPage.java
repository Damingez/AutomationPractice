package pl.stqa.pft.automation_practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends Page {
    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public void typeEmailAddressToRegister(String text) {
        driver.findElement(By.id("email_create")).sendKeys(text);
    }

    public void createAccount() {
        driver.findElement(By.id("SubmitCreate")).click();
    }

    public void typeEmailAddressToLogin(String text){
        driver.findElement(By.id("email")).sendKeys(text);
    }

    public void typePassword(String text){
        driver.findElement(By.id("passwd")).sendKeys(text);
    }

    public void signIn() {
        driver.findElement(By.id("SubmitLogin")).click();
    }

    public void goTo(){
        driver.findElement(By.linkText("Sign in")).click();
    }

}
