package com.infini.tests;

import com.infini.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase extends TestBase {
    @Test
    public void LaunchHelpCenter(){
        TestBase.driver.get("https://studio.cucumber.io/users/sign_in") ;
    }
}
