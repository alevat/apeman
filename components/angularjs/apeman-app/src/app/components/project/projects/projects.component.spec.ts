import * as angular from 'angular';
import 'angular-mocks';
import {ProjectsController} from './projects.controller';
import {IComponentController} from 'angular';

describe('Service ProjectService', () => {

    var controller: ProjectsController;
    beforeEach(() => {
        angular.mock.module("components.project.projects");
        // angular.mock.inject(($httpBackend) => {
        //     $httpBackend.when('GET', '/api/v1/projects')
        //         .respond({name: 'project1'}, {name: 'project2'});
        // });
    });
    beforeEach(inject(function(_$componentController_) {
        // console.log("_$componentController_: " + _$componentController_);
        // controller = _$componentController_('projects');
        // console.log("Controller: " + controller);
    }));
    it('should populate projects from the project.service', () => {
        // expect(controller.projects.length).toBe(2);
    });
});