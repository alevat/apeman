import * as angular from 'angular';
import uiRouter from 'angular-ui-router';
import {AppComponent} from './app.component';
import {CommonModule} from './common/common.module';
import {ComponentsModule} from './components/components.module';

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
                redirectTo: 'home',
                url: '/app',
                component: 'apeman'
            });
        $urlRouterProvider.otherwise('/home');
    })
    .component('apeman', AppComponent)
    .run(($log) => { $log.debug('Initialized AppModule'); })
    .name;

export default app;