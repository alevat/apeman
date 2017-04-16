package com.alevat.apeman.repositories;

import com.alevat.apeman.PersistenceTestApplication;
import com.alevat.apeman.entities.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PersistenceTestApplication.class)
public class ProjectRepositoryTest {

    @Inject
    private ProjectRepository repository;

    @Test
    public void save_ShouldSetUuid() {
        Project project = new Project();
        Project savedProject = repository.save(project);
        assertThat(savedProject.getUuid(), is(notNullValue()));
    }

    @Test
    public void findAll_ShouldFindSavedProject() {
        Project project = new Project();
        Project savedProject = repository.save(project);
        List<Project> projects = repository.findAll();
        assertThat(projects, hasItem(savedProject));
    }

}