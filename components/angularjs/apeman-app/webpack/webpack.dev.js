const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');

const rootPath = path.resolve(__dirname, '..');
const sourcePath = path.join(rootPath, 'src');
const destPath = path.join(rootPath, 'build/webapp');

const config = {
    context: sourcePath,
    devtool: 'source-map',
    devServer: {
        contentBase: [destPath],
        proxy: {
            'api': 'http://localhost:8080/'
        }
    },
    entry: './app/app.module.ts',
    output: {
        filename: 'bundle.js',
        path: destPath
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
            },
            {
                test: /\.(eot|svg|ttf|woff|woff2)$/,
                loader: 'file?name=fonts/[name].[ext]'
            }
        ]
    }
};

module.exports = config;