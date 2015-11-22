/*
 * Copyright (c) 2015. Bond(China), java freestyle app
 */
var context = "http://localhost:8080";
require.config({
    //the configuration is not usefully, because require.js had default configuration, and the default value is current position of config.js
    baseUrl: context + '/jzen/scripts/lib',
    paths: {
        'angular-resource': 'angular/angular-resource',
        'angular-sanitize': 'angular/angular-sanitize',
        'angular-scenario': 'angular/angular-scenario',
        'angular-animate': 'angular/angular-animate',
        'angular-cookies': 'angular/angular-cookies',
        'angular-loader': 'angular/angluar-loader',
        'angular-touch': 'angular/angular-touch',
        'angular-route': 'angular/angular-route',
        'angular-mock': 'angular/angular-mock',
        'angular': 'angular/angular',
        "bootstrap": 'bootstrap/js/bootstrap.min',
        "JSXTransformer": 'react/JSXTransformer',
        'react': 'react/react-with-addons.min',
        'jsPlumb': 'jsPlumb/jsPlumb-2.0.4',
        'jquery': 'jquery/jquery-2.1.4',
        'raphael': 'raphael/raphael-min',
        'underscore': 'util/underscore',
        'control': 'util/control',
        'model': 'util/model',
        'view': 'util/view',
        'util': 'util/util',
        'style': 'util/style-adjust',
        'jsx': 'react/jsx',
        'text': 'react/text',
        'app': '../../../js'
    },
    jsx: {
        fileExtension: '.jsx',
        harmony: true,
        stripTypes: true
    },
    map: {
        '*': {
            'css': 'css'
        }
    },
    shim: {
        'bootstrap': {
            'deps': [
                'jquery',
                'style',
                'css!../lib/bootstrap/css/bootstrap.min',
                'css!../../../css/common',
                'css!../../../css/function',
            ]
        },
        'angular': {
            exports: "angular"
        },
        'angular-route': {
            deps: ['angular'],
            exports: 'angular-route'
        },
        'angular-animate': {
            deps: ['angular'],
            exports: 'angular-animate'
        },
        'angular-cookies': {
            deps: ['angular'],
            exports: 'angular-cookies'
        },
        'angular-loader': {
            deps: ['angular'],
            exports: 'angular-loader'
        },
        'angular-mock': {
            deps: ['angular'],
            exports: 'angular-mock'
        },
        'angular-resource': {
            deps: ['angular'],
            exports: 'angular-resource'
        },
        'angular-sanitize': {
            deps: ['angular'],
            exports: 'angular-sanitize'
        },
        'angular-scenario': {
            deps: ['angular'],
            exports: 'angular-scenario'
        },
        'angular-touch': {
            deps: ['angular'],
            exports: 'angular-touch'
        }
    }
});
