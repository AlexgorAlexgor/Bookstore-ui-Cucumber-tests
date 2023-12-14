package hooks;

import com.codeborne.selenide.logevents.SelenideLogger;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.qameta.allure.selenide.AllureSelenide;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    String BASE_URL = "https://www.saucedemo.com/";
    final static String BASE_URI_USERS = "https://demoqa.com/Account/v1";
    final static String BASE_URI_BOOKS = "https://demoqa.com/BookStore/v1";
    public final static String BASE_URL_USERS = "https://demoqa.com/profile";
    public final static String BASE_URL_BOOKS = "https://demoqa.com/books";
    public final static String BASE_URL_LOGIN = "https://demoqa.com/login";
    public final static String BASE_URL_REGISTER = "https://demoqa.com/register";

    @Before
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
      //  open(BASE_URL);
        open(BASE_URL_BOOKS);
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }
}
