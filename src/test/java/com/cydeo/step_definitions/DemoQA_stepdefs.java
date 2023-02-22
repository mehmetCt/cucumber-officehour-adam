package com.cydeo.step_definitions;

import com.cydeo.pages.ButtonsPage;
import com.cydeo.pages.ElementsPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class DemoQA_stepdefs {
    ElementsPage elementsPage = new ElementsPage();
    ButtonsPage buttonsPage = new ButtonsPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Navigate to {string} page")
    public void navigate_to_page(String option) {
        Driver.getDriver().get(ConfigurationReader.getProperty("demo.qa.url"));
        elementsPage.clickOption(option);

    }

    @When("Double click on button")
    public void double_click_on_button() {
        actions.doubleClick(buttonsPage.doubleClickMe).perform();
    }

    @Then("Verify text double click message {string} should be visible")
    public void verify_text_double_click_message_should_be_visible(String expectedMessage) {
        Assert.assertEquals(expectedMessage, buttonsPage.doubleClickMessageYouHave.getText());
    }

    @Then("Right click on button")
    public void right_click_on_button() {
        actions.contextClick(buttonsPage.rightClickMe).perform();
    }

    @Then("Verify text right click message {string} should be visible")
    public void verify_text_right_click_message_should_be_visible(String expectedMessage) {
        Assert.assertEquals(expectedMessage, buttonsPage.rightClickMessageYouHave.getText());
    }

    @Then("Click Me button")
    public void click_me_button() {
        buttonsPage.clickMe.click();
    }

    @Then("Verify text click me message {string} should be visible")
    public void verify_text_click_me_message_should_be_visible(String expectedMessage) {
        Assert.assertEquals(expectedMessage, buttonsPage.dynamicClickMessageYouHave.getText());
    }
}
