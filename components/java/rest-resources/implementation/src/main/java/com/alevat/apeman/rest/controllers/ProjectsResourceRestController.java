package com.alevat.apeman.rest.controllers;

import com.alevat.apeman.api.dto.ProjectDto;
import com.alevat.apeman.rest.api.ProjectsResource;
import com.alevat.apeman.services.api.ProjectService;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
public class ProjectsResourceRestController implements ProjectsResource {

    @Inject
    private ProjectService service;

    @Override
    public List<ProjectDto> getProjects() {
        return service.getAll();
    }

}
