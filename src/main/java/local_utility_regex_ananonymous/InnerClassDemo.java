package local_utility_regex_ananonymous;

public class InnerClassDemo {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1 obja = new A1();
		obja.showA1();


		A1.B1 objb = obja.new B1();

		objb.showB1();


		A1.B1.C1 objc = objb.new C1();
		objc.showC1();

		}

		}

//_______________________________________________

		class A1{
		private int a =100;
		
		public void showA1() {
		System.out.println("show A1 :"+a);
		}
		
			class B1{
				public void showB1() {
				System.out.println("A1 a ="+a);
				}

				class C1{
					public void showC1() {
						System.out.println(" hello Show C1 :" + a);
					}
				}

			}
		}
