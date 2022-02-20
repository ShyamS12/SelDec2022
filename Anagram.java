package week3.day2;

import java.util.Arrays;

public class Anagram 
{

	public static void main(String[] args) 
	{
		String txt1 = "stop";
		String txt2 = "pots";
		
		if(txt1.length()==txt2.length())
		{
			char[] txtArray1 = txt1.toCharArray();
			char[] txtArray2 = txt2.toCharArray();
			Arrays.sort(txtArray1);
			Arrays.sort(txtArray2);
			
			if(Arrays.equals(txtArray1, txtArray2))
			
				System.out.println(txt1+" and "+txt2+" are Anagram");
			else
				System.out.println("The given strings are not Anagram");
		}
	}
}