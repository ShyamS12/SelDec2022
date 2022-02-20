package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates 
{

	public static void main(String[] args) 
	{
		String line = "We learn java basics as a part of java sessions in java week3";
		String[] strArr = line.split(" ");
		String outText = "";
		Set<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<strArr.length;i++)
		{
			set.add(strArr[i]);
		}
		outText = String.join(" ", set);
		System.out.println(outText);

	}

}