package com.alevat.apeman.rest.controllers;

import com.alevat.apeman.api.dto.ProjectDto;
import com.alevat.apeman.rest.api.ProjectsResource;
import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectsResourceRestController implements ProjectsResource {

    @Override
    public List<ProjectDto> getProjects() {
        ProjectDto project = new ProjectDto();
        project.setName("Hello World");
        return Lists.newArrayList(project);
    }

}
