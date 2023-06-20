package python_questionPaper;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {1,3,2,4};
		LinkedList<Integer> L=new LinkedList<Integer>();
         for(int obj:numbers) {
        	 if(obj%2==0) {
        		 L.addFirst(obj);
        	 }
        	 else {
        		 L.addLast(obj); 
        	 }
         }
		
       System.out.println(L);
	}

}
