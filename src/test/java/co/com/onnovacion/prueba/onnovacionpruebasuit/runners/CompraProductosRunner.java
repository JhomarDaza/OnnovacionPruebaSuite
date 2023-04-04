package co.com.onnovacion.prueba.onnovacionpruebasuit.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/co.com.onnovacion.prueba.onnovacionpruebasuit/features/compra_producto.feature",
        glue = "co.com.onnovacion.prueba.onnovacionpruebasuit.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class CompraProductosRunner {
}
