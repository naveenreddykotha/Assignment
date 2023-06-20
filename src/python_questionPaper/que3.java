package python_questionPaper;

import java.util.Arrays;

public class que3 {


	public static void main(String[] args) {
		String str="satish is a java developer";
		String result="";
		int con=0;
		for(String arg:str.split("")) {
		   
		   if("aeiou".contains(arg)) {
			     result+="_";
		   }
		   else {
			   result +=arg;
			   con+=1;
		   }
			
		};

		System.out.println(String.format("result=>%s\nconsonants=>%d",result,con));
	}

}
