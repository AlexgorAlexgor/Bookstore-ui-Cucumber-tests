package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static java.lang.Double.parseDouble;
import static java.util.Collections.sort;
import static junit.framework.TestCase.assertEquals;

public class XInventorySteps extends BaseSteps {

   /* @Then("^I am on the page Inventory$")
    public void iAmOnThePageInventory() {
        XInventoryPage.inventoryList.shouldBe(visible, Duration.ofSeconds(10));
        //Epic sadface: Sorry, this user has been locked out.
    }

    @Then("^error message about invalid user with text \"([^\"]*)\" is displayed$")
    public void errorMessageAboutInvalidUserWithTextIsDisplayed(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I push the Logout button$")
    public void iPushTheLogoutButton() {
        XInventoryPage.burgerMenu.shouldBe(visible, Duration.ofSeconds(5));
        XInventoryPage.logoutField.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

*//*    @And("^(\\d+) items are displayed$")
    public void itemsAreDisplayed(int expectedQuantity) {
        XInventoryPage.inventoryItems.filter(Condition.visible).shouldHave(size(expectedQuantity));
    }*//*

    @And("^I see the (\\d+) items on the page Inventory$")
    public void iSeeTheItemsOnThePageInventory(int expectedQuantity) {
        XInventoryPage.inventoryItems.filter(visible).shouldHave(size(expectedQuantity));

    }

    @And("^I push the sort menu by name a-z$")
    public void iPushTheSortMenuByNameAZ() {
        XInventoryPage.sortDropDown.shouldBe(visible);
        XInventoryPage.textAz.click();
    }

    @Then("^I see the sorted  items on the page$")
    public void iSeeTheSortedItemsOnThePage() {
        // XInventoryPage.sortedItems.texts()

    }
 //   assertEquals("Items have NOT sorted alphabetically", actualNames, expectedNames);

    @When("^I choose sort option by name A-Z$")
    public void iChooseSortOptionByNameAZ() {
        XInventoryPage.sortDropdown.shouldBe(visible).click();
        XInventoryPage.nameAtoZ.shouldBe(visible).click();
    }

    @Then("^all items sorted by name alphabetically$")
    public void allItemsSortedByNameAlphabetically() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName : XInventoryPage.inventoryNames) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames);
        XInventoryPage.inventoryNames.shouldHave(exactTexts(expectedNames));
        // assertEquals("Items have NOT sorted alphabetically", actualNames, expectedNames);
    }

    @When("^I choose sort option by name Z-A$")
    public void iChooseSortOptionByNameZA() {
        XInventoryPage.sortDropdown.shouldBe(visible).click();
        XInventoryPage.nameZtoA.shouldBe(visible).click();
    }

    @Then("^all items sorted by name unalphabetically$")
    public void allItemsSortedByNameUnalphabetically() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName : XInventoryPage.inventoryNames) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames, Collections.reverseOrder());
        assertEquals("Items have NOT sorted unalphabetically", actualNames, expectedNames);
    }

    @When("^I choose sort option by price from low to high$")
    public void iChooseSortOptionByPriceFromLowToHigh() {
        XInventoryPage.sortDropdown.shouldBe(visible).click();
        XInventoryPage.priceLowToHigh.shouldBe(visible).click();
    }

    @Then("^all items sorted by price from low to high$")
    public void allItemsSortedByPriceFromLowToHigh() {
        List<Double> actualPrices = new ArrayList<>();
        for (SelenideElement itemPrice : XInventoryPage.inventoryPrices) {
            actualPrices.add(parseDouble(itemPrice.getText().substring(1)));
        }
        List<Double> expectedPrices = new ArrayList<>(actualPrices);
        sort(expectedPrices, Collections.reverseOrder());
        assertEquals("Items have NOT by price from low to high", actualPrices, expectedPrices);

    }

    @When("^I push the (\\d+)-th \"([^\"]*)\" button$")
    public void iPushTheThButton(int arg0, String arg1) throws Throwable {
        List<Double> actualItems = new ArrayList<>();
        XInventoryPage.inventoryItems.shouldBe().first().click();

        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I push the button shopping_cart_link$")
    public void iPushTheButtonShopping_cart_link() {
        XInventoryPage.buttonShoppingCartLink.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    @Then("^I open Your_Cart_Link page$")
    public void iOpenYour_Cart_LinkPage() {
    }*/
}

  //  assertEquals("Items have NOT sorted alphabetically", actualNames, expectedNames);