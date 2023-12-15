package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RegisterForm;

import static com.codeborne.selenide.Condition.visible;

public class RegisterFormSteps {

    //    Then I am on the page with Register-form
    @Then("^I am on the page with Register-form$")
    public void iAmOnThePageWithRegisterForm() {
        RegisterForm.registerButtonOnRegisterForm.shouldBe(visible);
    }

    //     When I input valid value "firstNameValue" to FirstName field
    @When("^I input valid value \"([^\"]*)\" to FirstName field$")
    public void iInputValidValueToFirstNameField(String firstNameValue) throws Throwable {
        RegisterForm.firstNameFieldOnRegisterForm.setValue(firstNameValue);
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    //      And  I input valid value "lastNameValue" to LastName field
    @And("^I input valid value \"([^\"]*)\" to LastName field$")
    public void iInputValidValueToLastNameField(String lastNameValue) throws Throwable {
        RegisterForm.lastNameFieldOnRegisterForm.setValue(lastNameValue);
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    //    And I input valid value :  "muster@gmail.com" to username field from this form
    @And("^I input valid value :  \"([^\"]*)\" to username field from this form$")
    public void iInputValidValueToUsernameFieldFromThisForm(String userNameValue) throws Throwable {
        RegisterForm.userNameFieldOnRegisterForm.setValue(userNameValue);
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    //    And I input valid value : "Muster0!" to password field from this form
    @And("^I input valid value : \"([^\"]*)\" to password field from this form$")
    public void iInputValidValueToPasswordFieldFromThisForm(String passwordValue) throws Throwable {
        RegisterForm.passwordFieldOnRegisterForm.setValue(passwordValue);
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    //    Then I push the Register button
    @Then("^I push the Register button$")
    public void iPushTheRegisterButton() {RegisterForm.registerButtonOnRegisterForm.click();}

    //    Then I see mesage "Please verify reCaptcha to register!" on the page with Register-form
    @Then("^I see mesage \"([^\"]*)\" on the page with Register-form$")
    public void iSeeMesageOnThePageWithRegisterForm(String arg0) throws Throwable {
        RegisterForm.verifyCaptchaMessageOnRegisterform.shouldBe(visible);
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
