import {IHttpService, ILogService} from "angular";
export class ProjectService {
    static $inject: string[] = ['$http', '$log'];

    constructor(private $http: IHttpService, private $log: ILogService) { }

    getProjects() {
        this.$log.debug('Retrieving projects');
        return this.$http.get('/api/v1/projects').then(response => response.data);
    }
}