package com.cicekSepeti.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    By sifremiUnuttumButton = By.xpath("//a[@class='login__forgot-password js-forgot-password']");
    By emailGirBox = By.xpath("//input[@class='form-control js-placeholder js-password-recovery-input']");
    By gonderButton = By.xpath("//button[@class='btn btn-lg btn-primary form-password-recovery__btn js-password-recovery-button']");
    By successBox = By.xpath("//div[@class='password-recovery-result js-password-recovery-result is-hidden is-visible']");
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkSifremiUnuttum() throws InterruptedException {
        driver.findElement(sifremiUnuttumButton).click();
        Thread.sleep(5000);
        driver.findElement(emailGirBox).sendKeys("deneme@deneme.com");
        Thread.sleep(3000);
        driver.findElement(gonderButton).click();
        Thread.sleep(1000);
        Assert.assertTrue("",driver.findElement(successBox).isDisplayed());
    }
}
