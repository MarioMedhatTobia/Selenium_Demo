package pages;

import org.openqa.selenium.By;
import static SeleniumTools.DriverFactory.driver;

public class Login {

    public void LoginValidUser() {
        driver.get("https://practicesoftwaretesting.com/auth/login");
        driver.findElement(By.id("email")).sendKeys("mariomedhatmario3@gmail.com");
        driver.findElement(By.id("password")).sendKeys("D0n'tPl@ayW1thME");
        driver.findElement(By.className("btnSubmit")).click();
    }


}
