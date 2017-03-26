export class ProjectService {
    static $inject: string[] = ['$http'];

    constructor(private $http: angular.IHttpService) { }

    getProjects() {
        return this.$http.get('/api/v1/projects').then(response => response.data);
    }
}