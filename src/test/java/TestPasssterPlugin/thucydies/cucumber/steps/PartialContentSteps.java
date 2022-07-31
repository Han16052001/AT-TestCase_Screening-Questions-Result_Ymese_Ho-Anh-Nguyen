package TestPasssterPlugin.thucydies.cucumber.steps;

import TestPasssterPlugin.thucydies.cucumber.steps.Serenity.PartialContentSerenity;
import TestPasssterPlugin.thucydies.cucumber.steps.Serenity.WholePageSerenity;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class PartialContentSteps {
    @Steps
    PartialContentSerenity partialContentSerenity;

    @Given("^Open the partial page$")
    public void openThePage(){
        partialContentSerenity.open_PartialPage();
    }

    @When("^I enter the valid password to read the partial content of the page that being protected$")
    public void iEnterTheValidPasswordToReadTheContentThatBeingProtected(){
        partialContentSerenity.setPasswordFiled();
    }

    @And("^Press in the submit button$")
    public void pressInSubmitButton(){
        partialContentSerenity.click_Submit_Button();
    }

    @Then("^The page will display a line of the content like \"([^\"]*)\"$")
    public void theWebsiteWillDisplayALineOfTheContentLike(String text) throws Throwable {
        Assert.assertEquals(partialContentSerenity.getContentLine(),text);
    }
}
