package com.infini.tests;


import com.Infini.PageObjects.LoginPage;
import com.infini.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class InfyniAppLoginTestCase extends TestBase {

    @Test
    @Parameters({"email","password","userName"})
    public void infyniLoginTest(String email, String password,String username) throws InterruptedException {
        System.out.println("Test3");
        // Navigate to Login Page
        navigateToLoginPage();
        LoginPage loginPage = new LoginPage();
        LoginPage.enterEmailId(TestBase.driver, email);
        LoginPage.enterpassword(TestBase.driver, password);
        LoginPage.clickLogin(TestBase.driver);
        Thread.sleep(10000);
        LoginPage.verifyLoginUser(TestBase.driver, username);
    }

    private static void navigateToLoginPage() {
        By loginButton = By.xpath("//span[text()=\"Log In\"]/parent::a");
        driver.findElement(loginButton).click();
    }
}




