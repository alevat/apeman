module.exports = function(config) {
    config.set({
        basepath: '',
        browsers: ['PhantomJS'],
        files: [
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