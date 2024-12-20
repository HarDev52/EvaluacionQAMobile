/*package com.mobileqaharoldcasas.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement lblProduct;

    public boolean isProductDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(lblProduct));
        return lblProduct.isEnabled();
    }
}
*/