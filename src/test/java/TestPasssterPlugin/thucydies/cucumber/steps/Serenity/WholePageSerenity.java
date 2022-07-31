package TestPasssterPlugin.thucydies.cucumber.steps.Serenity;

import TestPasssterPlugin.thucydies.cucumber.pages.WholePage;
import net.thucydides.core.steps.ScenarioSteps;

public class WholePageSerenity {
    WholePage wholePage;

    public void open_WholePage(){
        wholePage.open();
    }

    public void click_Submit_Button(){
        wholePage.click_Submit_Button();
    }

    public void setPasswordFiled(){
        wholePage.setPasswordFiled();
    }

    public String getContentLine(){
        return wholePage.getContentLine();
    }
}
