import * as angular from 'angular';
import uiRouter from 'angular-ui-router'
import {IStateProvider, IUrlRouterProvider} from '@types/angular-ui-router'
import {HomeComponent} from './home.component'
import {MenuModule} from "../menu/menu.module";

export const HomeModule = angular
    .module('common.home', [
        uiRouter,
        MenuModule
    ])
    .component('home', HomeComponent)
    .config(($stateProvider : IStateProvider, $urlRouterProvider: IUrlRouterProvider) => {
        $stateProvider
            .state('home', {
                url: '/home',
                component: 'home'
            });
        $urlRouterProvider.otherwise('/home');
    })
    .run(($log) => {$log.debug("Initialized HomeModule")})
    .name;
