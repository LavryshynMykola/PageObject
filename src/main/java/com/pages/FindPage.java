package com.pages;

import org.openqa.selenium.WebDriver;

import static com.actions.Actions.clickButtonAddLocator;
import static com.actions.Actions.downloadingFileLocator;
import static com.actions.Actions.headingLocator;

public class FindPage {
    private WebDriver driver;
    public FindPage (WebDriver driver) { this.driver = driver;}
    public void clickButtonAdd(){driver.findElement(clickButtonAddLocator).click();}
    public void downloadingFile(){driver.findElement(downloadingFileLocator).sendKeys("/Summary.docx");}
    public  String getHeadingText(){ return driver.findElement(headingLocator).getText(); }
}
