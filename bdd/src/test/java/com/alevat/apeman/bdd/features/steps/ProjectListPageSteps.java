package com.alevat.apeman.bdd.features.steps;

import com.alevat.apeman.bdd.pages.ApemanHomePage;
import com.alevat.apeman.bdd.tasks.SelectMenuItem;
import com.alevat.apeman.bdd.util.SpringUtil;
import com.alevat.apeman.entities.Project;
import com.alevat.apeman.repositories.ProjectRepository;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ProjectListPageSteps {

    private ApemanHomePage theHomePage;
    private ProjectsAreListed projectsAreListed = new ProjectsAreListed();
    private ProjectRepository projectRepository;
    private List<Project> createdProjects = new ArrayList<>();

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
        ApplicationContext context = SpringUtil.getContext();
        projectRepository = context.getBean(ProjectRepository.class);
    }

    @After
    public void clean_up() {
        projectRepository.delete(createdProjects);
    }

    @Given("^that a (.*) is logged in$")
    public void is_logged_in(String personaName) throws Throwable {
        theActorCalled(personaName).attemptsTo(Open.browserOn(theHomePage));
    }

    @Given("^that Projects exist in the system$")
    public void that_Projects_exist_in_the_system() throws Throwable {
        Project project = new Project();
        project.setName("name_" + System.currentTimeMillis());
        project = projectRepository.save(project);
        createdProjects.add(project);
    }

    @When("^a (.*) selects (.*) from the Menu$")
    public void selects_a_menu_item(String personaName, String menuItem) throws Throwable {
        theActorCalled(personaName).attemptsTo(SelectMenuItem.named(menuItem));
    }

    @Then("^the (.*) sees a list of Projects$")
    public void sees_a_list_of_Projects(String personaName) throws Throwable {
        theActorCalled(personaName).should(seeThat(projectsAreListed));
    }

}
