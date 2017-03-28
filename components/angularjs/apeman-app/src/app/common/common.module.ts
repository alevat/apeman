import * as angular from 'angular';
import * as loader from 'angular-loading-bar';
import { HomeModule } from './home/home.module';

export const CommonModule = angular
    .module('app.common', [
        HomeModule,
        loader
    ])
    .run(
        ($transitions, $log, cfpLoadingBar) => {
            $transitions.onStart({}, cfpLoadingBar.start);
            $transitions.onSuccess({}, cfpLoadingBar.complete);
            $log.debug('Initialized CommonModule');
        }
    )
    .name;