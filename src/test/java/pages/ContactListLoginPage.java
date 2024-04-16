package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListLoginPage {
    WebDriver ldriver;
    By emailById = By.id("email");
    By passwordById = By.id("password");
    By submitById = By.id("submit");

    public ContactListLoginPage(WebDriver gdriver){
        ldriver = gdriver;
    }

    public ContactListLoginPage enterEmail(String email){
        ldriver.findElement(emailById).sendKeys(email);
        return this;
    }

    public ContactListLoginPage enterPassword(String password){
        ldriver.findElement(passwordById).sendKeys(password);
        return this;
    }

    public ContactListHomePage clickSubmit(){
        ldriver.findElement(submitById).click();
        return new ContactListHomePage(ldriver);
    }

}
