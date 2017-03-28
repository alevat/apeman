import * as angular from 'angular';
import uiRouter from 'angular-ui-router';
import {ProjectService} from './project.service';
import {ProjectsModule} from './projects/projects.module';

export const ProjectModule = angular
    .module('components.project', [
        uiRouter,
        ProjectsModule
    ])
    .service('ProjectService', ProjectService)
    .run(($log) => { $log.debug('Initialized ProjectModule'); })
    .name;

export default ProjectModule;