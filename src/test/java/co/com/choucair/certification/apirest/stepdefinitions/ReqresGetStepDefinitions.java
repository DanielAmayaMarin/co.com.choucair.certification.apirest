package co.com.choucair.certification.apirest.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReqresGetStepDefinitions {

    @Given("Se cargo la información del cliente")
    public void seCargoLaInformaciónDelCliente(io.cucumber.datatable.DataTable dataTable) {
        System.out.println("Hola get");
    }

    @When("Llamo el metodo get de la API Usuarios")
    public void llamoElMetodoGetDeLaAPIUsuarios() {
        System.out.println("Hola get");
    }

    @Then("Debería ver el código del estado {int}")
    public void deberíaVerElCódigoDelEstado(Integer int1) {
        System.out.println("Hola get");
    }

    @Then("Valido la clave de cantidad es {int}")
    public void validoLaClaveDeCantidadEs(Integer int1) {
        System.out.println("Hola get");
    }

    @Then("Valido el esquema de la respuesta {string}")
    public void validoElEsquemaDeLaRespuesta(String string) {
        System.out.println("Hola get");
    }

    @Then("Valido los campos que obtengo de la respuesta")
    public void validoLosCamposQueObtengoDeLaRespuesta() {
        System.out.println("Hola get");
    }

    @Then("Valido la respuesta que contiene los datos esperados")
    public void validoLaRespuestaQueContieneLosDatosEsperados() {
        System.out.println("Hola get");
    }

}
