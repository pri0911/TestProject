package com.Infini.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mrmodulepage {

    public static By MostRecent = By.xpath("// span[text()='Most Recent']");
    public static By MostRecentTitle = By.xpath("//h1[text()='Most Recent']");

    public static void clickCourse(WebDriver driver) {
        driver.findElement(MostRecent).click();
        String actualtitle = driver.findElement(MostRecentTitle).getText();
        System.out.println(actualtitle);
        String expectedtitle = driver.findElement(MostRecentTitle).getText();
        System.out.println(expectedtitle);
        if (actualtitle.equals(expectedtitle)) {
            System.out.println("validation of Title is successful");
        } else {
            System.out.println("validation of Title is failed");
        }
    }

}
