package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class WomenTest extends Utility {

    By womenMenu = By.xpath("//span[contains(text(),'Women')]");
    By clickMenu = By.xpath("//span[contains(text(),'Women')]");
    By hoverTop = By.linkText("Tops");
    By hoverJackets = By.linkText("Jackets");
    //By clickJackets = By.xpath("//strong[contains(text(),'Jackets')]");
    By selectProduct = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]");

    By clickElement = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]");
    By verifyProductName = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]");
    By mouseHoverTops = By.linkText("Tops");
    By mouseHoverJackets = By.linkText("Jackets");
    By sortPrice = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]");
    By verifyByLowToHigh = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]");







    public void mouseHoverOnWomenMenu(){
        mouseHoverToElement(womenMenu);
    }
    public void clickOnMenu(){
        clickOnElement(clickMenu);
    }
    public void mouseHoverOnTop(){
        mouseHoverToElement(hoverTop);
    }
    public void mouseHoverToJackets(){
        mouseHoverToElementAndClick(hoverJackets);
    }

    //public void clickOnJackets(){
        //mouseHoverToElement(clickJackets);
   // }

    public void sortByProductName(){
        selectByValueFromDropDown(selectProduct,"name");
    }
    public void clickOnElement(){
        clickOnElement(clickElement);
    }
    public String verifyProductInAlphabeticalOrder(){
        return getTextFromElement(verifyProductName);
    }
    public void mouseHoverOnTops(){
        mouseHoverToElement(mouseHoverTops);
    }
    public void mouseHoverOnJackets(){
        mouseHoverToElement(mouseHoverJackets);
    }
    public void sortByPrice(){
        selectByValueFromDropDown(sortPrice,"price");
    }
    public String verifyLowToHigh(){
        return getTextFromElement(verifyByLowToHigh);
    }


}
