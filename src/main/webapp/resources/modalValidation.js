$(document).ready(function(){

		
	function resetForm(){
		$('#firstname').val("");
		
		$('#regEmail').val("");
		$('#pass').val("");
		$('#warning1').text("");
		$('[name=Username]').val("");
		$('[name=Password]').val("");
	}
$('#loginButton').click(function(){
	var username=$('[name=Username]').val();
	var loginPass=$('[name=Password]').val();
	if(username==localStorage.getItem("email")&& loginPass==localStorage.getItem("password")){
	//$("#welcome").text();
		resetForm();
		alert("Welcome ! "+localStorage.getItem("firstname")+ " " );
		return true;
		}
		else{
		alert("Invalid credentials!");
		return false;
		}
		});
	$('#registerUser').click(function(){
		if (formIsFilled()&& validateemail()&& validateConfirmPassword()&& validatePassword())
		{
			if (typeof(Storage) !== "undefined") {
			// Store
			localStorage.setItem("firstname", $('#firstname').val());
			localStorage.setItem("lastname", $('#lastname').val());
			localStorage.setItem("email", $('#regEmail').val());
			localStorage.setItem("password", $('#pass').val());
			// Retrieve
			resetForm();
			alert("Thanks for registering to FitFoodie!");
			return true;
			}
			
		}
		else{
		return false;

		}
		
	});	

		function formIsFilled(){
		if($('#firstname').val()!=""  && $('#regEmail').val()!="" && $('#pass').val()!="" )
		{
		$('#warning1').text("Submitted");
		return true;
		
		}
		else 
		{
		$('#warning1').text("All fields are mandatory");
		return false;
		}
		}
			
		$('#regEmail').blur(function(){
			validateemail();
		});

		$('#pass').blur(function(){
		validatePassword();
		});
	
		function validateemail(){
		var emailVar=$("#regEmail").val();
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
		


		function validatePassword(){
		var pass=$("#pass").val();
		var myRegExppass=/^([a-zA-Z0-9@*#]{8,15})$/;
		if(myRegExppass.test(pass))
		{	
		$("#passSpan").text("");
		return true;
		}
		else
		{
		$("#passSpan").text("Not a valid password");
		return false;
		}
		}

	

	
});

	