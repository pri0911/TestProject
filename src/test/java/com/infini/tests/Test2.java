package com.infini.tests;

import com.infini.base.TestBase;
import org.testng.annotations.Test;

public class Test2 extends TestBase {

    @Test
    public void test1() {
        TestBase.driver.get("https://studio.cucumber.io/") ;
    }
}
