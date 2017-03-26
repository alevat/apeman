import angular from 'angular';
import {MenuComponent} from './menu.component';

export const MenuModule = angular
    .module('common.menu', [
        MenuComponent,
    ])
    .name;