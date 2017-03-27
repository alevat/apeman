import * as angular from 'angular';
import uiRouter from 'angular-ui-router';
import { ProjectComponent } from './project.component';

export const ProjectModule = angular
    .module('project', [
        uiRouter
    ])
    .component('project', ProjectComponent)
    .config(($stateProvider: angular.ui.IStateProvider,
             $urlRouterProvider: angular.ui.IUrlRouterProvider) => {
        $stateProvider
            .state('project', {
                url: '/project',
                component: 'project'
            });
        $urlRouterProvider.otherwise('/');
    })
    .run(($log) => {$log.debug("Initialized ProjectModule")})
    .name;

export default ProjectModule;