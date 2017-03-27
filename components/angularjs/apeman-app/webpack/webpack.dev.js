const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');

const config = {
    context: path.resolve(__dirname, '..'),
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
                test: /\.html$/,
                exclude: /node_modules/,
                loader: 'html-loader'
            },
            {
                test: /\.ts$/,
                exclude: /node_modules/,
                use: 'ts-loader'
            },
            {
                test: /\.(eot|svg|ttf|woff|woff2)$/,
                loader: 'file?name=fonts/[name].[ext]',
            }
        ]
    }
};

module.exports = config;