package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Register_Page extends AbstractClass {
    private WebDriver driver;

    public Register_Page() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a.login")
    private WebElement signInButton;

    @FindBy(name = "email_create")
    private WebElement emailTextBox;

    @FindBy(id = "SubmitCreate")
    private WebElement submitButton;

    @FindBy(id = "id_gender1")
    private WebElement gender;

    @FindBy(id = "customer_firstname")
    private WebElement firstname;

    @FindBy(id = "customer_lastname")
    private WebElement lastname;

    @FindBy(name = "passwd")
    private WebElement password;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(name = "address1")
    private WebElement address;

    public void signsignInButton (){
        clickFunction(signInButton);
    }
    public void typeemailTextBox (String email){
        sendKeysFunction(emailTextBox,email);
    }
    public void clicksubmitButton(){
        clickFunction(submitButton);
    }
    public void clickGender(){
        clickFunction(gender);
    }
    public void typeFirstnameLastname(String firstname1, String lastname1){
        sendKeysFunction(firstname,firstname1);
        sendKeysFunction(lastname,lastname1);
    }
    public void typePassword(String password1){
        sendKeysFunction(password,password1);
    }
    public void typeCompany(String company1){
        sendKeysFunction(company,company1);
    }
    public void typeAddress(String address1){
        sendKeysFunction(address,address1);
    }



}


