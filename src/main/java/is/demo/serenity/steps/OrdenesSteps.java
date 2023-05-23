package is.demo.serenity.steps;



import is.demo.serenity.pageObjects.OrdenesPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.Random;

public class OrdenesSteps {
    @Page
    private OrdenesPageObject ordenesPageObject;

    @Step("Hacer clic en la primer orden ")
    public void cliclAbrirOrden() {
        ordenesPageObject.abrirOrden.click();
    }

    @Step("Visualizar nombre cambiado")
    public void validarCambioDeNombre() {

        Assert.assertThat(
                "El nombre está visible",
                ordenesPageObject.nombreEmpleadoActual.isDisplayed(),
                Matchers.is(true)
        );
    }



}

