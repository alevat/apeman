package com.alevat.apeman.services.implementation.project;

import com.alevat.apeman.api.dto.ProjectDto;
import com.alevat.apeman.repositories.ProjectRepository;
import com.alevat.apeman.services.api.ProjectService;

import javax.inject.Inject;
import java.util.List;

class ProjectServiceImplementation implements ProjectService {

    @Inject
    private ProjectRepository repository;

    @Inject
    private ProjectMapper mapper;

    @Override
    public List<ProjectDto> getAll() {
        return mapper.from(repository.findAll());
    }
}
