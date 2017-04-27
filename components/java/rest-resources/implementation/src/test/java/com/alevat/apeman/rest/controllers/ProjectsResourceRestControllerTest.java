package com.alevat.apeman.rest.controllers;

import com.alevat.apeman.services.api.ProjectService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertNotNull;

public class ProjectsResourceRestControllerTest {

    @Mock
    private ProjectService service;

    @InjectMocks
    private ProjectsResourceRestController controller = new ProjectsResourceRestController();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getProjects_ShouldReturnAList() {
        assertNotNull(controller.getProjects());
    }

}