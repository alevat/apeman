package com.alevat.apeman.services.implementation.project;

import com.alevat.apeman.api.dto.ProjectDto;
import com.alevat.apeman.entities.Project;
import com.alevat.apeman.repositories.ProjectRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ProjectServiceImplementationTest {

    @Mock
    private ProjectMapper mapper;

    @Mock
    private ProjectRepository repository;

    @InjectMocks
    private ProjectServiceImplementation service = new ProjectServiceImplementation();

    private List<Project> projects = new ArrayList<>();

    private List<ProjectDto> projectDtos = new ArrayList<>();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(repository.findAll()).thenReturn(projects);
        when(mapper.from(projects)).thenReturn(projectDtos);
    }

    @Test
    public void getAll_ShouldDelegateToRepository() {
        assertEquals(projectDtos, service.getAll());
    }

}