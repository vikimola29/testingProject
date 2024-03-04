package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class dirHomePage extends PageObject {

    @FindBy(xpath="/html/body/div/div[2]/div/form/input[23]")
    private WebElementFacade currentDir;
    //

    @FindBy(xpath="//*[@id=\"StatusbarForm\"]/a[4]/img")
    private WebElementFacade logoutbutton;

    @FindBy(xpath ="//input[@value=\"New dir\"]")
    private WebElementFacade newDirButton;

    @FindBy (xpath = "//input[@value=\"Delete\"]")
    private  WebElementFacade deleteButton;



    @FindBy(id = "maintable")
    private WebElementFacade listOfDirectories;


    public void click_logout()
    {
        logoutbutton.click();
    }

    public String get_curr_dir()
    {
        return currentDir.getValue();
    }

    public void click_newDir(){
        newDirButton.click();
    }


    private void click_element_by_attribute_value(WebElementFacade el, String attribute, String value) {
        List<WebElement> list = el.findElements(By.tagName("input"));
        for (int i = 0; i<list.size(); i++){
            String dir = list.get(i).getAttribute(attribute);
            if (dir.equalsIgnoreCase(value)) {
                list.get(i).click();
                break;
            }
        }
    }

    public void check_directory_to_delete(String directory) {
        click_element_by_attribute_value(listOfDirectories, "value", directory);
    }



    public void clickDeleteButton(){
        deleteButton.click();
    }


    public List<String> get_dir_tree() {
        WebElementFacade definitionList = find(By.tagName("div"));
        return definitionList.findElements(By.tagName("a")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }



}