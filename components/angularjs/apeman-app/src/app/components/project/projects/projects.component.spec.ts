import * as angular from 'angular';
import 'angular-mocks';
import {ProjectsController} from './projects.controller';

describe('Service ProjectService', () => {
    var controller: ProjectsController;
    beforeEach(() => {
        angular.mock.module("components.project.projects");
    });
    beforeEach(inject(function(_$componentController_) {
        var bindings = {projects: [{name: 'project'}]};
        controller = _$componentController_('projects', null, bindings);
    }));
    it('should expose bound projects', () => {
        expect(controller.projects[0].name).toBe('project');
    });
});