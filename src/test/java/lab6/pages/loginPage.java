package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://www.scs.ubbcluj.ro/vvta/net2ftp/index.php")
public class loginPage extends PageObject {

    @FindBy(name="ftpserver")
    private WebElementFacade comboserver;

    @FindBy(name="username")
    private WebElementFacade textname;

    @FindBy(name="password")
    private WebElementFacade textpass;

    @FindBy(id="LoginButton1")
    private WebElementFacade buttonlogin;

    public void select_server(String server) {
        comboserver.selectByValue(server);
    }

    public void enterServer(String server) {
        comboserver.type(server);
    }

    public void enter_name(String name) {
        textname.type(name);
    }

    public void enter_pass(String pass) {
        textpass.type(pass);
    }
    public void click_login() {
        buttonlogin.click();
    }

}