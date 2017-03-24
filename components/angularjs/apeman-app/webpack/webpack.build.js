const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');

const config = {
    context: path.resolve(__dirname, '..'),
    entry: './src/main/webapp/app/index.ts',
    output: {
        filename: 'bundle.js',
        path: path.resolve(__dirname, '../build/webapp')
    },
    resolve: {
        extensions: ['.ts', '.js', '.json']
    },
    plugins: [
        new HtmlWebpackPlugin({
            template: './src/main/webapp/index.html',
            inject: 'body',
            hash: true
        })
    ],
    module: {
        rules: [
            {
                test: /\.ts$/,
                exclude: /node_modules/,
                use: 'ts-loader'
            }
        ]
    }
};

module.exports = config;