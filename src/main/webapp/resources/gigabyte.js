//App
var app = angular.module("GigaByte", [ 'ngRoute' ]).controller("allController",
		function($scope) {
			$scope.clickedRow = function(checked) {
				if (checked) {
					// add to the list
				} else {
					// remove from list
				}
			}
		});

// Router
app.config(function($routeProvider) {
	$routeProvider.when("/pedido", {
		templateUrl : "request.html"
	});
});

// Controllers and Services

app.service("menuService", function($http, $q) {
	var deferred = $q.defer();
	$http.get('resources/json/menujson.json').then(function(data) {
		deferred.resolve(data);
	});

	this.getSnacks = function() {
		return deferred.promise;
	};

})

.controller("MenuController", function($scope, menuService) {
	var promise = menuService.getSnacks();
	promise.then(function(data) {
		$scope.snacks = data.data;

	});
});

app.service("ingredientsService", function($http, $q) {
	var deferred = $q.defer();
	$http.get('resources/json/ingredientsjson.json').then(function(data) {
		deferred.resolve(data);
	});

	this.getIngredients = function() {
		return deferred.promise;
	};

})

.controller("ingredientsController", function($scope, ingredientsService) {
	var promise = ingredientsService.getIngredients();
	promise.then(function(data) {
		$scope.ingredients = data.data;

	});
});
