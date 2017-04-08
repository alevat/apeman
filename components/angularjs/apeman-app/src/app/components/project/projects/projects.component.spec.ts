import * as angular from 'angular';
import 'angular-mocks';
import {ProjectsController} from './projects.controller';

describe('Service ProjectService', () => {
    var controller: ProjectsController;
    beforeEach(() => {
        angular.mock.module("components.project.projects");
    });
    beforeEach(inject(function(_$componentController_) {
        var bindings = {projects: [{name: 'project1'}, {name: 'project2'}]};
        controller = _$componentController_('projects', null, bindings);
    }));
    it('should populate projects from the project.service', () => {
        expect(controller.projects.length).toBe(2);
    });
});