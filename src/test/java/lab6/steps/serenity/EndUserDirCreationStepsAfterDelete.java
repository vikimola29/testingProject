package lab6.steps.serenity;

import lab6.pages.DirCreateSuccesfulPage;
import lab6.pages.loginPage;
import lab6.pages.deleteHomePage;
import lab6.pages.dirCreatePage;
import lab6.pages.dirHomePage;
import net.thucydides.core.annotations.Step;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserDirCreationStepsAfterDelete {

    loginPage p;

    dirHomePage dirHomePage;

    dirCreatePage dirCreatePage;

    DirCreateSuccesfulPage dirCreateSuccesfulPage;

    deleteHomePage deleteHomePage;

    @Step
    public void goto_home_ftppage() {
        p.open();
    }
    @Step
    public void enter_data_and_click_login(String server, String name, String pass) {
        p.click_login();
        p.enterServer(server);
        p.enter_name(name);
        p.enter_pass(pass);
        p.click_login();
    }

    @Step
    public void createDirOnHomePage(){
        dirHomePage.click_newDir();

    }
    @Step
    public void setDirCreatePage(String dirName){
        dirCreatePage.inputNameDirectory(dirName);
        dirCreatePage.confirmNewDirectory();

    }
    @Step
    public void dirCreatedSuccesfully(){
        dirCreateSuccesfulPage.getDirTextFromForm();
        assertThat(dirCreateSuccesfulPage.getDirTextFromForm(),containsString("successfully"));
    }

    @Step
    public void goBack(){
        dirCreateSuccesfulPage.clickBackButton();
    }



    @Step
    public void checkDelete(){
        dirHomePage.check_directory_to_delete("abc");
    }


    @Step
    public void clickDelete(){
        dirHomePage.clickDeleteButton();
    }


 @Step
    public void accept(){
        deleteHomePage.clickYesButton();
        deleteHomePage.clickBackButton();
 }






}
