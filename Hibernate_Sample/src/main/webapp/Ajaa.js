$(document).ready(function() {

	$("#clicker").click(function() {
		var Input = {

			Lname: $("#user").val(),

			Lpass: $("#pwd").val()

		}

		alert(Input.Lname + Input.Lpass)

		console.log("2");

		$.ajax({

			type: "POST",

			dataType: "Json",

			data: { val1: JSON.stringify(Input) },

			contentType: "application/json",

			url: "rest/reg/signup",

			success: function(data) {
				location.href("D:\NivekProjects\Hibernate_Sample\src\main\webapp\success.html")
			},
			
		failure:function(){
			        console.log(res);

		//	location.href()
			}

		});

	});

});


function register() {

   console.log("welcome")
    alert("call!!!")
     event.preventDefault();
    
    var infos = {
        name : $("#uname").val(),
        age : $("#age").val(),
        email:$("#email").val(),
        phone:$("#phone").val(),
        date : $("#date").val(),
        password : $("#password").val(),
        confirmpassword : $("#confirmPassword").val()
    };
    
    console.log("after data")
   
      $.ajax({
        
        type : "POST",
        
        data: {B : JSON.stringify(infos)},
        contentType:"appliction/Json",
        url:"rest/reg/hit",
        success : function(B){
            console.log("this is msg"+B);
            alert("i am done!!!!");
            
        }
    });

    
    console.log("data")
    

    
    
}
