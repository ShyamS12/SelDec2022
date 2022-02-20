package week3.day2;

public class CharOccur {

 
	{

public static void main(String[] args)
{
	
String dialogue = "Welcome to Chennai";
			int count = 0;
			char[] strChar = dialogue.toCharArray();
			int length = strChar.length;
			for(int i=0;i<length;i++)
			{
				if('n'== strChar[i])
				{
					count++;
				}
			}
			
			System.out.println("The character 'n' is "+count+" times occured in the string");
		}
	}
}S