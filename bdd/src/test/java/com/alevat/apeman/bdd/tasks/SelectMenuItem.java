package com.alevat.apeman.bdd.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectMenuItem implements Task {

    private final String menuItem;

    private SelectMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Target menuItemTarget = Target.the("menu item").located(By.linkText(menuItem));
        Click.on(menuItemTarget);
    }

    public static Performable named(String menuItem) {
        return instrumented(SelectMenuItem.class, menuItem);
    }

}
