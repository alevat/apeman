const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');

const config = {
    context: path.resolve(__dirname, '..'),
    entry: './src/main/webapp/app/index.js',
    output: {
        filename: 'bundle.js',
        path: path.resolve(__dirname, '../build/webapp')
    },
    plugins: [
        new HtmlWebpackPlugin({
            template: './src/main/webapp//index.html',
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