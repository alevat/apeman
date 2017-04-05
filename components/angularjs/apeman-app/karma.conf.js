module.exports = function(config) {
    config.set({
        basepath: '',
        browsers: ['PhantomJS'],
        files: [
            'node_modules/angular/angular.js',
            'node_modules/angular-mocks/angular-mocks.js',
            'node_modules/angular-ui-router/release/angular-ui-router.js',
            'build/webapp/bundle.js',
            {pattern: '**/*.spec.ts', watched: false},
        ],
        frameworks: ['jasmine'],
        preprocessors: {
            '**/*.spec.ts': ['webpack', 'sourcemap'],
        },
        webpack: {
            devtool: 'inline-source-map',
            resolve: {
                extensions: ['.js', '.ts', '.tsx']
            },
            module: {
                rules: [
                    {
                        test: /\.ts$/,
                        exclude: /node_modules/,
                        use: 'ts-loader'
                    }
                ]
            }
        },
        webpackMiddleware: {
            stats: 'errors-only'
        }
    });
};