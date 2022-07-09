package co.com.choucair.certification.apirest.questions;

import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

public class TheSchemaIs implements Question<Boolean> {

    private  final String structure;

    public TheSchemaIs(String structure) {
        this.structure = structure;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(
                ResponseConsequence.seeThatResponse("Respuesta del servicio de esquema de validación",
                        response -> response
                                .assertThat()
                                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/"+structure+".json")))
        );
        return true;
    }

    public static TheSchemaIs expected(String schemaResponse) {
        return new TheSchemaIs(schemaResponse);
    }
}
