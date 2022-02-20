package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargeNumber 
{

	public static void main(String[] args) 
	{
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		Collections.sort(arr);
		int size = arr.size();
		System.out.println("Second Largest number : "+arr.get(size-2));
	}

}
