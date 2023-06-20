package questions;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="ABCAB";
//		String rev="";
//		char[] strarr=w.toCharArray();
//		for(int i=0;i<strarr.length;i++) {
//			if(rev.indexOf(i)==-1) {
//				rev+=strarr[i];
//			}
//		}
//		System.out.println(rev);
		for (int i = 0; i < string.length(); i++)
	    {
	        int flag = 0;
	        for (int j = 0; j < string.length(); j++)
	        {
	            // checking if two characters are equal
	            if (string.charAt(i) == string.charAt(j) && i != j)
	            {
	                flag = 1;
	                break;
	            }
	        }
	        if (flag == 0)
	            System.out.print(string.charAt(i));
	    }
		
		
	}

}
