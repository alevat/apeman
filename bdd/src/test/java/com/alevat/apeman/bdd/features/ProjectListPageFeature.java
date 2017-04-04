package com.alevat.apeman.bdd.features;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/manage_project_portfolio/project_list_page.feature")
public class ProjectListPageFeature {
}
