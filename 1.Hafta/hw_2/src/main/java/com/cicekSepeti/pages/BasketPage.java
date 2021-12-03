package com.cicekSepeti.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage {
    By checkBusketIcon = By.xpath("(//span[@class='user-menu__cart-quantity js-user-menu-cart-quantity'])[1]");
    WebDriver driver;
    public  BasketPage (WebDriver driver){this.driver = driver;}
    public void checkBasketIconAction() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(checkBusketIcon).getText(),"1");
    }

}
