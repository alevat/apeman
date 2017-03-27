import * as angular from 'angular';
import loader from 'angular-loading-bar';
import { HomeModule } from './home/home.module';

export const CommonModule = angular
    .module('app.common', [
        HomeModule,
        loader
    ])
    .run(
        ($transitions, cfpLoadingBar) => {
            $transitions.onstart({}, cfpLoadingBar.start);
            $transitions.onsuccess({}, cfpLoadingBar.complete);
        }
    )
    .name;