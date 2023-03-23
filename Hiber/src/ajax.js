$(document).ready(function() {

	$("#click").click(function() {

		var info = {
			name: $("#usr").val(),
			pass: $("#pwd").val()

		};



		alert(info.name);
		alert(info.pass)
		$.ajax({
			type: "POST",
			datatype: 'json',
			data: { A: JSON.stringify(info) },
			contentType: 'application/json, charset=utf-8',
			url: "rest/go/register"



		});




	});





});