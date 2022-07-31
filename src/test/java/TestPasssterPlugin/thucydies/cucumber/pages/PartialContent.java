package TestPasssterPlugin.thucydies.cucumber.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://nguyentest16.local/password-protect-partial-content/")
public class PartialContent extends PageObject {

    @FindBy(xpath = "//input[@id='passster_password']")
    WebElementFacade passwordFiled;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElementFacade submitBtn;

    @FindBy(xpath = "//em[contains(text(),'Wow you just unlock this cool cat :3')]")
    WebElementFacade contentLine;

    public String getContentLine(){
        return contentLine.getTextValue();
    }

    public void click_Submit_Button(){
        submitBtn.click();
    }

    public void setPasswordFiled(){
        passwordFiled.sendKeys("12345");
    }

}
