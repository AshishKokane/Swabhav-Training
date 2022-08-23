var email = document.getElementsById("email")
var password = document.getElementsById("password")
var gender = document.getElementsByName("gender")
var DOB = document.getElementsById("d1")
var address = document.getElementsById("Address")
var state = document.getElementsById("inputState")
var city = document.getElementsById("inputcity")
var zipcode = document.getElementsById("inputZip")
var notification = document.getElementsById("check")

var form = document.getElementsById("registerform");


var emailreg = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;



form.addEventListener("submit", validateForm);

function validateForm(e){

    e.preventDefault();

if (email.value.match(emailreg)) {

    alert("Valid email address!");


}

}
