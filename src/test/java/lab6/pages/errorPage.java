package lab6.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class errorPage extends PageObject {

    public List<String> get_error_message() {
        WebElementFacade definitionList = find(By.tagName("div"));
        return definitionList.findElements(By.tagName("p")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }

}