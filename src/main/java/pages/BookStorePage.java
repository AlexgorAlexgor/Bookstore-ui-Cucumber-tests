package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class BookStorePage {

    //    final static String BASE_URL_BOOKS = "https://demoqa.com/books";
    public static SelenideElement loginButtonByBookStorePage = $(byId("login"));

   /* public SelenideElement usernameInputField = $(byId("user-name"));
    public SelenideElement passwordInputField = $(byId("password"));
    public SelenideElement loginButtonByLoginForm = $(byId("login-button"));

    public SelenideElement alarmMessageUserName= $(byText("Sorry, this user has been locked out."));

    public SelenideElement alarmMessageInvalidData= $(byText("Username and password do not match any user in this service"));
*/

}
