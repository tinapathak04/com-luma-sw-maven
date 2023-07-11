package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearTest extends Utility {

    By hoverOnGear = By.xpath("//span[contains(text(),'Gear')]");
    By clickGear = By.xpath("//span[contains(text(),'Gear')]");
    By clickOvernightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By textOvernightDuffel = By.xpath("//span[contains(text(),'Overnight Duffle')]");

    By change3 = By.xpath("//input[@id='qty']");

    By addToCart = By.xpath("//span[contains(text(),'Add to Cart')]");

    By verifyCart = By.xpath("//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]");

    By clickShoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");

    By verify3 = By.xpath("//input[@title='Qty']");

    By verify$135 = By.xpath("//span[@data-bind='text: getValue()']");
    By change5 = By.xpath("//input[@class='input-text qty']");
    By clickUpdate = By.xpath("//span[contains(text(),'Update Shopping Cart')]");
    By verify$225 = By.xpath("//td[@class='col subtotal']//span[text()='$225.00']");


    public void mouseHoverOnGear(){
        mouseHoverToElement(hoverOnGear);
    }
    public void clickOnGear(){
        clickOnElement(clickGear);
    }
    public void clickOnOvernightDuffle(){
        clickOnElement(clickOvernightDuffle);
    }
    public String verifyOvernightDuffle(){
        return getTextFromElement(textOvernightDuffel);
    }
    public void enter3 (){
        sendTextToElement(change3,"3");
    }
    public void addOnCart (){
        clickOnElement(addToCart);
    }
    public String verifyByCart(){
        return getTextFromElement(verifyCart);
    }
    public void clickCart(){
        clickOnElement(clickShoppingCart);
    }
    public String verifyBy3(){
        return getTextFromElement(verify3);
    }
    public String verifyBy$135(){
        return getTextFromElement(verify$135);
    }
    public void changeBy5(){
        sendTextToElement(change5,"5");
    }
    public void clickOnUpdate(){
        clickOnElement(clickUpdate);
    }
    public String verifyBy$225(){
        return getTextFromElement(verify$225);
    }







}
