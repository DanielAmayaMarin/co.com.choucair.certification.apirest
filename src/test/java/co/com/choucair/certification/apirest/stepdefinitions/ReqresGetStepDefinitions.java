package co.com.choucair.certification.apirest.stepdefinitions;

import co.com.choucair.certification.apirest.exceptions.AssertionsServices;
import co.com.choucair.certification.apirest.questions.*;
import co.com.choucair.certification.apirest.tasks.ConsumeGet;
import co.com.choucair.certification.apirest.tasks.Load;
import co.com.choucair.certification.apirest.utils.resource.WebServiceEndPoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;
import java.util.Map;

public class ReqresGetStepDefinitions {

    @Given("Que se cargo la información del cliente")
    public void que_se_cargo_la_información_del_cliente(List<Map<String, String >> data) {
        // System.out.println(data.get(0).get("id").toString());
        theActorInTheSpotlight().wasAbleTo(
                Load.testData(data.get(0))
        );
    }

    @When("Llamo el metodo get de la API Usuarios con la data")
    public void llamo_el_metodo_get_de_la_api_usuarios_con_la_data() {
        theActorInTheSpotlight().attemptsTo(
                ConsumeGet.service(
                        WebServiceEndPoints.URL.getUrl()
                )
        );
    }

    @Then("Debería ver el código del estado {int}")
    public void debería_ver_el_código_del_estado(int responseCode) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(StatusCode.is(responseCode))
                        .orComplainWith(AssertionsServices.class,
                                AssertionsServices.NO_SE_ESPERA_LA_RESPUESTA_DE_LOS_SERVICIOS_DE_CÓDIGO_DE_ESTADO)
        );
    }

    @Then("Valido la clave de cantidad es {int}")
    public void valido_la_clave_de_cantidad_es(int quantity) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheQuantityFieldsService.are(quantity)
                ).orComplainWith(AssertionsServices.class,
                        AssertionsServices.LA_CANTIDAD_DE_CAMPOS_REQUERIDOS_NO_LLEGARON_EN_LA_RESPUESTA)
        );
    }

    @Then("Valido el esquema de la respuesta {string}")
    public void valido_el_esquema_de_la_respuesta(String schemaResponse) {
       theActorInTheSpotlight().should(
               GivenWhenThen.seeThat(TheSchemaIs.expected(schemaResponse))
                       .orComplainWith(AssertionsServices.class,
                               AssertionsServices.EL_ESQUEMA_DE_LA_RESPUESTA_NO_ES_EL_CORRECTO)
       );
    }

    @Then("Valido los campos que obtengo de la respuesta")
    public void valido_los_campos_que_obtengo_de_la_respuesta() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(TheFieldsGetServicesResponseAre.expected())
                        .orComplainWith(AssertionsServices.class,
                        AssertionsServices.LOS_CAMPOS_OBTENIDOS_EN_LA_RESPUESTA_NO_SON_CORRECTOS)
        );
    }

    @Then("Valido la respuesta que contiene los datos esperados")
    public void valido_la_respuesta_que_contiene_los_datos_esperados() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(TheFieldsAndValuesGetResponseAre.expected())
                        .orComplainWith(AssertionsServices.class,
                                AssertionsServices.LOS_DATOS_OBTENIDOS_EN_LA_RESPUESTA_NO_SON_IGUALES_A_LOS_PROPORCIONADOS)
        );
    }


}
