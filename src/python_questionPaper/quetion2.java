package python_questionPaper;

import java.util.ArrayList;

public class quetion2 {

    static int integer(String str) {
    	return Integer.parseInt(str);
    }
    static void split_strings(String n1,String n2) {
    	int count =-1;
		int big=0;
		for(String arg:n1.split("")) {
			 int i;
			 count=count+1;
			 if(arg.equals(n2)) {
				 if(count==0) {
					 i=(integer(n1.substring(count+1))); 
					 if(i>big) {
						 big=i;
					 }
				 }
				 else if(count==(n1.length()-1)) {
					 i=(integer(n1.substring(0,count))); 
					 if(i>big) {
						 big=i;
					 }

				 }
				 else {
					String i1=n1.substring(0,count);
					String i2=n1.substring(count+1);
					i=integer(i1+i2);
					 if(i>big) {
						 big=i;
					 }

				 }
			 }
		}
		System.out.println(big);
    }

	public static void main(String[] args) {
		String n1="1223425";
		String n2="2";
		split_strings(n1, n2);
		
	}

}
