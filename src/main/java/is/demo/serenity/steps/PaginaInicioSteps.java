package is.demo.serenity.steps;

import  is.demo.serenity.pageObjects.PaginaInicioPageObjects;
import  is.demo.serenity.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class PaginaInicioSteps {
    @Page
    private PaginaInicioPageObjects paginaInicio;

    @Step("que el usuario ingrese a la  url")
    public void abrirUrl() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Url");
        String url=data.get(0).get("Url");
        paginaInicio.openUrl(url);
    }

    @Step("Limpiar campo de usuario")
    public void limpiarCampoUsuario(){
        paginaInicio.txtUsuario.clear();
    }
    @Step("Ingresar usuario  ")
    public void ingresarUsuario()  throws IOException{
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Credenciales");
        String usuario=data.get(0).get("Usuario");
        paginaInicio.txtUsuario.sendKeys(usuario);
    }

    @Step("limpiar campo de la clave")
    public void limpiarCampoClave(){
        paginaInicio.txtClave.clear();
    }

    @Step("Ingresar clave  ")
    public void ingresarClave()  throws IOException{
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Credenciales");
        String clave=data.get(0).get("Clave");
        paginaInicio.txtClave.sendKeys(clave);
    }

    @Step("Hacer clic en ingresar  ")
    public void ingresarCredenciales(){
        paginaInicio.btnIngresar.click();
    }


}
