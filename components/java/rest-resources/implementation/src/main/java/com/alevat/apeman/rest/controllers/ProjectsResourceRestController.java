package com.alevat.apeman.rest.controllers;

import com.alevat.apeman.api.dto.Project;
import com.alevat.apeman.rest.api.ProjectsResource;
import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class ProjectsResourceRestController implements ProjectsResource {

    @Override
    public List<Project> getProjects() {
        new Random().nextInt();
        Project project = new Project();
        project.setName("Hello World");
        return Lists.newArrayList(project);
    }

}
