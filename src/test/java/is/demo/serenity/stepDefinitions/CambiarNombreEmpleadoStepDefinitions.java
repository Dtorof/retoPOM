package is.demo.serenity.stepDefinitions;


import is.demo.serenity.steps.DashBoardSteps;
import is.demo.serenity.steps.OrdenSeleccionadaSteps;
import is.demo.serenity.steps.OrdenesSteps;
import  is.demo.serenity.steps.PaginaInicioSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
public class CambiarNombreEmpleadoStepDefinitions {
    @Steps PaginaInicioSteps paginaInicioSteps;
    @Steps DashBoardSteps dashBoardSteps;

    @Steps OrdenesSteps ordenesSteps;

    @Steps OrdenSeleccionadaSteps ordenSeleccionadaSteps;


    @Dado("que el usuario ha abierto el navegador en la página de inicio de sesion")
    public void queElUsuarioHaAbiertoElNavegadorEnLaPáginaDeInicioDeSesión() throws IOException {
        paginaInicioSteps.abrirUrl();

    }

    @Dado("El usuario ingresa las credenciales validas")
    public void elUsuarioIngresaLasCredencialesValidas() {
        paginaInicioSteps.ingresarCredenciales();
    }

    @Dado("el usuario está en el dashboard")
    public void elUsuarioEstáEnElDashboard() {
        dashBoardSteps.validadInicioSesion();
    }
    @Dado("que  el usuario hace clic en Open Orders")
    public void quElUsuarioHaceClicEnOpenOrders() {
        dashBoardSteps.clicAbrirOrdenes();
    }
    @Cuando("el usuario selecciona una orden de compra existente")
    public void elUsuarioSeleccionaUnaOrdenDeCompraExistente()  {
        ordenesSteps.cliclAbrirOrden();
    }
    @Cuando("el usuario hace clic en el selector de empleado")
    public void elUsuarioHaceClicEnElSelectorDeEmpleado() {
        ordenSeleccionadaSteps.clicSelectorDeEmpleados();
    }

    @Cuando("el usuario selecciona un empleado de la lista")
    public void elUsuarioSeleccionaUnEmpleadoDeLaLista() {

        ordenSeleccionadaSteps.seleccionarEmpleado();
    }

    @Cuando("el usuario confirma que el nombre seleccionado es el deseado")
    public void elUsuarioConfirmaQueElNombreSeleccionadoEsElDeseado()  {
        ordenSeleccionadaSteps.verificarEmpleadoSeleccionado();
    }



    @Cuando("el usuario hace clic en Save")
    public void elUsuarioHaceClicEnSave() {
        ordenSeleccionadaSteps.clicBotonGuardar();
    }
    @Entonces("el nombre del empleado en la orden de compra se actualiza correctamente")
    public void elNombreDelEmpleadoEnLaOrdenDeCompraSeActualizaCorrectamente() {

        ordenesSteps.validarCambioDeNombre();
    }

}
