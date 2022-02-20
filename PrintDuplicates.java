package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates 
{

	public static void main(String[] args) 
	{
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> duplicate= new ArrayList<Integer>();
		for(int i : arr)
		{
			if(!set.add(i))
			
				duplicate.add(i);
		}	
		
		System.out.println(duplicate);
	}

}
