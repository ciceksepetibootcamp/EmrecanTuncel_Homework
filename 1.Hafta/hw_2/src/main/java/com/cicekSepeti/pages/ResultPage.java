package com.cicekSepeti.pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage {

    By numberOfProducts = (By.xpath("//span[@class='js-order-count']"));
    By lastProductOnPage = (By.xpath("(//*[@class='products__item-inner'])[60]"));
    By firstProductOnPage = (By.xpath("(//*[@class='products__item-inner'])[1]"));
    By secondProductOnPage = (By.xpath("(//*[@class='products__item-inner'])[2]"));
    By firstProductTitle = By.xpath("(//*[@class='products__item-title'])[1]");
    By addedProduct = By.xpath("//span[@class='js-product-title js-ellipsize-text']");
    WebDriver driver;
    WebDriverWait wait;



    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkControlPageLoaded() throws InterruptedException {
        String urunAdediText = driver.findElement(numberOfProducts).getText();
        System.out.println("Bu Aramaya Ait Ürün Adedi : " + urunAdediText);
        Integer urunAdediInt = Integer.valueOf(urunAdediText);
        if (urunAdediInt > 60) {
            Thread.sleep(5000);
            scrollToLastProductInFirstPage();
            Thread.sleep(5000);
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='products__item-inner'])[61]")));
            checkNewPageLoad();
        } else {
            System.out.println("Bu Ürün Tek Sayfadan oluşmaktadır, 'sayfa yüklendi mi?' testi yapılamaz.");
            Assert.fail();
        }
    }

    public void scrollToLastProductInFirstPage() throws InterruptedException {
        Thread.sleep(5000);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='js-order-count']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(lastProductOnPage));


    }

    public void checkNewPageLoad() {
        String url = driver.getCurrentUrl();
        System.out.println("Güncel URL : " + url);
        if (url.contains("page")) {
            System.out.println("Yeni Sayfa Yüklendi");
        } else {
            System.out.println("Yeni Sayfa Yüklenemedi");
            Assert.fail();
        }
    }

    public ProductDetailPage compareProductsTitle() throws InterruptedException {
        Thread.sleep(10000);
        String selectedProductTitle = driver.findElement(firstProductTitle).getText();
        driver.findElement(firstProductOnPage).click();
        String firstProductTitle = driver.findElement(addedProduct).getText();
        Assert.assertEquals(firstProductTitle,selectedProductTitle);
        return new ProductDetailPage(driver);
    }
    public ProductDetailPage clickSecondProduct() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(secondProductOnPage).click();
        return new ProductDetailPage(driver);
    }

}
