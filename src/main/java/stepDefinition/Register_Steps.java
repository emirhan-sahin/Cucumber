package stepDefinition;

import PageObjectModel.Register_Page;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Register_Steps {

    private WebDriver driver;
    Register_Page Register_Page = new Register_Page();


    @Given("Navigate on Websites")
    public void navigate_on_websites() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("click Sign in button")
    public void clickSignInButton() {
        Register_Page.signsignInButton();

    }

    @And("type email {string}")
    public void typeEmail(String email) {
        Register_Page.typeemailTextBox(email);
    }

    @And("click on Create an Account button")
    public void clickOnCreateAnAccountButton() {
        Register_Page.clicksubmitButton();
    }

    @And("choose title")
    public void chooseTitle() {
        Register_Page.clickGender();
    }

    @And("type firstname {string} and lastname {string}")
    public void typeFirstnameAndLastname(String firstname, String lastname) {

        Register_Page.typeFirstnameLastname(firstname,lastname);
    }

    @And("type password {string}")
    public void typePassword(String password) {
        Register_Page.typePassword(password);
    }

    @And("type Company {string}")
    public void typeCompany(String company) {
        Register_Page.typeCompany(company);
    }

    @And("type address {string}")
    public void typeAddress(String address) {
        Register_Page.typeAddress(address);
    }

    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        Driver.closeDriver();
    }
}
