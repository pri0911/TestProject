package com.Infini.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    private static By emailInputBox = By.name("email");

    private static By passwordInputBox = By.name("password");

    private static By loginButton = By.xpath("//span[text()='Log In']//parent::button");

    public static void enterEmailId(WebDriver driver, String email) {
        try {
            WebElement loginTextEdit = driver.findElement(emailInputBox);
            loginTextEdit.sendKeys(email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void enterpassword(WebDriver driver, String password) {
        try {
            driver.findElement(passwordInputBox).sendKeys(password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void clickLogin(WebDriver driver) {
        try{
            driver.findElement(loginButton).click();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void verifyLoginUser(WebDriver driver, String userName) {
        WebElement userId = driver.findElement(By.xpath("//p[text()=\"" + userName + "\"]"));
        Assert.assertTrue(userId.isDisplayed());
    }
}