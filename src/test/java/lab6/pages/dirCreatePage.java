package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class dirCreatePage extends PageObject {


    @FindBy(xpath = "//input[@name=\"newNames[1]\"]")
    private WebElementFacade  directoryNameInput;


    @FindBy (xpath = "//img[@alt=\"Submit (accesskey v)\"]")
    private WebElementFacade confirmDirButton;


    public void inputNameDirectory(String a ){
        directoryNameInput.typeAndEnter(a);
    }


    public void confirmNewDirectory(){
        confirmDirButton.click();
    }





}
