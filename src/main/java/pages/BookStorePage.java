package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BookStorePage {

    //    final static String BASE_URL_BOOKS = "https://demoqa.com/books";
    public static SelenideElement loginButtonByBookStorePage = $(byId("login"));
    public static SelenideElement booksWrapperBookPage = $(byClassName("books-wrapper"));

    public static SelenideElement headerTitleOnBookStorePage = $(byText("Title"));
    public static SelenideElement headerAuthorOnBookStorePage = $(byText("Author"));
    public static SelenideElement headerPublisherOnBookStorePage = $(byText("Publisher"));

    public static ElementsCollection colummnTitleOnBookStorePage = $$(byId("see-book"));
    public static ElementsCollection colummnAuthorOnBookStorePage = $$(byXpath("//div[@class='rt-td'][3]"));
    public static ElementsCollection colummnPublisherOnBookStorePage = $$(byXpath("//div[@class='rt-td'][4]"));


}
