package week3.day2;


public class Automation extends MultipleLanguage 
{	
	public void Selenium() 
	{
		System.out.println("We are using Selenium as an Automation tool");
		
	}

	public void Java() 
	{
		System.out.println("Java is widely used programming language for automation");
		
	}
	
	public void Ruby() 
	{
		System.out.println("Ruby is an another language that used in automation");
	}

	public static void main(String[] args) 
	{
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		auto.Python();
		auto.Ruby();
	}

	private void Python() {
			
	}

}