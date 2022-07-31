package TestPasssterPlugin.thucydies.cucumber.steps;

import TestPasssterPlugin.thucydies.cucumber.steps.Serenity.WholePageSerenity;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;


public class WholePageSteps {

    @Steps
    WholePageSerenity wholePageSerenity;

    @Given("^Open the page$")
    public void openThePage(){
        wholePageSerenity.open_WholePage();
    }

    @When("^I enter the valid password to read the content that being protected$")
    public void iEnterTheValidPasswordToReadTheContentThatBeingProtected(){
        wholePageSerenity.setPasswordFiled();
    }

    @And("^Press in submit button$")
    public void pressInSubmitButton(){
        wholePageSerenity.click_Submit_Button();
    }

    @Then("^The website will display a line of the content like \"([^\"]*)\"$")
    public void theWebsiteWillDisplayALineOfTheContentLike(String content) throws Throwable {
        Assert.assertEquals(wholePageSerenity.getContentLine(),content);
    }
}
