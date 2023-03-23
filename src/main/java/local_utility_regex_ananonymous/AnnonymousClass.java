package local_utility_regex_ananonymous;

public class AnnonymousClass {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampB aa = new SampB();
		aa.objA.showSampA1();
		
		}

		}
//_________________________________________________

		class SampA{

		public void showSampA1() {
		System.out.println("hello showSampA()");
		}
		}

		class SampB{
		

		SampA objA =new SampA() {
		
		public void showSampA() {
		System.out.println("hello SampA in the SampB");
		}

		};




		}

	
	

