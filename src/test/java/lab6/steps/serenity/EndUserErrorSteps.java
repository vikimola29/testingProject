package lab6.steps.serenity;

import lab6.pages.errorPage;
import lab6.pages.logoutPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserErrorSteps {

    errorPage errorP;

    @Step
    public void verify_message(String message) {
        assertThat(errorP.get_error_message(), hasItem(containsString(message)));
    }

}