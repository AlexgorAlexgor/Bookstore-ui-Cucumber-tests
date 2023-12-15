package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProfilePage {

   // final static String BASE_URL_USERS = "https://demoqa.com/profile";

    public static SelenideElement alarmMessageUserName= $(byText("User Name :"));
    public static SelenideElement logoutButton= $(byText("Log out"));

    public static SelenideElement headerTitleOnProfilePage = $(byText("Title"));
    public static SelenideElement headerAuthorOnProfilePage = $(byText("Author"));
    public static SelenideElement headerPublisherOnProfilePage = $(byText("Publisher"));

    public static ElementsCollection colummnTitleOnProfilePage = $$(byId("see-book"));
    public static ElementsCollection colummnAuthorOnProfilePage = $$(byXpath("//div[@class='rt-td'][3]"));
    public static ElementsCollection colummnPublisherOnProfilePage = $$(byXpath("//div[@class='rt-td'][4]"));


}
