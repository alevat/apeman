package com.alevat.apeman.rest.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProjectsResourceRestControllerTest {

    private ProjectsResourceRestController controller = new ProjectsResourceRestController();

    @Test
    void getProjects_ShouldReturnAList() {
        assertNotNull(controller.getProjects());
    }

}