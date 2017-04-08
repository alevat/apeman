module.exports = function(config) {
    config.set({
        basepath: '',
        browsers: ['Chrome'],
        files: [
            'build/webapp/bundle.js',
            {pattern: '**/*.spec.ts', watched: false},
        ],
        frameworks: ['jasmine'],
        mime: {
            'text/x-typescript': ['ts','tsx']
        },
        preprocessors: {
            '**/*.spec.ts': ['webpack', 'sourcemap'],
        },
        plugins: [
            'karma-jasmine',
            'karma-chrome-launcher',
            'karma-phantomjs-launcher',
            'karma-sourcemap-loader',
            'karma-webpack'
        ],
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