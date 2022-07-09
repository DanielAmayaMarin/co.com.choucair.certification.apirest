package co.com.choucair.certification.apirest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import org.hamcrest.Matchers;

public class TheQuantityFieldsService implements Question<Boolean> {

    private final int quantity;

    public TheQuantityFieldsService(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(
                ResponseConsequence.seeThatResponse("Validando la cantidad de campos en la respuesta del servicio",
                        response -> response
                                .assertThat()
                                .body("size()", Matchers.is(quantity)
                                )
                )
        );
        return true;
    }

    public static TheQuantityFieldsService are(int quantity) {
        return new TheQuantityFieldsService(quantity);
    }


}
