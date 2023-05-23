package is.demo.serenity.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import is.demo.serenity.steps.DashBoardSteps;
import is.demo.serenity.steps.OrdenSeleccionadaSteps;
import is.demo.serenity.steps.OrdenesSteps;
import is.demo.serenity.steps.PaginaInicioSteps;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class InicioDeSesionStepDefinition {
    @Steps
    PaginaInicioSteps paginaInicioSteps;
    @Steps
    DashBoardSteps dashBoardSteps;

    @Dado("que el usuario abre el navegador en la url")
    public void queElUsuarioAbreElNavegadorEnLaUrl() throws IOException {
        paginaInicioSteps.abrirUrl();
    }
    @Cuando("el usuario  limpia los campos y ingresa las credenciales")
    public void elUsuarioLimpiaLosCamposYIngresaLasCredenciales() throws IOException {
        paginaInicioSteps.limpiarCampoUsuario();
        paginaInicioSteps.ingresarUsuario();
        paginaInicioSteps.limpiarCampoClave();
        paginaInicioSteps.ingresarClave();
        paginaInicioSteps.clicIngresar();
    }
    @Entonces("el usuario puede visualizar el dashboard")
    public void elUsuarioPuedeVisualizarElDashboard() {
        dashBoardSteps.validadInicioSesion();
    }

}
