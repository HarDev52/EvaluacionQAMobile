package com.mobileqaharoldcasas.steps;

//import com.mobileqaharoldcasas.screens.MyCart;
import com.mobileqaharoldcasas.screens.ProductosScreen;
import org.junit.Assert;

public class StoreMSteps {

    ProductosScreen productsScreen;
  //  MyCart myCart;


    public void welcomeSuccess() {
        Assert.assertTrue("Visibilidad de los products", productsScreen.isProductDisplayed());
    }

    public void btnprod() {
        productsScreen.btnProductClick();
    }

    public void valProducto(String nomProducto) {
        Assert.assertEquals("Nombre del producto",nomProducto,productsScreen.productoName());
    }

    public void valCantidad(int cantidad) {
        for(int i=0;i<cantidad;i++) {
            productsScreen.addQuantity();
        }
    }

    public void Agregar() {
        productsScreen.agregarcarrito();
    }

    public void ClickCarrito() {
        productsScreen.logocart();
    }

    public void ValCarrito() {
        productsScreen.valcant();
    }
}
