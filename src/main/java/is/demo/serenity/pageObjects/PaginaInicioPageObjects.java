package is.demo.serenity.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PaginaInicioPageObjects extends PageObject {
    @FindBy(how = How.ID, using = "LoginPanel0_Username")
    public WebElementFacade txtUsuario;

    @FindBy(how = How.ID, using = "LoginPanel0_Password")
    public WebElementFacade txtClave;

    @FindBy(how = How.ID, using = "LoginPanel0_LoginButton")
    public WebElementFacade btnIngresar;

}
