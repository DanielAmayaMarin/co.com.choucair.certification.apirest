package co.com.choucair.certification.apirest.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Regression",
        features = "src/test/resources/features/",
        glue = {
                "co.com.choucair.certification.apirest.stepdefinitions.hook",
                "co.com.choucair.certification.apirest.stepdefinitions"
        },
        monochrome = true


)

public class ReqresRunners {
}
