package com.cicekSepeti.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductDetailPage {
    By addBasketButton = By.xpath("//button[@class='btn btn-xlg btn-success product__action-button js-add-to-cart js-product-datas js-clickable-by-tab']");

    WebDriver driver;

    public  ProductDetailPage (WebDriver driver){this.driver = driver;}

    public BasketPage getBasketPage() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(addBasketButton).click();
        return new BasketPage(driver);
    }
}
