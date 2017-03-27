import {ILogService} from "angular";

export class AuthService {

    static $inject: string[] = ['$log'];

    constructor(private $log : ILogService) {
        'ngInject'
    }

    isAuthenticated() {
        this.$log.debug('Invoked AuthService.isAuthenticated()');
        return true;
    }

}