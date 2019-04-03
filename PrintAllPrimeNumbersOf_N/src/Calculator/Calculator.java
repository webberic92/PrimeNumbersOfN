package Calculator;

import java.util.Scanner;

public class Calculator {
	
	public Calculator(){}
	
	public void PrimeOfN() {
		Scanner scanN = new Scanner(System.in);
	      int i =0;
	      int num =0;
	      String  primeNumbers = "";
	      
	    System.out.println("Hello,");
	   	System.out.println("This Program tells you all prime numbers of N.");
		System.out.println("Please enter what you would like  " + "N" + "  to be...");
	     
		int n = scanN.nextInt();
	      scanN.close();
	     
	      for (i = 1; i <= n; i++)  	   
	      { 
	         int counter=0; 
	         for(num =i; num>=1; num--)
	         {
	        
	       //How the logic works if you were using N=5 	 
//	     5%5==0, true, increment counter
//	     5%4==0, false,
//	     5%3==0, false,
//	     5%2==0, false
//	     5%1==0, true, increment counter
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    //Add prime number to String
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	      System.out.println("All prime numbers from 1 to " + n + " are ...");
	      System.out.println(primeNumbers);
	   }
	}
		
	
