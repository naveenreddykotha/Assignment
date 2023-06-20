package javateam_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//count how many times the characters are repating and print it in console
		
		String s="aabbc";
		ArrayList l=new ArrayList(Arrays.asList("aabbc".split("")));
		for(String str:s.split("")) {
		long i=	l.stream().filter(arg->arg.equals(str)).count();
			System.out.println(str+" "+i);
		}

		
		
		System.out.println("******using hashmap*********");
		HashMap<Character,Integer> hm=new HashMap();
		String word="aabcc";
		char[] ch=word.toCharArray();
		for(char c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		
	}
	
	

}
