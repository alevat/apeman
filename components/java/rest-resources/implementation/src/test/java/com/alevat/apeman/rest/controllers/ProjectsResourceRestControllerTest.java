package com.alevat.apeman.rest.controllers;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProjectsResourceRestControllerTest {

    private ProjectsResourceRestController controller = new ProjectsResourceRestController();

    @Test
    public void getProjects_ShouldReturnAList() {
        assertNotNull(controller.getProjects());
    }

}