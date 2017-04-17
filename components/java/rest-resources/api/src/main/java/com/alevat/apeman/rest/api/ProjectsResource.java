package com.alevat.apeman.rest.api;

import com.alevat.apeman.api.dto.ProjectDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/api/v1/projects")
public interface ProjectsResource {

    @RequestMapping(method = RequestMethod.GET)
    List<ProjectDto> getProjects();

}