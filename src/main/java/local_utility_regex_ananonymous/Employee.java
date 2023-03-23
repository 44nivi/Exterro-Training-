/*
 * this program is to look after the functioning of serialization 
 * In this class Employee ,Serialization is implemented 
 * private variables will be created
 * Transient private variable also created
 * 
 */

package local_utility_regex_ananonymous;

	import java.io.Serializable;
	public class Employee  implements Serializable {


	 private String name = null;
	 private transient int SSNo = 0; //like a password
	 private String Address;

	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getSSNo() {
	return SSNo;
	}
	public void setSSNo(int sSNo) {
	this.SSNo = sSNo;
	}
	public String getAddress() {
	return Address;
	}
	public void setAddress(String address) {
	Address = address;
	}


	}
	
	//________________________________________________________________
	
	
