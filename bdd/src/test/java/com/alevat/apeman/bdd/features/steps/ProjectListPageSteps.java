package com.alevat.apeman.bdd.features.steps;

import com.alevat.apeman.bdd.pages.ApemanHomePage;
import com.alevat.apeman.bdd.tasks.SelectMenuItem;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ProjectListPageSteps {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Projects exist in the system$")
    public void that_Projects_exist_in_the_system() throws Throwable {
        // no-op for now; project list is stubbed on server side
    }

    @When("^a(.*) selects (.*) from the Menu$")
    public void selects_a_menu_item(String personaName, String menuItem) throws Throwable {
        theActorCalled(personaName).attemptsTo(Open.browserOn(new ApemanHomePage()));
        theActorCalled(personaName).attemptsTo(SelectMenuItem.named(menuItem));
    }

    @Then("^the User sees a list of Projects$")
    public void the_User_sees_a_list_of_Projects() throws Throwable {
    }

}
