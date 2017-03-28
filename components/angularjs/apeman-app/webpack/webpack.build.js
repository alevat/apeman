const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');

const config = {
    context: path.resolve(__dirname, '..'),
    devtool: 'source-map',
    entry: './src/app/app.module.ts',
    output: {
        filename: 'bundle.js',
        path: path.resolve(__dirname, '../build/webapp')
    },
    resolve: {
        extensions: ['.ts', '.js', '.json']
    },
    plugins: [
        new HtmlWebpackPlugin({
            template: './src/index.html',
            inject: 'body',
            hash: true
        })
    ],
    module: {
        rules: [
            {
                enforce: 'pre',
                test: /\.ts$/,
                exclude: /node_modules/,
                loader: 'tslint-loader',
                options: {
                    emitErrors: true,
                    failOnHint: true
                }
            },
            {
                test: /\.html$/,
                exclude: /node_modules/,
                loader: 'html-loader'
            },
            {
                test: /\.ts$/,
                exclude: /node_modules/,
                use: 'ts-loader'
            }
        ]
    }
};

module.exports = config;