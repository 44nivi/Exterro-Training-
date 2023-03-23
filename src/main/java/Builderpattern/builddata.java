package Builderpattern;

public class builddata {	    
	    private String fName;
	    private String gender;
	    private int age;
	  
			
		public builddata(String fName, String gender, int age) {
			// TODO Auto-generated constructor stub
			super();
			this.fName = fName;
			this.gender = gender;
			this.age = age;
		}
		@Override
		public String toString() {
			return "builddata [fName=" + fName + ", gender=" + gender + ", age=" + age + "]";
		}
  
}
