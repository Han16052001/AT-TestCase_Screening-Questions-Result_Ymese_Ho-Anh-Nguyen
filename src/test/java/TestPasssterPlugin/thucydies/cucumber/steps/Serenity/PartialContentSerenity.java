package TestPasssterPlugin.thucydies.cucumber.steps.Serenity;

import TestPasssterPlugin.thucydies.cucumber.pages.PartialContent;

public class PartialContentSerenity {

    PartialContent partialContent;

    public void open_PartialPage(){
        partialContent.open();
    }

    public void click_Submit_Button(){
        partialContent.click_Submit_Button();
    }

    public void setPasswordFiled(){
        partialContent.setPasswordFiled();
    }

    public String getContentLine(){
        return partialContent.getContentLine();
    }

}
