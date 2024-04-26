package io.cucumber.shouty;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/io.cucumber.shouty",
        plugin = {
            "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm",
            "progress",
            "summary"
        },
        strict = true
)
public class CucumberTest extends AbstractTestNGCucumberTests {

}
