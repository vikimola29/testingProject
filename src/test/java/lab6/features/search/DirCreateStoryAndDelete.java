package lab6.features.search;

import lab6.steps.serenity.EndUserDirCreationStepsAfterDelete;
import lab6.steps.serenity.EndUserLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DirCreateStoryAndDelete {

    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\darli\\OneDrive\\Desktop\\chromedriver.exe");
    }

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

 //scriem steps din mai multe clase


    @Steps
    public EndUserLoginSteps endUserLoginSteps;


    @Steps
    public EndUserDirCreationStepsAfterDelete endUserDirCreationSteps;

    @Test
    public void succesful_dir_creation(){
        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10).toMillis(), TimeUnit.MILLISECONDS);
        endUserLoginSteps.goto_home_ftppage();
        endUserLoginSteps.enter_data_and_click_login("localhost","vvta1","vvta1");
        endUserDirCreationSteps.createDirOnHomePage();
        endUserDirCreationSteps.setDirCreatePage("abc");
        endUserDirCreationSteps.dirCreatedSuccesfully();
        endUserDirCreationSteps.goBack();
    }

    @Test
    public void succesful_dir_deletion() {
        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10).toMillis(), TimeUnit.MILLISECONDS);
        endUserLoginSteps.goto_home_ftppage();
        endUserLoginSteps.enter_data_and_click_login("localhost","vvta1","vvta1");
        endUserDirCreationSteps.checkDelete();
        endUserDirCreationSteps.clickDelete();
        endUserDirCreationSteps.accept();
    }
}
