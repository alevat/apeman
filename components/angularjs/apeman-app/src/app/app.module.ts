import * as angular from 'angular';
import uiRouter from 'angular-ui-router';
import {AppComponent} from './app.component';
import {ComponentsModule} from './components/components.module';
import {CommonModule} from './common/common.module';

const app = angular
    .module('app', [
        ComponentsModule,
        CommonModule,
        uiRouter
    ])
    .config(($stateProvider: angular.ui.IStateProvider,
             $urlRouterProvider: angular.ui.IUrlRouterProvider) => {
        $stateProvider
            .state('app', {
                redirectTo: 'projects',
                url: '/app',
                component: 'apeman'
            });
        $urlRouterProvider.otherwise('/');
    })
    .component('apeman', AppComponent)
    .run(($log) => {$log.debug('Initialized AppModule');})
    .name;

export default app;