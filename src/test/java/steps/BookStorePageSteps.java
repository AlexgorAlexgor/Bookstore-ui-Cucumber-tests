package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.BookStorePage;

import static com.codeborne.selenide.Selenide.open;
import static hooks.Hooks.BASE_URL_BOOKS;
import static hooks.Hooks.BASE_URL_LOGIN;

public class BookStorePageSteps {
    //    Given I open Bookstore page
    @Given("^I open Bookstore page$")
    public void iOpenBookstorePage() {open(BASE_URL_BOOKS);}

//
    @Given("^I open \"([^\"]*)\" page$")
    public void iOpenPage(String arg0) throws Throwable {open(BASE_URL_BOOKS);
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    //    When I push the Login button on Bookstore page
    @When("^I push the Login button on Bookstore page$")
    public void iPushTheLoginButtonOnBookstorePage() {BookStorePage.loginButtonByBookStorePage.click();}
}
//  @Given("^I open Login page$")
//    public void iOpenLoginPage() {open(BASE_URL_LOGIN);}
//
//    @When("^I input \"([^\"]*)\" to username field$")
//    public void iInputToUsernameField(String usernameValue)  {
//        LoginForm.usernameInputField.setValue(usernameValue);
//    }
//
//    @And("^input \"([^\"]*)\" to password field$")
//    public void inputToPasswordField(String passwordValue)  {LoginForm.passwordInputField.setValue(passwordValue);}
//
//    @When("^I push the Login button$")
//    public void iPushTheLoginButton() {
//        LoginForm.loginButtonByLoginForm.click();
//    }