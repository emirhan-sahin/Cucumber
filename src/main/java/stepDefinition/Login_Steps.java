package stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {
    @Given("^Go to Amazon website$")
    public void go_to_Amazon_website() throws Throwable {
        System.out.println("Siteye gidildi.");

    }

    @Given("^click login button$")
    public void click_login_button() throws Throwable {
        System.out.println("Login butonuna tıklandı.");

    }

    @Given("^enter firstName$")
    public void enter_firstName() throws Throwable {
        System.out.println("İsim girildi.");

    }

    @Given("^enter password$")
    public void enter_password() throws Throwable {
        System.out.println("Şifre girildi.");
    }

    @When("^click submit button$")
    public void click_submit_button() throws Throwable {

        System.out.println("Submit butonuna tıklandı.");

    }

    @Then("^verify success messages$")
    public void verify_success_messages() throws Throwable {
        System.out.println("Login işlemi başarıyla tamamlandı.");

    }




}
