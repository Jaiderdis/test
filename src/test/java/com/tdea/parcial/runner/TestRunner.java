package com.tdea.parcial.runner;
import static com.tdea.parcial.Utils.isValidHour;
import static org.junit.jupiter.api.Assertions.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static com.tdea.parcial.Utils.getTimeOfDay;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com.tdea.parcial")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.tdea.parcial.gluecode")
public class TestRunner {
    int hora;
    String tiempo;
    Boolean validez;

    @Given("si se ingresa  {int}")
    public void si_se_ingresa(Integer int1) {
        hora=int1;
        tiempo=getTimeOfDay(int1);

    }
    @When("se verifica la validez")
    public void se_verifica_la_validez() {
        validez=isValidHour(hora);
        if(hora>24){
            assertFalse(validez);
        }else{
            assertTrue(validez);
        }


    }
    @Then("retorne {string}")
    public void retorne(String string) {
        assertEquals(string,tiempo);

    }




}
