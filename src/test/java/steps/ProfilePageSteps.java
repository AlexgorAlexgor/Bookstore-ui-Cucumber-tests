package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ProfilePage;

import java.time.Duration;

public class ProfilePageSteps {
    //  When I push the Logout button
    @When("^I push the Logout button$")
    public void iPushTheLogoutButton() {ProfilePage.logoutButton.click();}

    //    Then I am on the page Profile
    @Then("^I am on the page Profile$")
    public void iAmOnThePageProfile()throws Throwable {ProfilePage.alarmMessageUserName
            .shouldBe(Condition.visible, Duration.ofSeconds(10));
        throw new PendingException();
    }
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