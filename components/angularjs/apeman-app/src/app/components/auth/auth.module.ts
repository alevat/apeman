import * as angular from 'angular';
import uiRouter from 'angular-ui-router';
import {AuthService} from './auth.service'

export const AuthModule = angular
    .module('components.auth', [
        uiRouter
    ])
    .run(($transitions, $state, AuthService) => {
        'ngInject'
        $transitions.onStart({
            to: 'auth.*'
        }, () => {
            if (AuthService.isAuthenticated()) {
                return $state.target('app');
            }
        });
    })
    .service('AuthService', AuthService)
    .name;