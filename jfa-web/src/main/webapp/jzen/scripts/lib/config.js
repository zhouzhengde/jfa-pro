/*
 * Copyright (c) 2015. Bond(China), java freestyle app
 */

require.config({
	//the configuration is not usefully, because require.js had default configuration, and the default value is current position of config.js 
	baseUrl		: 'jzen/scripts/lib', //Consts.getAppPath('jzen/scripts/lib'),
	paths		: {
    	'jquery'			: 'jquery/jquery-2.1.4',
		'angular'			: 'angular/angular',
		'angular-route' 	: 'angular/angular-route',
		'angular-animate' 	: 'angular/angular-animate',
		'angular-cookies'	: 'angular/angular-cookies',
		'angular-loader'	: 'angular/angluar-loader',
		'angular-mock'		: 'angular/angular-mock',
		'angular-resource'	: 'angular/angular-resource',
		'angular-sanitize'	: 'angular/angular-sanitize',
		'angular-scenario'	: 'angular/angular-scenario',
		'angular-touch'		: 'angular/angular-touch',
		'react'				: 'react/react-with-addons.min',
		"JSXTransformer"	: 'vendor/JSXTransformer',
		'raphael'			: 'raphael/raphael-min',
		'jsPlumb'			: 'jsPlumb/jsPlumb-2.0.4',
		'underscore'		: 'util/underscore',
		'control'			: 'util/control',
		'model'			    : 'util/model',
		'view'			    : 'util/view',
		'util'			    : 'util/util',
		'app'				: 'js', // Consts.getAppPath("js")
  	},
	jsx			: {
		fileExtension		: '.jsx'
	},
	css			: {
		fileExtension		: '.css'
	},
  	shim		:{
  		'angular'		: {
  			exports		: "angular"
  		 },
  		 'angular-route': {
  			 deps		: ['angular'],
  			 exports	: 'angular-route'
  		 },
  		 'angular-animate'	: {
  			 deps		: ['angular'],
  			 exports	: 'angular-animate'
  		 },
  		'angular-cookies'	: {
 			 deps		: ['angular'],
 			 exports	: 'angular-cookies'
 		 },
 		'angular-loader'	: {
 			 deps		: ['angular'],
 			 exports	: 'angular-loader'
 		 },
 		 'angular-mock'	: {
  			 deps		: ['angular'],
  			 exports	: 'angular-mock'
  		 },
  		 'angular-resource'	: {
  			 deps		: ['angular'],
  			 exports	: 'angular-resource'
  		 },
  		 'angular-sanitize'	: {
  			 deps		: ['angular'],
  			 exports	: 'angular-sanitize'
  		 },
  		 'angular-scenario'	: {
  			 deps		: ['angular'],
  			 exports	: 'angular-scenario'
  		 },
  		 'angular-touch'	: {
  			 deps		: ['angular'],
  			 exports	: 'angular-touch'
  		 }    		 
  	 }
});
