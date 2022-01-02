package week1.day11;

public class Fibonacci {
	
	 static int m=0,n=1,p=0;    
	 static void printFibonacci(int count){    
	    if(count>0){    
	         p = m + n;    
	         m = n;    
	         n = p;    
	         System.out.print(" "+p);   
	         printFibonacci(count-1);    
	     }    
	 }    
	 public static void main(String args[]){    
	  int count=10;    
	  System.out.print(m+" "+n);   
	 }  
	}  
