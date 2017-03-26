import * as angular from 'angular';
import {MenuComponent} from './menu.component';

export const MenuModule = angular
    .module('common.menu', [])
    .component('menu', MenuComponent)
    .name;