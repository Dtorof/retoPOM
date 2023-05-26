package is.demo.serenity.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import is.demo.serenity.steps.DashBoardSteps;
import is.demo.serenity.steps.PaginaInicioSteps;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class InicioDeSesionStepDefinition {
    @Steps
    PaginaInicioSteps paginaInicioSteps;
    @Steps
    DashBoardSteps dashBoardSteps;

    @Dado("que el usuario ha abierto el navegador en la página de inicio de sesión")
    public void queElUsuarioHaAbiertoElNavegadorEnLaPaginaDeInicioDeSesion() throws IOException {
        paginaInicioSteps.abrirUrl();
    }
    @Cuando("el usuario  limpia los campos y ingresa las credenciales")
    public void elUsuarioLimpiaLosCamposYIngresaLasCredenciales() throws IOException {
        paginaInicioSteps.limpiarCampoUsuario();
        paginaInicioSteps.ingresarUsuario();
        paginaInicioSteps.limpiarCampoClave();
        paginaInicioSteps.ingresarClave();
        paginaInicioSteps.ingresarCredenciales();
    }
    @Entonces("el usuario es redirigido al dashboard")
    public void elUsuarioEsRedirigidoAlDashboard() {
        //dashBoardSteps.validadInicioSesion();
    }

}
