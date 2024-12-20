package com.mobileqaharoldcasas.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductosScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Container for fragments\"]/android.view.ViewGroup")
    private WebElement tienda;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement btnproduct;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement nomprod;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement quantity;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement addCartButton;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement logoCarrito;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement validarCantidad;

    //--------
    public boolean isProductDisplayed() {
        waitFor(ExpectedConditions.visibilityOf(tienda));
        return tienda.isEnabled();
    }

    public void btnProductClick() {
        btnproduct.click();
    }

    public String productoName() {
        return nomprod.getText();
    }

    public void addQuantity() {
        quantity.click();
    }

    public void agregarcarrito() {
        addCartButton.click();
    }

    public void logocart(){
        logoCarrito.click();
    }

    public void valcant() {
        validarCantidad.getText();
    }


}
