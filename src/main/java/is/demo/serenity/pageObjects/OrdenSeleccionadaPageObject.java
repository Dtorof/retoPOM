package is.demo.serenity.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class OrdenSeleccionadaPageObject extends PageObject {

    @FindBy(how = How.XPATH, using  = "//div[@id='s2id_Serenity_Demo_Northwind_OrderDialog15_EmployeeID']")
    public WebElementFacade selectorDeEmpleados;

    @FindBy(how = How.XPATH, using  = "//ul[@id='select2-results-9']/li")
    public List<WebElementFacade> listaEmpleados;

    @FindBy(how = How.XPATH, using  = "//div[@data-action='save-and-close']")
    public WebElementFacade botonGuardar;
}
