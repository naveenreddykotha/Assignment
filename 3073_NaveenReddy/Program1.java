package questions;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="aeiou";
		String[] vowels= {"a","e","i","o","u"};
		int vowelsCount = 0;
		int consonantsCount=0;
		char[] wordArray=word.toCharArray();
		for(int i=0;i<=wordArray.length-1;i++) {
			if(word.contains(vowels[i])) {
				vowelsCount++;
			}
			else {
				
				consonantsCount++;
			}
		}
		//System.out.println(word.contains(vowels[0]));
		System.out.println("vowels count: "+vowelsCount);
		System.out.println("consonants count: "+consonantsCount);
	}

}
