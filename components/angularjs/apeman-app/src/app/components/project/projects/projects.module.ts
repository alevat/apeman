import * as angular from 'angular';
import uiRouter from 'angular-ui-router';
import {ILogService} from "@types/angular";
import {IStateProvider} from '@types/angular-ui-router';
import {ProjectsComponent} from './projects.component';

export const ProjectsModule = angular
    .module('components.project.projects', [
        uiRouter
    ])
    .component('projects', ProjectsComponent)
    .config(($stateProvider: IStateProvider) => {
        $stateProvider
            .state('projects', {
                parent: 'app',
                url: '/projects',
                component: 'projects',
                resolve: {
                    projects(ProjectService, $log: ILogService) {
                        $log.debug('Binding ProjectsComonent.projects to ProjectService.getProjects()')
                        return ProjectService.getProjects();
                    }
                }
            });
    })
    .run(($log) => {$log.debug("Initialized ProjectModule")})
    .name;

export default ProjectsModule;