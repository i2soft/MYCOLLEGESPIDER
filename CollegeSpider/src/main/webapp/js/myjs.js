// create angular app
	var validationApp = angular.module('loginform_main_horizontal_validationApp', []);

	// create angular controller
	validationApp.controller('loginform_main_horizontal_validationController', function($scope) {

		// function to submit the form after all validation has occurred			
		$scope.submitForm = function() {

			// check to make sure the form is completely valid
			if ($scope.userForm.$valid) {
				alert('our form is amazing');
			}

		};

	});