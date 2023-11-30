package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import static utilities.BrowserDriver.*;

public class CollectionPage {

    public static String formalShoes_title = "//*[@id=\"ShoeType\"]";

    public static void formalShoesValidation() throws InterruptedException {
        String actualText = driver.findElement(By.xpath(formalShoes_title)).getText();
        Assert.assertEquals("Formal Shoes" , actualText);
    }

}
