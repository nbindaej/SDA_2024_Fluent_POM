package pages.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccountPage {
    WebDriver ldriver;
    By firstNameById = By.id("input-firstname");
    By lastNameById = By.id("input-lastname");
    By emailById = By.id("input-email");
    By telephoneById = By.id("input-telephone");
    By passwordById = By.id("input-password");
    By confirmPasswordById = By.id("input-confirm");
    By agreeByXpath = By.xpath("//*[@for='input-agree']");
    By continueByXpath = By.xpath("//input[@type='submit']");

    public RegisterAccountPage(WebDriver gdriver){
        ldriver = gdriver;
    }

    public RegisterAccountPage enterFirstName(String firstname){
        ldriver.findElement(firstNameById).sendKeys(firstname);
        return this;
    }

    public RegisterAccountPage enterlastName(String lastname){
        ldriver.findElement(lastNameById).sendKeys(lastname);
        return this;
    }

    public RegisterAccountPage enterEmail (String email){
        ldriver.findElement(emailById).sendKeys(email);
        return this;
    }

    public RegisterAccountPage enterTelephone(String phoneNum){
        ldriver.findElement(telephoneById).sendKeys(phoneNum);
        return this;
    }

    public RegisterAccountPage enterPassword(String password){
        ldriver.findElement(passwordById).sendKeys(password);
        return this;
    }

    public RegisterAccountPage confirmPassword(String password){
        ldriver.findElement(confirmPasswordById).sendKeys(password);
        return this;
    }
    public RegisterAccountPage clickAgree(){
        ldriver.findElement(agreeByXpath).click();
        return this;
    }

    public RegisterSuccessPage clickContinue(){
        ldriver.findElement(continueByXpath).click();
        return new RegisterSuccessPage(ldriver);
    }

}
