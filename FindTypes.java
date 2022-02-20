package week3.day2;

public class FindTypes {

	public static void main(String[] args) {
		{
			String line = "$$ Welcome to 4th class of Automation $$";
			int letter = 0,space = 0,num = 0,splChar = 0;
			char[] lineChar = line.toCharArray();
			
			for(int i=0;i<lineChar.length;i++)
			{
				
				if(Character.isLetter(lineChar[i]))
				
					letter++;
				
				else if(Character.isSpaceChar(lineChar[i]))
				
					space++;
				
				else if(Character.isDigit(lineChar[i]))
				
					num++;
				
				else
				
					splChar++;
				
			}
			System.out.println("Number of letters: "+letter);
			System.out.println("Number of space: "+space);
			System.out.println("Numbers count: "+num);
			System.out.println("Number of Special Characters: "+splChar);
		}
	}
	}

