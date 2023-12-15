package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegisterForm {

        //    https://demoqa.com/register
        public static SelenideElement registerButtonOnRegisterForm = $(byId("register"));
        public static SelenideElement firstNameFieldOnRegisterForm = $(byId("firstname"));
        public static SelenideElement lastNameFieldOnRegisterForm = $(byId("lastname"));
        public static SelenideElement userNameFieldOnRegisterForm = $(byId("userName"));
        public static SelenideElement passwordFieldOnRegisterForm = $(byId("password"));
        public static SelenideElement verifyCaptchaMessageOnRegisterform= $(byText("Please verify reCaptcha to register!"));


   /* public SelenideElement usernameInputField = $(byId("user-name"));
    public SelenideElement passwordInputField = $(byId("password"));
    public SelenideElement loginButtonByLoginForm = $(byId("login-button"));

    public SelenideElement alarmMessageUserName= $(byText("Sorry, this user has been locked out."));

    public SelenideElement alarmMessageInvalidData= $(byText("Username and password do not match any user in this service"));
*/

}
