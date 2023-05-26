package is.demo.serenity.steps;

import  is.demo.serenity.pageObjects.DashBoardPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.hamcrest.Matchers;


public class DashBoardSteps {

    @Page
    private DashBoardPageObject dashBoardPageObject;


    @Step("se muestra el dashboard")
    public void validadInicioSesion(){
        Assert.assertThat(
                "El dashboard está visible",
                dashBoardPageObject.dashboard.isDisplayed(),
                Matchers.is(true)
        );
    }

    @Step("Hacer clic en abrir ordenes  ")
    public void clicAbrirOrdenes(){
        dashBoardPageObject.abrirOrdenes.click();
    }

}
