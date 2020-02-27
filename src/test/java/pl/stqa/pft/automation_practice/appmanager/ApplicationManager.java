package pl.stqa.pft.automation_practice.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import pl.stqa.pft.automation_practice.pages.AuthenticationPage;
import pl.stqa.pft.automation_practice.pages.SumUpPage;
import pl.stqa.pft.automation_practice.pages.ProductListPage;
import pl.stqa.pft.automation_practice.pages.ProductPage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private final Properties properties;
    WebDriver wd;

    private String browser;
    private ProductListPage productListPage;
    private ProductPage productPage;
    private SumUpPage sumUpPage;
    private AuthenticationPage authenticationPage;

    public ApplicationManager(String browser) {

        this.browser = browser;
        properties = new Properties();

    }

    public void init() throws IOException {

        String target = System.getProperty("target", "local");
        properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));


        switch (browser) {
            case BrowserType.FIREFOX:
                wd = new FirefoxDriver();
                break;
            case BrowserType.CHROME:
                wd = new ChromeDriver();
                break;
            case BrowserType.IE:
                wd = new InternetExplorerDriver();
                break;
        }

        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get(properties.getProperty("web.baseUrl"));
        productListPage = new ProductListPage(wd);
        productPage = new ProductPage(wd);
        sumUpPage = new SumUpPage(wd);
        authenticationPage = new AuthenticationPage(wd);

    }

    public ProductListPage productList() {
        return productListPage;
    }

    public ProductPage productPage() {
        return productPage;
    }

    public SumUpPage sumUpPage() {return sumUpPage;}

    public AuthenticationPage authenticationPage() {return authenticationPage;}

    public void stop() {
      wd.quit();
    }

}
