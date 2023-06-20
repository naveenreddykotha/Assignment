package python_questionPaper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class que4 {


	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Integer> i= List.of(1,1,2,34,5,6,7,7,4,66,6,7,8);
	
	    
	    HashMap<Integer,Integer> M=new HashMap();
		for(int arg:i) {
			M.put( (int) Math.pow(arg, 2),arg);
		}
	   
	   ArrayList<Integer> A=new ArrayList(M.keySet());
	   Collections.sort(A,Collections.reverseOrder());
	    HashMap<Integer,Integer> result=new HashMap();
	    int count=0;
	   for(int arg:A) {
		   count=count+1;
		   result.put(count,arg);
	   }
	   System.out.println(result);
	 
	}

	

}
