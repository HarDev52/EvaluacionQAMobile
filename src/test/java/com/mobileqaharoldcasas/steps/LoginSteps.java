/*package com.mobileqaharoldcasas.steps;

import com.mobileqaharoldcasas.screens.LoginScreen;
import com.mobileqaharoldcasas.screens.ProductsScreen;
import org.junit.Assert;

public class LoginSteps {

    LoginScreen loginScreen;
    ProductsScreen productsScreen;

    public void login(String user, String password){
        loginScreen.enterUser(user);
        loginScreen.enterPassword(password);
        loginScreen.clickLogin();
    }

    public void loginSuccess(){
        Assert.assertTrue("Visibilidad de título products", productsScreen.isProductDisplayed());
    }

    public void validateErrorMessage(String message){
        Assert.assertEquals("Mensaje de error", message, loginScreen.getErrorMessage());
    }
}
**/