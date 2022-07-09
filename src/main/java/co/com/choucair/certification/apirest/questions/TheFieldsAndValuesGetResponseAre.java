package co.com.choucair.certification.apirest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import org.hamcrest.Matchers;

public class TheFieldsAndValuesGetResponseAre implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(
                ResponseConsequence.seeThatResponse("Los valores optenidos de la respuesta de la api existe",
                        response -> response
                                .assertThat()
                                .and().body("data.id", Matchers.equalTo(5))
                                .and().body("data.email", Matchers.equalTo("charles.morris@reqres.in"))
                                .and().body("data.first_name", Matchers.equalTo("Charles"))
                                .and().body("data.last_name", Matchers.equalTo("Morris"))
                                .and().body("data.avatar", Matchers.equalTo("https://reqres.in/img/faces/5-image.jpg"))
                )
        );
        return true;
    }

    public static TheFieldsAndValuesGetResponseAre expected() {
        return new TheFieldsAndValuesGetResponseAre();
    }
}
