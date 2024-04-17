package pages.Homework;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccountPage {
    WebDriver ldriver;
    Faker faker = new Faker();
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

    public RegisterAccountPage enterFirstName(){
        ldriver.findElement(firstNameById).sendKeys(faker.name().firstName());
        return this;
    }

    public RegisterAccountPage enterlastName(){
        ldriver.findElement(lastNameById).sendKeys(faker.name().lastName());
        return this;
    }

    public RegisterAccountPage enterEmail (){
        ldriver.findElement(emailById).sendKeys(faker.internet().emailAddress());
        return this;
    }

    public RegisterAccountPage enterTelephone(){
        ldriver.findElement(telephoneById).sendKeys(faker.phoneNumber().cellPhone());
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
