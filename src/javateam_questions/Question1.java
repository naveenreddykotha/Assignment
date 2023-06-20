package javateam_questions;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get an input string in that find lower,upper and other characters
		
		String w="aB1#@%";
		char[] charr=w.toCharArray();
		for(int i=0;i<charr.length;i++) {
			if(Character.isLowerCase(charr[i])) {
				System.out.println(charr[i]+" - lower");
			}
			else if(Character.isUpperCase(charr[i])){
				System.out.println(charr[i]+" - upper");
			}
			else {
				System.out.println(charr[i]+" - other");
			}
		}

	}

}
