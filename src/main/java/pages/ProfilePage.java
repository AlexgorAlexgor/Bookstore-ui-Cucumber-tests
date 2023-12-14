package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

   // final static String BASE_URL_USERS = "https://demoqa.com/profile";

    public static SelenideElement alarmMessageUserName= $(byText("User Name :"));

   /* public SelenideElement usernameInputField = $(byId("user-name"));
    public SelenideElement passwordInputField = $(byId("password"));
    public SelenideElement loginButton = $(byId("login-button"));

    public SelenideElement alarmMessageUserName= $(byText("Sorry, this user has been locked out."));

    public SelenideElement alarmMessageInvalidData= $(byText("Username and password do not match any user in this service"));
*/

}
