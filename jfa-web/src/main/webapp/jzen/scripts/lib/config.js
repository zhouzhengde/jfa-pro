/*
 * Copyright (c) 2015. Bond(China), java freestyle app
 */
var context = "";
require.config({
    //the configuration is not usefully, because require.js had default configuration, and the default value is current position of config.js
    urlArgs : 'v1.0.0',
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
        'icheck': 'jquery/icheck/icheck',
        'validator': 'jquery/validator/jquery.validationEngine',
        'validator-en': 'jquery/validator/languages/jquery.validationEngine-en',
        'validator-zh_CN': 'jquery/validator/languages/jquery.validationEngine-zh_CN',
        'raphael': 'raphael/raphael-min',
        'underscore': 'util/underscore',
        'control': 'util/control',
        'model': 'util/model',
        'view': 'util/view',
        'util': 'util/util',
        'style': 'util/style-adjust',
        'jsx': 'react/jsx',
        'text': 'react/text',
        'root': '../../../js',
        'app': '../../../js/app',
        'module': '../../../module'
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
        'icheck': {
            'deps': [
                'jquery',
                'css!../lib/jquery/icheck/skins/all'
            ]
        },
        'validator': {
            'deps': [
                'jquery',
                'validator-en'
            ]
        },
        'validator-en' : {
            'deps' :[
                'jquery'
            ]
        },
        'validator-zh_CN' : {
            'deps' :[
                'jquery'
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
    },
    deps : [
        'bootstrap'
    ]
});

(function(global){
    global.appPath = '<%=request.getContextPath()%>';
    global.Consts = {};
    global.Consts.getAppPath = function(url){
        if(url == undefined || url == null){
            url = "";
        }
        return global.appPath + "/" + url;
    };
    global.Consts.getAppJsPath = function(js){
        return global.appPath + '/js/' + js;
    };
})(window.top);

/**
 * Created by Admin on 2015/11/21.
 * bootstraps angular onto the window.document node
 */
define([
    'require',
    'angular',
    'jquery',
    'angular-route',
    'root/routes',
    'app'
], function (require, ng, $) {
    'use strict';
    $(function () {
        ng.bootstrap(document, ['app']);
    });
});