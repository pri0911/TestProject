package com.infini.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class TestBase   {
   public static WebDriver driver;
    @BeforeTest
    public void setupBrowser() throws InterruptedException {
        System.out.println("Test Project");
        System.setProperty("webdriver.chrome.driver","/Users/PriyaJadhawar/IntelliJ/TestProject/InfiniTestProject/TestProject/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @AfterClass
    public void teardownBrowser(){
        driver.quit();
    }
}
