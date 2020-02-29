package pl.stqa.pft.automation_practice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.stqa.pft.automation_practice.model.CustomerData;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class CustomerRegistrationTest  {
        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        @BeforeClass(alwaysRun = true)
        public void setUp() throws Exception {
            driver = new ChromeDriver();
            baseUrl = "https://www.google.com/";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @Test
        public void testUntitledTestCase() throws Exception {
            accountCreation();
            initAccountCreation();
            fillRegistrationForm( CustomerData.newEntity()
                    .withFirstname("Damianoi")
                    .withLastname("Komenoi")
                    .withPassword("imperator480")
                    .withDayNumber("5")
                    .withMonthNumber("6")
                    .withYear("1993")
                    .withCompany("Aillerone")
                    .withAddressLine1("Paputai")
                    .withAddressLine2("16")
                    .withCity("Cracuva")
                    .withState("Arizona")
                    .withPostCode("98765")
                    .withPhone("567190325")
                    .withMobilePhone("607984324")
                    .build());
            submitRegistrationForm();
        }

    private void submitRegistrationForm() {
        driver.findElement(By.id("submitAccount11111111111")).click();
    }

    private void fillRegistrationForm(CustomerData customerData) {
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).click();
        driver.findElement(By.id("customer_firstname")).clear();
        driver.findElement(By.id("customer_firstname")).sendKeys(customerData.getFirstname());
        driver.findElement(By.id("customer_lastname")).click();
        driver.findElement(By.id("customer_lastname")).clear();
        driver.findElement(By.id("customer_lastname")).sendKeys(customerData.getLastname());
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys(customerData.getPassword());
        selectDay(customerData.getDayNumber());
        selectMonth(customerData.getMonthNumber());
        selectYear(customerData.getYear());
        driver.findElement(By.id("company")).click();
        driver.findElement(By.id("company")).clear();
        driver.findElement(By.id("company")).sendKeys(customerData.getCompany());
        driver.findElement(By.id("address1")).click();
        driver.findElement(By.id("address1")).clear();
        driver.findElement(By.id("address1")).sendKeys(customerData.getAddressLine1());
        driver.findElement(By.id("address2")).click();
        driver.findElement(By.id("address2")).clear();
        driver.findElement(By.id("address2")).sendKeys(customerData.getAddressLine2());
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("city")).clear();
        driver.findElement(By.id("city")).sendKeys(customerData.getCity());
        selectState(customerData.getState());
        driver.findElement(By.id("postcode")).click();
        driver.findElement(By.id("postcode")).clear();
        driver.findElement(By.id("postcode")).sendKeys(customerData.getPostCode());
        driver.findElement(By.id("id_country")).click();
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys(customerData.getPhone());
        driver.findElement(By.id("phone_mobile")).click();
        driver.findElement(By.id("phone_mobile")).clear();
        driver.findElement(By.id("phone_mobile")).sendKeys(customerData.getMobilePhone());
    }

    private void selectState( String state) {
        driver.findElement(By.id("id_state")).click();
        new Select(driver.findElement(By.id("id_state"))).selectByVisibleText(state);
        driver.findElement(By.id("id_state")).click();
    }

    private void selectYear( String year) {
        driver.findElement(By.id("years")).click();
        new Select(driver.findElement(By.id("years"))).selectByValue(year);
        driver.findElement(By.id("years")).click();
    }

    private void selectMonth( String monthNumber) {
        driver.findElement(By.id("months")).click();
        new Select(driver.findElement(By.id("months"))).selectByValue(monthNumber);
        driver.findElement(By.id("months")).click();
    }

    private void selectDay( String dayNumber) {
        driver.findElement(By.id("days")).click();
        new Select(driver.findElement(By.id("days"))).selectByValue(dayNumber);
        driver.findElement(By.id("days")).click();
    }

    private void initAccountCreation() {
        driver.findElement(By.id("email_create")).click();
        driver.findElement(By.id("email_create")).clear();
        driver.findElement(By.id("email_create")).sendKeys("kowalix93@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
    }

    private void accountCreation() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @AfterClass(alwaysRun = true)
        public void tearDown() throws Exception {
            driver.quit();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
        }
}
