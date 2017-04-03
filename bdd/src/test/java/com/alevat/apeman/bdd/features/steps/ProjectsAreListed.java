package com.alevat.apeman.bdd.features.steps;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProjectsAreListed implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor theActor) {
        Target projects = Target.the("project list").located(By.cssSelector("ul#project-list > li"));
        return projects.resolveAllFor(theActor).size() > 0;
    }

}
