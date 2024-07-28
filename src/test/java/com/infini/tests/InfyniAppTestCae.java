package com.infini.tests;

import com.Infini.PageObjects.InfiniHelpCenterPage;
import com.infini.base.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InfyniAppTestCae extends TestBase {
    @Test
    public void LaunchHelpCenter() throws InterruptedException {

        System.out.println("Test1");

        WebElement helpc = driver.findElement(InfiniHelpCenterPage.helpc);

        helpc.click();

        Thread.sleep(3000);

        WebElement Faqtitle = driver.findElement(InfiniHelpCenterPage.Faqtitle);

        Assert.assertTrue(Faqtitle.isDisplayed());

        Reporter.log("Test Report For Log Help Center");

        //driver.navigate().back();
    }

    @Test
    public void PrivacyPolicy() throws InterruptedException {

        System.out.println("Test2");

        WebElement PPolicy = driver.findElement(InfiniHelpCenterPage.PPolicy);

        PPolicy.click();

        Thread.sleep(5000);

        Assert.assertTrue(driver.findElement(InfiniHelpCenterPage.PrivacyPolicyPage).isDisplayed());
        Reporter.log("Test Report For Privacy Policy");
    }

}
