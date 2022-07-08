package co.com.choucair.certification.apirest.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReqresPostStepDefinitions {
    @Given("I prepare the information to be recorded")
    public void i_prepare_the_information_to_be_recorded(io.cucumber.datatable.DataTable dataTable) {
        System.out.println("Hola post");
    }

    @When("I call post user API")
    public void i_call_post_user_api() {
        System.out.println("Hola post");
    }

    @Then("I should see the status code post {int}")
    public void i_should_see_the_status_code_post(Integer int1) {
        System.out.println("Hola post");
    }

    @Then("I validate the data I post from the api response")
    public void i_validate_the_data_i_post_from_the_api_response() {
        System.out.println("Hola post");
    }
}
