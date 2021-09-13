package Week2Day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Madam";
		char[] ch=str.toCharArray();
		int len=str.length();
		String rev="";
		//System.out.println(len);
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+ch[i];
			
			//System.out.print(ch[i]);
		}
		System.out.println(rev);
		if(str.equalsIgnoreCase(rev))
			System.out.println("The Given String Is A Palindrome");
		else
			System.out.println("The Given String Is Not A Palindrome");
			

	}

}
