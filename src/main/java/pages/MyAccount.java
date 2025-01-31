package pages;

import org.openqa.selenium.By;
import static SeleniumTools.DriverFactory.driver;


public class MyAccount {
    public void AccountPage() {


        driver.get("https://practicesoftwaretesting.com/account");
        driver.findElement(By.className("nav-link active")).click();

    }
}