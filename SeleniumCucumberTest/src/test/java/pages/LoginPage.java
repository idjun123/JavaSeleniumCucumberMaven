package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.BrowserDriver.*;

public class LoginPage {

    public static WebElement loginUsername_field = driver.findElement(By.xpath("//*[@id=\"usr\"]"));
    public static WebElement loginPassword_field = driver.findElement(By.xpath( "//*[@id=\"pwd\"]"));
    public static WebElement login_Button = driver.findElement(By.xpath("//*[@id=\"second_form\"]/input"));

    public static void fillLoginFields() throws InterruptedException {

        loginUsername_field.sendKeys("sa");
        loginPassword_field.sendKeys("sa");
    }

    public static void clickSignIn() throws InterruptedException{
        login_Button.click();
    }

}
