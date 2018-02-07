/**
 * 
 */
var app = angular.module('app2', ['ngRoute'])

app.config(function($routeProvider){
	$routeProvider
	.when('/home',{
		templateUrl:'home.html'
	})
	.when('/aboutus',{
		templateUrl:'aboutus.html'
	})
	.when('/contactus',{
		templateUrl:'contactus.html'
	})
	.otherwise({redirectTo: '/'});
})