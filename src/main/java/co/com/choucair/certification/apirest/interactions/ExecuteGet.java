package co.com.choucair.certification.apirest.interactions;

import static io.restassured.http.ContentType.JSON;

import co.com.choucair.certification.apirest.exceptions.ErrorServicesException;
import co.com.choucair.certification.apirest.models.TestData;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Get;
import org.apache.http.HttpStatus;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ExecuteGet implements Interaction {

    private final String resource;

    public ExecuteGet(String resource) {
        this.resource = resource;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.reset();
        actor.attemptsTo(
                Get.resource(resource)
                        .with(request -> request
                                .contentType(JSON).params(TestData.getData())
                                .relaxedHTTPSValidation()
                        )
        );
        if (SerenityRest.lastResponse().statusCode() != HttpStatus.SC_OK){
            throw new ErrorServicesException("Aparentemente hay un error en el consumo o el servicio");
        }
    }

    public static ExecuteGet service(String resource) {
        return instrumented(ExecuteGet.class, resource );
    }


}
