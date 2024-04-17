package pages.Homework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterSuccessPage {
    WebDriver ldriver;
    By successMessage = By.xpath("//h1[contains(text(),'Created')]");

    public RegisterSuccessPage (WebDriver gdriver){
        ldriver = gdriver;
    }

    public void verifyRegisterSuccessed(){
        WebElement message = ldriver.findElement(successMessage);
        Assert.assertTrue(message.isDisplayed());
    }

}
