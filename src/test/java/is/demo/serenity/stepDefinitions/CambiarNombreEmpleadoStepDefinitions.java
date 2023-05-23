package is.demo.serenity.stepDefinitions;


import is.demo.serenity.steps.DashBoardSteps;
import is.demo.serenity.steps.OrdenSeleccionadaSteps;
import is.demo.serenity.steps.OrdenesSteps;
import  is.demo.serenity.steps.PaginaInicioSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
public class CambiarNombreEmpleadoStepDefinitions {
    @Steps PaginaInicioSteps paginaInicioSteps;
    @Steps DashBoardSteps dashBoardSteps;

    @Steps OrdenesSteps ordenesSteps;

    @Steps OrdenSeleccionadaSteps ordenSeleccionadaSteps;


    @Dado("El usuario limpie los campos e ingrese las credenciales")
    public void queElUsuarioEstáLogueado() throws IOException {
        paginaInicioSteps.abrirUrl();
        paginaInicioSteps.clicIngresar();
        dashBoardSteps.validadInicioSesion();
    }
    @Dado("el usuario hace clic en Open Orders")
    public void elUsuarioHaceClicEnOpenOrders() {
        dashBoardSteps.clicAbrirOrdenes();
    }
    @Cuando("el usuario hace clic en una orden de compra")
    public void elUsuarioHaceClicEnUnaOrdenDeCompra() {
        ordenesSteps.cliclAbrirOrden();
    }
    @Cuando("el usuario hace clic en el selector de empleado")
    public void elUsuarioHaceClicEnElSelectorDeEmpleado() {
        ordenSeleccionadaSteps.clicSelectorDeEmpleados();
    }

    @Cuando("selecciona un empleado de forma aleatoria")
    public void seleccionaUnEmpleadoDeFormaAleatoria() {
        ordenSeleccionadaSteps.seleccionarEmpleadoAleatorio();
    }
    @Cuando("el usuario hace clic en Save")
    public void elUsuarioHaceClicEnSave() {
        ordenSeleccionadaSteps.clicBotonGuardar();
    }
    @Entonces("el nombre del empleado en la orden de compra se actualiza")
    public void elNombreDelEmpleadoEnLaOrdenDeCompraSeActualiza() {
        ordenesSteps.validarCambioDeNombre();
    }

}
