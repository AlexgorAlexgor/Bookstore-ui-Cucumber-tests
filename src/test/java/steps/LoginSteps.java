package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginForm;
import pages.ProfilePage;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;
import static hooks.Hooks.BASE_URL_LOGIN;

public class LoginSteps extends BaseSteps{



    @Given("^I open Login page$")
    public void iOpenLoginPage() {open(BASE_URL_LOGIN);}

    @When("^I input \"([^\"]*)\" to username field$")
    public void iInputToUsernameField(String usernameValue)  {
        LoginForm.usernameInputField.setValue(usernameValue);
    }

    @And("^input \"([^\"]*)\" to password field$")
    public void inputToPasswordField(String passwordValue)  {LoginForm.passwordInputField.setValue(passwordValue);}

    @When("^I push the Login button$")
    public void iPushTheLoginButton() {
        LoginForm.loginButton.click();
    }
//     public void iPushTheLoginButton() {XLoginPage.loginButton.click();}

    //    Then I am on the page Profile
@Then("^I am on the page Profile$")
public void iAmOnThePageProfile()throws Throwable {ProfilePage.alarmMessageUserName
        .shouldBe(Condition.visible, Duration.ofSeconds(10));
    throw new PendingException();
}
  /*  @Then("^I am on the text \"([^\"]*)\"$")
    public void iAmOnTheText(String arg0) throws Throwable {
        ProfilePage.alarmMessageUserName.shouldBe(Condition.visible, Duration.ofSeconds(10));
        throw new PendingException();
    }

 *//*   @Then("^Test unsussess , I am on the text \"([^\"]*)\"$")
    public void testUnsussessIAmOnTheText(String arg0) throws Throwable {
     //   XLoginPage.alarmMessageInvalidData.shouldBe(Condition.visible, Duration.ofSeconds(10));
        //Epic sadface: Username and password do not match any user in this service
        throw new PendingException();
    }*//*

    @Then("^Test unsuccessed , I am on the text \"([^\"]*)\"$")
    public void testUnsuccessedIAmOnTheText(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^error message about empty user_data with text \"([^\"]*)\" is displayed$")
    public void errorMessageAboutEmptyUser_dataWithTextIsDisplayed(String arg0) throws Throwable {
        XLoginPage.alarmMessageInvalidData.shouldBe(Condition.visible, Duration.ofSeconds(10));
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

   *//* @Then("^I am on the page Login$")
    public void iAmOnThePageLogin() {
        XLoginPage.loginButton.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }*/
}
