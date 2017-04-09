'use strict';

module.exports = function(config) {
    config.set({
        browsers: ['PhantomJS'],
        files: [
            {pattern: 'src/**/*.ts'},
        ],
        frameworks: ['jasmine', 'karma-typescript'],
        karmaTypescriptConfig: {
            coverageOptions: {
                threshold: {
                    global: {
                        statements: 75,
                        branches: 80
                    }
                }
            },
            reports: {
                html: 'build/reports/coverage'
            },
            tsconfig: './tsconfig.json'
        },
        mime: {
            'text/x-typescript': ['ts','tsx']
        },
        preprocessors: {
            'src/**/*.ts': ['karma-typescript'],
        },
        reporters: [
            'progress',
            'karma-typescript'
        ]
    });
};