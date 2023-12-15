package steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ProfilePage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class ProfilePageSteps extends BaseSteps {

    //  When I push the Logout button
    @When("^I push the Logout button$")
    public void iPushTheLogoutButton() {
        ProfilePage.logoutButton.click();
    }

    //    Then I am on the page Profile
    @Then("^I am on the page Profile$")
    public void iAmOnThePageProfile() throws Throwable {
        ProfilePage.alarmMessageUserName
                .shouldBe(Condition.visible, Duration.ofSeconds(10));
        throw new PendingException();
    }

    //    When I click on sorting field for sort colummn unter header-content .
    @When("^I click on sorting field for sort title-colummn unter header-content \\.$")
    public void iClickOnSortingFieldForSortTitleColummnUnterHeaderContent() {
        ProfilePage.headerTitleOnProfilePage.click();
    }


    //    Then All items sorted by name alphabetically A-Z
    @Then("^All items sorted by title alphabetically A-Z$")
    public void allItemsSortedByTitleAlphabeticallyAZ() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName : ProfilePage.colummnTitleOnProfilePage) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames);
        ProfilePage.colummnTitleOnProfilePage.shouldHave(CollectionCondition.exactTexts(expectedNames));
    }

    //    Then All items sorted by name alphabetically Z-A
    @Then("^All items sorted by title alphabetically Z-A$")
    public void allItemsSortedByTitleAlphabeticallyZA() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName : ProfilePage.colummnTitleOnProfilePage) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames, Collections.reverseOrder());
        ProfilePage.colummnTitleOnProfilePage.shouldHave(CollectionCondition.exactTexts(expectedNames));
    }

    //    When I click on sorting field for sort colummn author unter header-content .
    @When("^I click on sorting field for sort colummn author unter header-content \\.$")
    public void iClickOnSortingFieldForSortColummnAuthorUnterHeaderContent() {
        ProfilePage.headerAuthorOnProfilePage.click();
    }

    // Then All items sorted by author alphabetically A-Z
    @Then("^All items sorted by author alphabetically A-Z$")
    public void allItemsSortedByAuthorAlphabeticallyAZ() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName : ProfilePage.colummnTitleOnProfilePage) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames);
        ProfilePage.colummnTitleOnProfilePage.shouldHave(
                CollectionCondition.exactTexts(expectedNames));
    }

    //    Then All items sorted by author alphabetically Z-A
    @Then("^All items sorted by author alphabetically Z-A$")
    public void allItemsSortedByAuthorAlphabeticallyZA() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName : ProfilePage.colummnAuthorOnProfilePage) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames, Collections.reverseOrder());
        ProfilePage.colummnAuthorOnProfilePage.shouldHave(
                CollectionCondition.exactTexts(expectedNames));
    }

    //    When I click on sorting field for sort colummn publisher unter header-content .
    @When("^I click on sorting field for sort colummn publisher unter header-content \\.$")
    public void iClickOnSortingFieldForSortColummnPublisherUnterHeaderContent() {
        ProfilePage.headerPublisherOnProfilePage.click();

    }

    //Then All items sorted by publisher alphabetically A-Z
    @Then("^All items sorted by publisher alphabetically A-Z$")
    public void allItemsSortedByPublisherAlphabeticallyAZ() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName : ProfilePage.colummnPublisherOnProfilePage) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames);
        ProfilePage.colummnPublisherOnProfilePage.shouldHave(
                CollectionCondition.exactTexts(expectedNames));
    }

    //    Then All items sorted by publisher alphabetically Z-A
    @Then("^All items sorted by publisher alphabetically Z-A$")
    public void allItemsSortedByPublisherAlphabeticallyZA() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName : ProfilePage.colummnPublisherOnProfilePage) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames, Collections.reverseOrder());
        ProfilePage.colummnPublisherOnProfilePage.shouldHave(
                CollectionCondition.exactTexts(expectedNames));
    }


}