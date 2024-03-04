package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class DirCreateSuccesfulPage extends PageObject {


    @FindBy(name = "NewDirForm")
    private WebElementFacade newDirForm;

    @FindBy(xpath = "//img[@alt='Back (accesskey b)']")
    private WebElementFacade backButton;


    public String  getDirTextFromForm() {
      return   newDirForm.getText();
    };

    public void clickBackButton(){
        backButton.click();
    }



}



