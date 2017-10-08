'use strict';

var MAX_ROWS = 5;


var pctApp = angular.module('pctApp', ['angularSimplePagination']);

pctApp.service('pctServ', ['$http', pctServ]);

pctApp.controller('indexCtrl', indexCtrl);
indexCtrl.$inject = ['$scope', 'pctServ'];



