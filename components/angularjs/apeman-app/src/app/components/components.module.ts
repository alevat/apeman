import * as angular from 'angular';
import {ProjectModule} from './project/project.module';

export const ComponentsModule = angular
    .module('app.components', [
        ProjectModule
    ])
    .run(($log) => { $log.debug('Initialized ComponentsModule'); })
    .name;