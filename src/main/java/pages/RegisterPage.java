package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegisterPage {
    @FindBy(xpath = "//fieldset/form/div[3]/a")
    WebElement btnRegister;
    @FindBy(xpath = "//fieldset/form/div[1]/input")
    WebElement firstName;
    @FindBy(xpath = "//fieldset/form/div[2]/input")
    WebElement lastName;
    @FindBy(xpath = "//fieldset/form/div[3]/input")
    WebElement userName;
    @FindBy(xpath = "//fieldset/form/div[4]/input")
    WebElement password;
    @FindBy(xpath = "//fieldset/form/div[5]/button")
    WebElement register;
    @FindBy(xpath = "/html/body/div/div/div/div/div[2]")
    WebElement text;
    @FindBy(xpath = "/html/body/div/div/div/div/fieldset/form/div[2]/span")
    WebElement FText1;
    @FindBy(xpath = "//div/div[2]")
    WebElement FText2;


    public void setBtnRegister() {
        this.btnRegister.click();
    }

    public void setInformationUser(String firstName, String lastName, String userName, String password) {
        this.firstName.clear();
        if (!firstName.equals("null")) {
            this.firstName.sendKeys(firstName);
        }
        this.lastName.clear();
        if (!lastName.equals("null")) {
            this.lastName.sendKeys(lastName);
        }
        this.userName.clear();
        if (!userName.equals("null")) {
            this.userName.sendKeys(userName);
        }
        this.password.clear();
        if (!password.equals("null")) {
            this.password.sendKeys(password);
        }
    }

    public void clickRegister() {
        register.click();
    }

    public void registerSuccess(String text) {
        String tx = this.text.getText();
        Assert.assertEquals(tx, text);
    }

    public void registerUnSuccess(String text) {
        String tx = this.FText1.getText();
        Assert.assertEquals(tx, text);

    }

    public void verifyAccountExit(String text) {
        String tx = this.FText2.getText();
        Assert.assertEquals(tx, text);
    }

}
