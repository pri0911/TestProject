package com.infini.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class TestBase {
    public static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setupBrowser() throws InterruptedException {

        //System.out.println("Setup Before Test");

        System.setProperty("webdriver.chrome.driver", "/Users/PriyaJadhawar/IntelliJ/TestProject/InfiniTestProject/TestProject/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://devnj.infyni.com/");

        driver.manage().window().maximize();
        Thread.sleep(5000);

    }

    @AfterMethod(alwaysRun = true)
    public void teardownBrowser() {
        // System.out.println("Setup After Test");
        driver.quit();
    }
}