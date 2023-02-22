package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {
/*
if you use @FindBy anottaion in order to add one element we have to use constructor
 */
    public ElementsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public  void clickOption(String option){
        String locator="//li[.='"+option+"']";
        BrowserUtils.sleep(1);
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }
}
