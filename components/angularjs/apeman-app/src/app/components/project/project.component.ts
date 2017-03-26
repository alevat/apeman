import {IComponentOptions} from "angular";
import { ProjectController } from './project.controller';
import { ProjectService } from './project.service';
import { Project } from '../../common/model/project';

export const ProjectComponent: IComponentOptions  = {
    controller: ProjectController,
    templateUrl : 'projects.html'
};