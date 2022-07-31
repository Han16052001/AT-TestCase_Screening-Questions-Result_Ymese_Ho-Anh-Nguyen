package TestPasssterPlugin.thucydies.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://nguyentest16.local/password-protect-the-whole-page/")
public class WholePage extends PageObject {

    @FindBy(xpath = "//input[@id='passster_password']")
    WebElementFacade passwordFiled;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElementFacade submitBtn;

    @FindBy(xpath = "//p[contains(text(),'And because you entered the right pass, so you can read all of this. Congratulation !!!')]")
    WebElementFacade contentLine;

    public String getContentLine(){
        return contentLine.getTextValue();
    }

    public void click_Submit_Button(){
        submitBtn.click();
    }

    public void setPasswordFiled(){
        passwordFiled.sendKeys("123456");
    }
}
