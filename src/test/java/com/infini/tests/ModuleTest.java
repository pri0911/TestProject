package com.infini.tests;

import com.Infini.PageObjects.Mrmodulepage;
import com.infini.base.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ModuleTest extends TestBase {

    @Test
    private static void MostRecent() throws InterruptedException {

        System.out.println("Test1");

        WebElement MostRecent = driver.findElement(Mrmodulepage.MostRecent);

        MostRecent.click();

        Thread.sleep(3000);
        Mrmodulepage.clickCourse(driver);
        Assert.assertTrue(driver.findElement(Mrmodulepage.MostRecentTitle).isDisplayed());

        Reporter.log("Test Report for Most Recent Module:");

        Thread.sleep(3000);

    }
}

