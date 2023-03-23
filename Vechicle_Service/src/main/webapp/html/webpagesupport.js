 function msgprint() 
 {
var val1= document.getElementById("Uname").value;
var val2=document.getElementById("Pass").value;
alert(val1+val2)
	try
	 {
		alert(val1+val2)
	 if (val1 =="nivek" && val2 =="1234")
		{
		 alert("Welcome to the site!!!!!!!!!!!"); 
		 window.location="https://www.tutorialspoint.com";
			 
		}
	 }
	 catch(e)
	 {
		 alert("Please Enter the Valid User name an Password !!!!") 
	 }
   
} 