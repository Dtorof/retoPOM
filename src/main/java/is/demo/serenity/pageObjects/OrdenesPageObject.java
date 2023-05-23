package is.demo.serenity.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class OrdenesPageObject extends PageObject  {

    @FindBy(how = How.XPATH, using  = "(//div[@class='slick-cell l0 r0 align-right']//a)[1]")
    public WebElementFacade abrirOrden;

    @FindBy(how = How.XPATH, using  = "(//div[@class='slick-cell l4 r4'])[1]")
    public WebElementFacade nombreEmpleadoActual;

}
