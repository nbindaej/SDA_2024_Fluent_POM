package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListHomePage {
    WebDriver ldriver;

    By logoutById = By.id("logout");


    public ContactListHomePage(WebDriver gdriver){
        ldriver = gdriver;
    }

    public void clickLogout(){
        ldriver.findElement(logoutById).click();
    }
}
