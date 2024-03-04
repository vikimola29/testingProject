//package lab6.steps.serenity;
//
//import lab6.pages.DictionaryPage;
//import lab6.pages.dirHomePage;
//import net.thucydides.core.annotations.Step;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.containsString;
//import static org.hamcrest.Matchers.hasItem;
//
//public class EndUserSteps {
//
//    dirHomePage dirP;
//
//    @Step
//    public void verify_user(String name) {
//        assertThat(dirP.get_dir_tree(), hasItem(containsString(name)));
//    }
//
//    DictionaryPage dictionaryPage;
//
//    @Step
//    public void enters(String keyword) {
//        dictionaryPage.enter_keywords(keyword);
//    }
//
//    @Step
//    public void starts_search() {
//        dictionaryPage.lookup_terms();
//    }
//
//    @Step
//    public void should_see_definition(String definition) {
//        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
//    }
//
//    @Step
//    public void is_the_home_page() {
//        dictionaryPage.open();
//    }
//
//    @Step
//    public void looks_for(String term) {
//        enters(term);
//        starts_search();
//    }
//}