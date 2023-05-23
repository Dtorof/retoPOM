package is.demo.serenity.steps;


import is.demo.serenity.pageObjects.OrdenSeleccionadaPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.Random;

public class OrdenSeleccionadaSteps {

    @Page
    private OrdenSeleccionadaPageObject ordenSeleccionadaPageObject;

    @Step("Hacer clic en el selector de empleados")
    public void clicSelectorDeEmpleados(){
        ordenSeleccionadaPageObject.selectorDeEmpleados.click();
    }

    @Step("Seleccionar un empleado aleatorio de la lista")
    public void seleccionarEmpleadoAleatorio() {
        Random rand = new Random();
        int empleadoAleatorioIndex = rand.nextInt(ordenSeleccionadaPageObject.listaEmpleados.size());
        ordenSeleccionadaPageObject.listaEmpleados.get(empleadoAleatorioIndex).click();


    }

    @Step("Hacer clic en el boton de guardar")
    public void clicBotonGuardar(){
        ordenSeleccionadaPageObject.botonGuardar.click();
    }

}
