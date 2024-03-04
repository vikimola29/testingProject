package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class deleteHomePage  extends PageObject {



    @FindBy(xpath = "//img[@alt=\"Submit (accesskey v)\"]")
    private WebElementFacade checkYesButton;


    @FindBy (xpath ="//img[@alt=\"Back (accesskey b)\"]")
    private WebElementFacade backButton;


    public void clickYesButton(){
        checkYesButton.click();
    }

    public void clickBackButton(){
        backButton.click();
    }

}
