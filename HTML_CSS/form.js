jQuery('#Form').validate({


    rules:{
        first_name :'required',
        last_name :'required',
        email_address: {
            required: true,
            // email:true
          email: /^([a-zA-Z0-9._]{5,50})([@]{1})([a-z]{5,15})([.]{1})([a-z]{2,6})$/


        } ,
        password:{
            required: true,
            minlength:5


        },
        Country: {required: true},
        street_address: 'required',
        city:'required',
        region:'required',
        postal_code:{
            required: true,
            // maxlength:6,
             pattern: /^[1-9][0-9]{5}$/,
        } 

    },

    messages:{
        first_name: "please enter first name",
        last_name:"please enter last name",
        password:{
            required: "please enter password",
            minlength:"password must be 5 char long"
        },
        email_address:{
            required: "please enter email",
            email:"please enter valid email"

        },
        Country: {required: "select country"
        },
        street_address: "please enter street address",
      
        city:"please enter City",
        region:"please enter State",
        postal_code:{
             required: "please enter Postal code",
             pattern: "postal code length shoulg be 6",
            //  maxlength:"Postal code  must be 6 char long"
    
        } 


    },


	submitHandler:function(form){
        form.preventDefault();
		form.submit();
	}
}
);