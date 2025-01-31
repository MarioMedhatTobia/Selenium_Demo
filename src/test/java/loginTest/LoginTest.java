package loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Login;
import org.testng.annotations.Test;

import java.time.Duration;

import static SeleniumTools.DriverFactory.driver;


public class LoginTest {

    final Login login = new Login();

 //   Now working

    @Test
    public void LoginWithValidCredentials() {
        login.LoginValidUser();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMessageElement =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.help-block")));
        String errorMessage = errorMessageElement.getText();
        System.out.println(errorMessage);
        Assert.assertEquals("Invalid email or password",errorMessage);

    }
}

