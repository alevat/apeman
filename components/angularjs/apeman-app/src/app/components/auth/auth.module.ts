import * as angular from 'angular';
import uiRouter from 'angular-ui-router';
import {AuthService} from './auth.service'

export const AuthModule = angular
    .module('components.auth', [
        uiRouter
    ])
    .run(($transitions, $state, $log, AuthService) => {
        'ngInject'
        $log.info('Initializing $transitions in AuthModule');
        $transitions.onStart({
            to: 'auth.*'
        }, () => {
            if (AuthService.isAuthenticated()) {
                $log.info('Authenticated user attempted to access auth resource: redirecting to app');
                return $state.target('app');
            } else {
                $log.info('Authenticated user accessing restricted resource: ok');
            }
        });
    })
    .service('AuthService', AuthService)
    .name;