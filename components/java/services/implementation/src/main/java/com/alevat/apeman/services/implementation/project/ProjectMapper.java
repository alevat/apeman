package com.alevat.apeman.services.implementation.project;

import com.alevat.apeman.api.dto.ProjectDto;
import com.alevat.apeman.entities.Project;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectDto from(Project project);

    List<ProjectDto> from(List<Project> projects);

}
