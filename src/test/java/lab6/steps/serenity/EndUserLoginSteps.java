package lab6.steps.serenity;
//
//import lab6.pages.DictionaryPage;
import lab6.pages.loginPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserLoginSteps {

    loginPage loginP;

    @Step
    public void goto_home_ftppage() {
        loginP.open();
    }

    @Step
    public void enter_data_and_click_login(String server, String name, String pass) {
        loginP.enterServer(server);
        loginP.enter_name(name);
        loginP.enter_pass(pass);
        loginP.click_login();
    }

}