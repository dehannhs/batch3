package com.hp;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="",
		plugin= {"pretty","html:target/cucumber","json:target/json/result.json"},
		tags= {}
		
		)


public class Runner {

}
