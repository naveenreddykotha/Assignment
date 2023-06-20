package questions;

public class Program3 {
	//Inheritance is acquiring all variables and methods from one class to another class
	//multiple inheritance is not possible to achieve that we use interface concept
	class A1{
		public void m1() {
			System.out.println("this is m1 class 1");
		}
	}
	
	class B2 extends A1{
		
		void m2() {
			System.out.println("this is class 2");
		}
		
		
	}
	
	class c extends B2{
		void txt() {
			System.out.println("this is class 3");
		}
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
 
	}

}
