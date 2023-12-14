package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginForm {
    //    final static String BASE_URL_LOGIN = "https://demoqa.com/login";


    public static SelenideElement usernameInputField = $(byId("userName"));
    public static SelenideElement passwordInputField = $(byId("password"));
    public static SelenideElement loginButton = $(byId("login"));

/*
    public SelenideElement alarmMessageInvalidData= $(byText("Username and password do not match any user in this service"));
*/

}
