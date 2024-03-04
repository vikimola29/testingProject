package lab6.features.search;

import lab6.steps.serenity.*;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
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
import org.openqa.selenium.chrome.ChromeDriver;

//@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom("src/test/resources/features/search/loginData.csv")
@RunWith(SerenityRunner.class)
public class ftpStory {


    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\UNI_POST\\SEM3\\MOD1\\AutoTesting\\Labs\\Labs\\chromedriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

    }
    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

    @Steps
    public EndUserLoginSteps logsteps;

    @Steps
    public EndUserDirSteps dirsteps;

    @Steps
    public EndUserLogoutSteps logoutsteps;

//    @Steps
////    public EndUserSteps anna;

    @Issue("login valid")
    @Test
//    @Ignore
    public void login_valid() {
        logsteps.goto_home_ftppage();
        logsteps.enter_data_and_click_login("linux.scs.ubbcluj.ro","vvta","VVTA2020");
        dirsteps.verify_user("vvta");
        dirsteps.click_logout();
        logoutsteps.verify_message("logged out");
    }

//    @Issue("#WIKI-1")
//    @Pending @Test
//    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
//        anna.is_the_home_page();
//        anna.looks_for("apple");
//        anna.should_see_definition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");
//
//    }
//
//    @Pending @Test
//    public void searching_by_keyword_banana_should_display_the_corresponding_article() {
//        anna.is_the_home_page();
//        anna.looks_for("pear");
//        anna.should_see_definition("An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.");
//    }
//
//    @Pending @Test
//    public void searching_by_ambiguious_keyword_should_display_the_disambiguation_page() {
//    }


} 