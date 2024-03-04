package lab6.features.search;

import lab6.steps.serenity.*;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/features/search/loginData.csv")
//@RunWith(SerenityRunner.class)
public class ftpParamerizedStory {

    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\darli\\OneDrive\\Desktop\\chromedriver.exe");
    }

    String server, name, pass;

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

    @Steps
    public EndUserLoginSteps logsteps;

    @Steps
    public EndUserErrorSteps errorsteps;

    @Issue("login invalid")
    @Test
    @Ignore
    public void login_invalid() {
        logsteps.goto_home_ftppage();
        logsteps.enter_data_and_click_login(server, name, pass);
        errorsteps.verify_message("Unable");
    }
} 