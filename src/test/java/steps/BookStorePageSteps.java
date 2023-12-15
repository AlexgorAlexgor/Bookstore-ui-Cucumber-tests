package steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BookStorePage;
import pages.ProfilePage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static hooks.Hooks.BASE_URL_BOOKS;
import static hooks.Hooks.BASE_URL_LOGIN;
import static java.util.Collections.sort;

public class BookStorePageSteps extends BaseSteps{
    //    Given I open Bookstore page
    @Given("^I open Bookstore page$")
    public void iOpenBookstorePage() {open(BASE_URL_BOOKS);}


    //    When I push the Login button on Bookstore page
    @When("^I push the Login button on Bookstore page$")
    public void iPushTheLoginButtonOnBookstorePage() {BookStorePage.loginButtonByBookStorePage.click();}

    //  Then I am on the BookStore page
    @Then("^I am on the BookStore page$")
    public void iAmOnTheBookStorePage() {
        BookStorePage.booksWrapperBookPage
                .shouldBe(Condition.visible, Duration.ofSeconds(10));
        throw new PendingException();
    }


    //    When I click on sorting field for sort title-colummn unter header-content on the BookStore page
    @When("^I click on sorting field for sort title-colummn unter header-content on the BookStore page$")
    public void iClickOnSortingFieldForSortTitleColummnUnterHeaderContentOnTheBookStorePage() {
        BookStorePage.booksWrapperBookPage.click();
    }

    //    Then All items sorted by title alphabetically A-Z on the BookStore page
    @Then("^All items sorted by title alphabetically A-Z on the BookStore page$")
    public void allItemsSortedByTitleAlphabeticallyAZOnTheBookStorePage() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName : BookStorePage.colummnTitleOnBookStorePage) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames);
        BookStorePage.colummnTitleOnBookStorePage.shouldHave(CollectionCondition.exactTexts(expectedNames));
    }

    //    Then All items sorted by title alphabetically Z-A on the BookStore page
    @Then("^All items sorted by title alphabetically Z-A on the BookStore page$")
    public void allItemsSortedByTitleAlphabeticallyZAOnTheBookStorePage() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName : BookStorePage.colummnTitleOnBookStorePage) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames, Collections.reverseOrder());
        BookStorePage.colummnTitleOnBookStorePage.shouldHave(CollectionCondition.exactTexts(expectedNames));
    }

    //    When I click on sorting field for sort colummn author unter header-content on the BookStore page
    @When("^I click on sorting field for sort colummn author unter header-content on the BookStore page$")
    public void iClickOnSortingFieldForSortColummnAuthorUnterHeaderContentOnTheBookStorePage() {
        BookStorePage.headerAuthorOnBookStorePage.click();
    }

    //    Then All items sorted by author alphabetically A-Z on the BookStore page
    @Then("^All items sorted by author alphabetically A-Z on the BookStore page$")
    public void allItemsSortedByAuthorAlphabeticallyAZOnTheBookStorePage() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName : BookStorePage.colummnAuthorOnBookStorePage) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames);
        BookStorePage.colummnAuthorOnBookStorePage.shouldHave(CollectionCondition.exactTexts(expectedNames));
    }

    //    Then All items sorted by author alphabetically Z-A on the BookStore page
    @Then("^All items sorted by author alphabetically Z-A on the BookStore page$")
    public void allItemsSortedByAuthorAlphabeticallyZAOnTheBookStorePage() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName : BookStorePage.colummnAuthorOnBookStorePage) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames, Collections.reverseOrder());
        BookStorePage.colummnAuthorOnBookStorePage.shouldHave(CollectionCondition.exactTexts(expectedNames));
    }

    //    When I click on sorting field for sort colummn publisher unter header-content on the BookStore page
    @When("^I click on sorting field for sort colummn publisher unter header-content on the BookStore page$")
    public void iClickOnSortingFieldForSortColummnPublisherUnterHeaderContentOnTheBookStorePage() {
        BookStorePage.headerPublisherOnBookStorePage.click();
    }

    //    Then All items sorted by publisher alphabetically A-Z on the BookStore page
    @Then("^All items sorted by publisher alphabetically A-Z on the BookStore page$")
    public void allItemsSortedByPublisherAlphabeticallyAZOnTheBookStorePage() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName : BookStorePage.colummnPublisherOnBookStorePage) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames);
        BookStorePage.colummnPublisherOnBookStorePage.shouldHave(CollectionCondition.exactTexts(expectedNames));
    }

    //    Then All items sorted by publisher alphabetically Z-A on the BookStore page
    @Then("^All items sorted by publisher alphabetically Z-A on the BookStore page$")
    public void allItemsSortedByPublisherAlphabeticallyZAOnTheBookStorePage() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName : BookStorePage.colummnPublisherOnBookStorePage) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames, Collections.reverseOrder());
        BookStorePage.colummnPublisherOnBookStorePage.shouldHave(CollectionCondition.exactTexts(expectedNames));
    }
}
