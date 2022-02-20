package week3.day2;

public class RevEvenWords {

	{

		public static void main(String[] args) 
		{
			String test = "I am a software Tester";
			String[] split = test.split(" ");
			String even = "";
			String rev = "";
			String outTest = "";
			
			for(int i=0;i<split.length;i++)
			{
				if(i%2!=0)
				{
					even = split[i];
					
					for(int j=even.length()-1;j>=0;j--)
					{
						rev = rev+even.charAt(j);
					}
					
					split[i] = rev;
					rev = "";
				}
			}
			
			outTest = String.join(" ", split);
			System.out.println("Reversed string "+outTest);
		}
	}
}
