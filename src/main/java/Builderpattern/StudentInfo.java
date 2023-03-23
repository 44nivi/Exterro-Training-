package Builderpattern;

public class StudentInfo 
{
public static void main(String[] args) {
	builddata student=new StudentInfoBuilder().Student("nive").setAge(22).setGender("male").build();
	System.out.println(student);
}
}
