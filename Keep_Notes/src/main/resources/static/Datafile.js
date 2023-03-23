var index = [];
// Array starts with 0 but the id start with 0 so push a dummy value
index.push(0);
// Push 1 at index 1 since one child element is already created
index.push(1)

function addkid() {

	var div = document.createElement('div');
	var id = getID();
	// Set this attritube id so that we can access this element using Id
	div.setAttribute("id", "Div_" + id);

	div.innerHTML = 'Child_' + id + ':  <div><input type="text" name="child_' + id + '"/>' + ' <input type="button" id="add_kid()' + id + '" onclick="addkid()" value="add" />' + ' <input type="button" id="rem_kid()' + id + '" onclick="remkid(' + id + ')" value="delete" /></div>';
	// inside of passing this parameter in remkid we pass id number
	document.getElementById('kids').appendChild(div);


}

function remkid(id) {
	// use the id arugment to get the div element using unique id set in addkid
	try {
		var element = document.getElementById("Div_" + id)
		element.parentNode.removeChild(element);
		index[id] = -1;
		//id number is = index of the array so we set to -1 to indicate its empty
	}
	catch (err) {
		alert("id: Div_" + id)
		alert(err)

	}
}
function getID() {
	var emptyIndex = index.indexOf(-1);
	if (emptyIndex != -1) {
		index[emptyIndex] = emptyIndex

		return emptyIndex
	} else {
		emptyIndex = index.length
		index.push(emptyIndex)
		return emptyIndex
	}
}


function button1() {
	for (var i = 2; i < index.length; i++) {
		index[i] = -1;
	}
	addkid();

}
function submitData() {
	const s = [];
	var j = 0;
	var data = "";
	for (j = 1; j < index.length; j++) {
		var x1 = document.getElementsByName("child_" + j + "");

		const a = x1[0];
		// data = data + "arr[" + j + "].value=" + a.value;
		s[j - 1] = a.value;

	}



	$.ajax({
		type: "post",
		datatype: 'json',
		data: JSON.stringify(s),
		contentType: 'application/json; charset=utf-8',
		url: "/regi",
		success: function namm(data = []) {
			// console.log(data);	
			alert("hii");
			//  alert(data);		
			
			let list = document.getElementById("myList");
			var Strr = "item"
			for (var i = 0; i < data.length; i++) {
				
				var str = JSON.stringify(data[i]);
				let li = document.createElement("li");
				li.innerText = str;
				list.appendChild(li);

				//<div><input type="button" id="add_1" onclick="add" value="add" /></div>";
			}
		}
	});
}