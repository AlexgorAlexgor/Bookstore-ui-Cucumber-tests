package steps;

import cucumber.api.java.en.Then;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class XYourCartSteps extends BaseSteps{
    @Then("^I open Your_Cart_Link page$")
    public void iOpenYour_Cart_LinkPage() {
        XYourCartPage.YourCartPageOpen.shouldBe(visible, Duration.ofSeconds(10));

    }
}
