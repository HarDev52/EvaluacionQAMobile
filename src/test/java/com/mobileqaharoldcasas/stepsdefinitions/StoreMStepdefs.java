package com.mobileqaharoldcasas.stepsdefinitions;


//import com.mobileqaharoldcasas.screens.MyCart;
import com.mobileqaharoldcasas.steps.StoreMSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class StoreMStepdefs {
    @Steps
    StoreMSteps productsScreen;


    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs() {

    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        productsScreen.welcomeSuccess();

    }

    @When("agrego {} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(int cantidad, String nomProducto ) {
        productsScreen.btnprod();
        productsScreen.valProducto(nomProducto);
        productsScreen.valCantidad(cantidad);
        productsScreen.Agregar();
        productsScreen.ClickCarrito();
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        productsScreen.ValCarrito();
    }
}
