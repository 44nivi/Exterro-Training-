$(document).ready(function() {

	$("#clicker").click(function() {

		var info = {
			name: $("#email").val(),
			pass: $("#psw").val(),
			rpass:$("#psw-repeat").val

		};


		alert(info.name);
		alert(info.pass);
		aler(info.rpass);
		$.ajax({
			type: "post",
			datatype: 'json',
			data: { A: JSON.stringify(info) },
			contentType: 'application/json; charset=utf-8',
			url: "rest/go/register"

		});
		alert(info.pass);
	});


});