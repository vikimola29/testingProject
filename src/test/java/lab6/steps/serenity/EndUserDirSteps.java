package lab6.steps.serenity;

import lab6.pages.dirHomePage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserDirSteps {

    //folosim metodele din diPage si verificam daca se intampla ce pasi trebuie urmati
    //putem folosi si aserturi
    //folosim STEPS

    dirHomePage dirP;

    @Step
    public void verify_user(String name)
    {
       assert(dirP.get_curr_dir().endsWith(name));
    }

    @Step
    public void click_logout()
    {
        dirP.click_logout();
    }

    @Step
    public void verify_dir(String dir) {
        assertThat(dirP.get_dir_tree(), hasItem(containsString(dir)));
    }

}