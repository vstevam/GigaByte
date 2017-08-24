//App
var app = angular.module("GigaByte", [ 'ngRoute' ])
var totalRequest = 0;

// Router
app.config(function($routeProvider) {
	$routeProvider.when("/pedido", {
		templateUrl : "request.html"
	});
});

// Controllers and Services
app.controller("bodyController",function($scope){
	  $scope.class = "div-full";
	  $scope.changeClass = function(){
	    if ($scope.class === "div-full")
	      $scope.class = "div-full-none";
	    else
	      $scope.class = "div-full";
	  };
	  
	  $scope.processData = function(data, cb, qtdIng) {
			  $scope.my = totalRequest 
			  console.log($scope.my)
		}
	  
	})


.controller('allController', ['$scope', function($scope) {

  $scope.my = totalRequest 
  console.log($scope.my)
}])

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
	$scope.processDataMenu = function(data, cbMenu, qtdSnack) {
		var price = data.price * qtdSnack;

		if (cbMenu) {
			totalRequest = totalRequest + price;
		} else {
			totalRequest = totalRequest - price;
		}
			}
	
	$scope.input = {
			qtdSnack : 1
		}

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

	$scope.processData = function(data, cb, qtdIng) {
		var price = data.price * qtdIng;

		if (cb) {
			totalRequest = totalRequest + price;
		} else {
			totalRequest = totalRequest - price;
		}
		  $scope.my = totalRequest 
		  console.log($scope.my)
	}

	$scope.input = {
		qtdIng : 1
	}

	var promise = ingredientsService.getIngredients();
	promise.then(function(data) {
		$scope.ingredients = data.data;

	});
});
