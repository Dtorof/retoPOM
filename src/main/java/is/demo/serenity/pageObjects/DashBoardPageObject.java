package is.demo.serenity.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
public class DashBoardPageObject extends PageObject  {

    @FindBy(how = How.ID, using = "s-DashboardPage")
    public WebElementFacade dashboard;

    @FindBy(how = How.XPATH, using  = "//a[@href='/Northwind/Order?shippingState=0']")
    public WebElementFacade abrirOrdenes;



}
