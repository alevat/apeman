import {IComponentOptions} from 'angular';
import {ProjectsController} from './projects.controller';
const template = require('./projects.html');

export const ProjectsComponent: IComponentOptions  = {
    bindings: {
        projects: '<'
    },
    controller: ProjectsController,
    template
};