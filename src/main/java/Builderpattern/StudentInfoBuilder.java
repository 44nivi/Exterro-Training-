package Builderpattern;

public class StudentInfoBuilder {

public String fName;
public String gender;
public int age;


public StudentInfoBuilder Student (String fName) {
	// TODO Auto-generated constructor stub
	this.fName=fName;
	return this;
	}


public StudentInfoBuilder setGender(String gender) {
this.gender = gender;
return this;
}


public StudentInfoBuilder setAge(int age) {
this.age = age;
return this;
}

public builddata build() {
return new builddata (fName,gender,age);
}

}