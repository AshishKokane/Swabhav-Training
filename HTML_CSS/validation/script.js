jQuery('#frm').validate({




	rules:{
		name:"required",
		email:{
			required:true,
			//== email:true,
			regex: /^([a-zA-Z0-9._]{5,50})([@]{1})([a-z]{5,15})([.]{1})([a-z]{2,6})$/
		},
		password:{
			required:true,
			minlength:5
		},
	},messages:{
		name:"Please enter your name",
		
		email:{
			required:"Please enter email",
			regex:"Please enter valid email",
		},
		password:{
			required:"Please enter your password",
			minlength:"Password must be 5 char long"
		},
	},
	submitHandler:function(form){
		form.submit();
	}
});



var fname_regex =/^([a-zA-Z])/ 
var no_regex =/^([0-9]{10})$/
var email_regex = /^([a-zA-Z0-9._]{5,50})([@]{1})([a-z]{5,15})([.]{1})([a-z]{2,6})$/
var landline_regex=/^([0-9]{3})([-]{1})([0-9]{8})$/



userform.addEventListener("submit", validateForm);





function validateForm(e){

  e.preventDefault();}