
$( document ).ready(function() {
$('#submitFeedback').click(function(){
		if (formIsFilled()&& validateemail())
		{
			alert("Thanks for your feedback!");
			window.location.reload();
			return true;
			
		}
		else
		{
		return false;
		}
});	

		function formIsFilled(){
		if($('#fullname').val()!="" && $('#email').val()!="" )
		{
		$("#warning1").text("");
		return true;
		}
		else 
		{
		$("#warning1").text("Name and email ID are required");
		return false;
		}
		}

		function validateemail(){
		var emailVar=$("#email").val();
			var emailRegExp = /^[a-zA-Z0-9_.]+@[A-Za-z0-9.-]+\.[a-zA-Z]{2,3}$/;
			if(emailRegExp.test(emailVar))
				{
				$("#emailSpan").text("");
				return true;
				}
			else
				{
				$("#emailSpan").text("Enter a valid Email ID");
				return false;
				}
		}
		$('#email').blur(function(){
			validateemail();
		});
var app = angular.module('myApp', []);
app.controller('validateCtrl', function($scope) {
    $scope.user = '';
    $scope.email = '';
	$scope.submitForm = function() {

            // check to make sure the form is completely valid
            if ($scope.myForm.$valid) {
                alert('Thanks for your feedback!');
				 $scope.user = '';
				$scope.email = '';
				$scope.myForm.$setPristine();
            }

        };
});
});