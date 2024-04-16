package tests.Homework;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Homework.RegisterAccountPage;

import java.time.Duration;

public class RegisterTest {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");

        RegisterAccountPage rap = new RegisterAccountPage(driver);
        rap
                .enterFirstName("Norah")
                .enterlastName("Aziz")
                .enterEmail("norahAziz@email.com")
                .enterTelephone("0501199220")
                .enterPassword("abc123")
                .confirmPassword("abc123")
                .clickAgree()
                .clickContinue()
                .verifyRegisterSuccessed();

    }
}
