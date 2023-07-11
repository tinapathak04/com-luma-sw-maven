package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenTest extends Utility {
    By menMenu = By.xpath("//span[contains(text(),'Men')]");
    By clickingMenu =By.xpath("//span[contains(text(),'Men')]");
    By mouseHoverBottoms = By.linkText("Bottoms");
    By hoverPants = By.linkText("Pants");
    By clickPants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By hoverCronusYogaPant = By.xpath("//a[contains(text(),'Cronus Yoga Pant')]");
    By clickSize32 = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By addToCart = By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");

    By clickBlackColour = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]");
    By verifyTextProductName = By.xpath("//body/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]");
    By clickCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By textShoppingCart = By.xpath("//body/div[1]/main[1]/div[1]/h1[1]/span[1]");
    By textCronusYogaPant = By.xpath("//tbody/tr[1]/td[1]/div[1]/strong[1]/a[1]");
    By verifyProduct32 = By.xpath("//dd[contains(text(),'32')]");
    By verifyProductBlack = By.xpath("//dd[contains(text(),'Black')]");


    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(menMenu);
    }
    public void clickingOnMenu(){
        clickOnElement(clickingMenu);
    }
    public void hoverOnBottoms(){
        mouseHoverToElement(mouseHoverBottoms);
    }
    public void hoverOnPants(){
        mouseHoverToElement(hoverPants);
    }
    public void clickOnPants(){
        clickOnElement(clickPants);
    }
    public void hoverOnCronusYogaPant(){
        mouseHoverToElement(hoverCronusYogaPant);
    }
    public void clickOnSize32(){
        clickOnElement(clickSize32);
    }
    public void addToShoppingCart(){
        clickOnElement(addToCart);
    }
    public void clickOnBlackColour(){
        clickOnElement(clickBlackColour);
    }
    public String verifyByText(){
        return getTextFromElement(verifyTextProductName);
    }
    public void clickOnCart(){
        clickOnElement(clickCart);
    }
    public String verifyTextOnShoppingCart(){
        return getTextFromElement(textShoppingCart);
    }
    public String verifyCronusYogaPant(){
        return getTextFromElement(textCronusYogaPant);
    }
    public String verifyOn32(){
        return getTextFromElement(verifyProduct32);
    }
    public String verifyOnBlack(){
        return getTextFromElement(verifyProductBlack);
    }
}
