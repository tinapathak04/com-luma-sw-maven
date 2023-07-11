package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearTest;
import com.softwaretestingboard.magento.pages.MenTest;
import com.softwaretestingboard.magento.pages.WomenTest;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PagesTest extends BaseTest {


    WomenTest women = new WomenTest();
    MenTest men = new MenTest();
    GearTest gear = new GearTest();



    @Test
    public void verifyTheSortByProductNameFilter(){
        women.mouseHoverOnWomenMenu();
        women.clickOnMenu();
        women.mouseHoverOnTop();
        women.mouseHoverToJackets();
        //women. clickOnJackets();
        women.sortByProductName();
        women.clickOnElement();

        String expectedText = "Set Ascending Direction";
        String actualText =women.verifyProductInAlphabeticalOrder();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
    }
    @Test
     public void verifyTheSortByPriceFilter(){
        women.mouseHoverOnWomenMenu();
        women.clickOnMenu();
        women.mouseHoverOnTops();
        //women.clickOnJackets();
        women.mouseHoverToJackets();
        women.sortByPrice();
        women.clickOnElement();

        String expectedText = "Set Ascending Direction";
        String actualText =women.verifyLowToHigh();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
    }
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        men.mouseHoverOnMenMenu();
        men.clickingOnMenu();
        men.hoverOnBottoms();
        men.hoverOnPants();
        men.clickOnPants();
        men.hoverOnCronusYogaPant();
        men.clickOnSize32();
        men.hoverOnCronusYogaPant();
        men.clickOnBlackColour();
        men.addToShoppingCart();

        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = men.verifyByText();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");

        men.clickOnCart();
        String expectedText1 = "Shopping Cart.";
        String actualText1 = men.verifyTextOnShoppingCart();
        Assert.assertEquals(actualText1,expectedText1,"Message not displayed");

        String expectedText2 = "Cronus Yoga Pant";
        String actualText2 = men.verifyCronusYogaPant();
        Assert.assertEquals(actualText2,expectedText2,"Message not displayed");

        String expectedText3 = "32";
        String actualText3 = men.verifyOn32();
        Assert.assertEquals(actualText3,expectedText3,"Message not displayed");

        String expectedText4 = "Black";
        String actualText4 = men.verifyOnBlack();
        Assert.assertEquals(actualText4,expectedText4,"Message not displayed");

    }
    @Test
    public void userShouldAddProductSuccessFullyToFinalShoppingCart(){
        gear.mouseHoverOnGear();
        gear.clickOnGear();
        gear.clickOnOvernightDuffle();

        String expectedText = "Overnight Duffle";
        String actualText = gear.verifyOvernightDuffle();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");

        gear.enter3();
        gear.addOnCart();

        String expectedText1 = "You added Overnight Duffle to your shopping cart.";
        String actualText1 = gear.verifyByCart();
        Assert.assertEquals(actualText1,expectedText1,"Message not displayed");

        gear.clickCart();

        String expectedText2 = "3";
        String actualText2 = gear.verifyBy3();
        Assert.assertEquals(actualText2,expectedText2,"Message not displayed");

        String expectedText3 = "$135.00";
        String actualText3 = gear.verifyBy$135();
        Assert.assertEquals(actualText3,expectedText3,"Message not displayed");

        gear.changeBy5();
        gear.clickOnUpdate();

        String expectedText4 = "$225.00";
        String actualText4 = gear.verifyBy$225();
        Assert.assertEquals(actualText4,expectedText4,"Message not displayed");

    }


}
