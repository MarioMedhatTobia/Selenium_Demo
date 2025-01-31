package pages;

import SeleniumTools.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static SeleniumTools.DriverFactory.driver;


public class Registration {
    public void FillRegister() {
        driver = DriverFactory.getDriver();
        driver.navigate().to("https://practicesoftwaretesting.com/auth/register");
        driver.findElement(By.id("first_name")).sendKeys("John");
        driver.findElement(By.id("last_name")).sendKeys("Mark");
        driver.findElement(By.id("dob")).sendKeys("12/19/1980");
        driver.findElement(By.id("address")).sendKeys("Maadi");
        driver.findElement(By.id("postcode")).sendKeys("12588");
        driver.findElement(By.id("city")).sendKeys("Cairo");
        driver.findElement(By.id("state")).sendKeys("Cairo");
        driver.findElement(By.id("country")).sendKeys("Egypt");
        driver.findElement(By.id("phone")).sendKeys("0122828028");
        driver.findElement(By.id("email")).sendKeys("mariomedhatmario3@gmail.com");
        driver.findElement(By.id("password")).sendKeys("D0n'tPl@ayW1thME");

        driver.findElement(By.className("btnSubmit mb-3")).click();



    }
}