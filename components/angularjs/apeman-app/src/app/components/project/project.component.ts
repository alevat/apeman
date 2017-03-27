import {IComponentOptions} from "angular";
import { ProjectController } from './project.controller';
import { ProjectService } from './project.service';
import { Project } from '../../common/model/project';
const template = require('./projects.html');

export const ProjectComponent: IComponentOptions  = {
    controller: ProjectController,
    template: template
};