package com.automatizador.demo.runner;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/login.feature"},
        glue = {"com.automatizador.demo.definitions"})
public class Login {
}
