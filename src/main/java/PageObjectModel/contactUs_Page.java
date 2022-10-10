package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class contactUs_Page extends AbstractClass {
    WebDriver driver;

    public contactUs_Page() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUsButton;

    public void clickContactUsButton(){
        clickFunction(contactUsButton);
    }
    @FindBy(id = "id_contact")
    private WebElement subjectHeadingDropdown;

    public void selectFromDropdown(){
        selectElementFromDropDown(subjectHeadingDropdown,"Webmaster");
    }
    @FindBy(id = "email")
    private WebElement emailTextArea;

    public void typeEmail(){
        sendKeysFunction(emailTextArea,"emirhansahin@gmail.com");
    }
    @FindBy(name = "id_order")
    private WebElement order;

    public void typeOrderReference(){
        sendKeysFunction(order,"order123");
    }
    @FindBy(id = "message")
    private WebElement messageBox;

    public void typeMessage(){
        sendKeysFunction(messageBox,"Ürün arızalı geldi. İletişime geçer misiniz?");
    }
    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    public void clickOnSendButton(){
        clickFunction(sendButton);
    }
    @FindBy(css = ".alert.alert-success")
    private WebElement successMessage;

    public void assertMyMessage(){
        Assertion(successMessage,"Your message has been successfully sent to our team.");
    }
}

