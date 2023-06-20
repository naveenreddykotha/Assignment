package javateam_questions;

public class ArmStrong {
	
	public static int findArmstrong(int x) {
		// TODO Auto-generated method stub
		int total=0;
		int length=String.valueOf(x).length();
		char[] ch=String.valueOf(x).toCharArray();
		for(char c:ch) {
			//int num=Character.getNumericValue(c); this also works...
			int num=Integer.parseInt(c+""); //either this also work
			total+=(int) Math.pow(num, length);
		}
		return total;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=153;
		findArmstrong(x);
		if(x==findArmstrong(x)) {
			System.out.println("The given number "+x+" is ArmStrong Number");
		}
		else {
			System.out.println(x+" not a ArmStrong Number...");
		}

	}

	

}
