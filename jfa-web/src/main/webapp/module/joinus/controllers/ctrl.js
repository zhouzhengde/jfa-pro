/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

define([
    '../.md',
    'angular',
    'jquery',
    'underscore'
], function (md, ng, $, _) {

    return md.controller('SupportCtrl', ['$scope', function($scope){

        $scope.moduleName = "Bond Zhou support!";
    }]);
});