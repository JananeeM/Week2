package Week2Day1;

public class FindTypes {

	public static void main(String[] args) {
		String test="$$Welcome to 2nd class of Automation$$";
		int letter=0,space=0,num=0,specialchar=0;
		char[] ch=test.toCharArray();
		boolean b=true;
		for(int i=0;i<ch.length;i++)
		{
			if(b==Character.isLetter(ch[i]))
						letter++;
			else if(b==Character.isDigit(ch[i]))
						num++;
			else if(b==Character.isSpaceChar(ch[i]))
						space++;
			else
				specialchar++;			
					
		}
		System.out.println("Number Of Letters In The Given Senetence is : "+num);
		System.out.println("Number Of Space In The Given Senetence is : "+space);
		System.out.println("Number Of Letters In The Given Senetence is : "+letter);
		System.out.println("Number Of SpecialCharacters In The Given Senetence is : "+specialchar);
		
	}

}
