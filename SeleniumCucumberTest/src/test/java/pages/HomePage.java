package pages;

import org.openqa.selenium.By;
import static utilities.BrowserDriver.*;

import org.openqa.selenium.WebElement;

public class HomePage {
    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_link_xpath = "//*[@id=\"menu\"]/a[2]/li";

    public static void click_hamburger_menu() throws InterruptedException {
        WebElement hamburger_menu = driver.findElement(By.xpath(hamburger_menu_xpath));
        wait.until(driver -> hamburger_menu.isEnabled());
        hamburger_menu.click();
    }

    public static void click_signIn_link() throws InterruptedException{
        WebElement signIn_link = driver.findElement(By.xpath(signIn_link_xpath));
        wait.until(driver -> signIn_link.isDisplayed());
        signIn_link.click();
    }

}
