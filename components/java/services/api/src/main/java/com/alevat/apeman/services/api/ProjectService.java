package com.alevat.apeman.services.api;

import com.alevat.apeman.api.dto.ProjectDto;

import java.util.List;

public interface ProjectService {

    /**
     * @return all Projects visible for the current user
     */
    List<ProjectDto> getAll();

}
