/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

define(['app'], function (app) {
    'use strict';
    return app.config(['$routeProvider', function ($routeProvider) {

        $routeProvider.when('/home', {
            templateUrl: '/module/home/home.html',
            controller: 'HomeCtrl'
        }).otherwise({
            redirectTo: 'error.html'
        });
    }]);
});