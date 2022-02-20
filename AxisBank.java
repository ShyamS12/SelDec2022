package week3.day1;

import org.openqa.selenium.BuildInfo;

public class AxisBank extends BuildInfo{
	
	public void deposit()
	{
		System.out.println("deposit in AxisBank");
	}
	
	public static void main(String[] args) {
		AxisBank axisbank = new AxisBank();
		axisbank.deposit();
		axisbank.saving();
		axisbank.fixed();
	}
	}
