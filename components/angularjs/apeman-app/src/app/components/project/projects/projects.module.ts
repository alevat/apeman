import * as angular from 'angular';
import {ILogService} from 'angular';
import uiRouter from 'angular-ui-router';

import {ProjectsComponent} from './projects.component';

export const ProjectsModule = angular
    .module('components.project.projects', [
        uiRouter
    ])
    .component('projects', ProjectsComponent)
    .config(($stateProvider: angular.ui.IStateProvider) => {
        $stateProvider
            .state('projects', {
                parent: 'app',
                url: '/projects',
                component: 'projects',
                resolve: {
                    projects(ProjectService, $log: ILogService) {
                        $log.debug('Binding ProjectsComponent.projects to ProjectService.getProjects()');
                        return ProjectService.getProjects();
                    }
                }
            });
    })
    .run(($log) => { $log.debug('Initialized ProjectsModule'); })
    .name;

export default ProjectsModule;