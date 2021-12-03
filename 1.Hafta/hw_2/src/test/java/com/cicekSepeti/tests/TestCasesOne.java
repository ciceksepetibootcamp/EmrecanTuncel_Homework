package com.cicekSepeti.tests;

import com.cicekSepeti.pages.BasketPage;
import com.cicekSepeti.pages.HomePage;
import com.cicekSepeti.pages.ProductDetailPage;
import com.cicekSepeti.pages.ResultPage;
import org.junit.Test;

public class TestCasesOne extends BaseTest{
    @Test
    public void addToBasket() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.closeInfoBoxes(); // Pop-Up'ların kapatılması
        ResultPage resultPage = homePage.searchItem();//Ürün arama
        ProductDetailPage productDetailPage =resultPage.clickSecondProduct();//Listelenen ürünlerden 2.sine tıklama
        BasketPage basketPage = productDetailPage.getBasketPage();//Ürünü sepete ekleme
        basketPage.checkBasketIconAction();//Sepet sayfasında; sağ üstte bulunan, sepet logosu üzerindeki sayı ile sepetteki ürün sayısı eşit mi? kontrolü
    }
    @Test
    public void compareSelectedProduct() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.closeInfoBoxes();// Pop-Up'ların kapatılması
        ResultPage resultPage = homePage.searchItem();//Ürün arama
        resultPage.compareProductsTitle(); //Sepete eklenen ürün ile sepetteki ürün başlıkları aynı mı?
    }
}
