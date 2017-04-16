package com.alevat.apeman.repositories;

import com.alevat.apeman.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjectRepository extends JpaRepository<Project, UUID> {
}
