const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');

const config = {
    context: path.resolve(__dirname, '..'),
    entry: './src/main/web-src/app/index.ts',
    output: {
        filename: 'bundle.js',
        path: path.resolve(__dirname, '../src/main/webapp')
    },
    resolve: {
        extensions: ['.ts', '.js', '.json']
    },
    plugins: [
        new HtmlWebpackPlugin({
            template: './src/main/web-src/index.html',
            inject: 'body',
            hash: true
        })
    ],
    module: {
        rules: [
            {
                test: /\.ts(x?)$/, 
                loader: 'ts-loader'
            }
        ]
    }
};

module.exports = config;