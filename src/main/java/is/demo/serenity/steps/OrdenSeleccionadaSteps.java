package is.demo.serenity.steps;

import is.demo.serenity.pageObjects.OrdenSeleccionadaPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.Random;

public class OrdenSeleccionadaSteps {

    @Page
    private OrdenSeleccionadaPageObject ordenSeleccionadaPageObject;
    private String nombreEmpleadoAleatorio;

    @Step("Hacer clic en el selector de empleados")
    public void clicSelectorDeEmpleados(){
        ordenSeleccionadaPageObject.selectorDeEmpleados.click();
    }

    @Step("Seleccionar un empleado aleatorio de la lista")
    public void seleccionarEmpleado() {
        Random rand = new Random();
        int empleadoAleatorioIndex = rand.nextInt(ordenSeleccionadaPageObject.listaEmpleados.size());
        nombreEmpleadoAleatorio = ordenSeleccionadaPageObject.listaEmpleados.get(empleadoAleatorioIndex).getText();
        ordenSeleccionadaPageObject.listaEmpleados.get(empleadoAleatorioIndex).click();

    }

    @Step("Verificar que el empleado seleccionado concuerda")
    public void verificarEmpleadoSeleccionado() {
        String nombreEmpleadoSeleccionado = ordenSeleccionadaPageObject.empleadoSeleccionado.getText();
        assert nombreEmpleadoSeleccionado.equals(nombreEmpleadoAleatorio) : "El empleado seleccionado no concuerda con el empleado seleccionado.";
    }

    @Step("Hacer clic en el boton de guardar")
    public void clicBotonGuardar(){
        ordenSeleccionadaPageObject.botonGuardar.click();
    }

}
