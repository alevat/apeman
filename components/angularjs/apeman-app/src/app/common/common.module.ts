import * as angular from 'angular';
import { HomeModule } from './home/home.module';

export const CommonModule = angular
    .module('app.common', [
        HomeModule,
    ])
    .name;