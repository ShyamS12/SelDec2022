package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrgmFindIntersection 
{

	public static void main(String[] args) 
	{
		int arr1[] = {3,2,11,4,6,7};
		int arr2[] = {1,2,8,4,9,7};
		
		Set<Integer> set = new HashSet<Integer>();
		
		List<Integer> finalList = new ArrayList<Integer>();
		
		for(int i : arr1)
		
			set.add(i);
			
		for(int i : arr2)
		{
			if(set.contains(i))
			
				finalList.add(i);	
		}
		
		System.out.println("Intersection of the given arrays "+finalList);
	}
}
	