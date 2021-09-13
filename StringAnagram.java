package Week2Day1;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String str="HEART";
		char[] ch=str.toCharArray();
		String str1="EARTH";
		char[] ch1=str1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch);
	
			System.out.println(ch);
		
		
			System.out.println(ch1);
		
		

		int count=0;
		
			if(Arrays.equals(ch, ch1))				
				count++;
		
		if(count==0)
			System.out.println("Not Anagram");
		else
			System.out.println("Anagram");
		
	}

}
