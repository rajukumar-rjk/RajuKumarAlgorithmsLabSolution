package com.greatlearning.transactions_q1;
import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {

		// initiating scanner object	
		Scanner sc = new Scanner(System.in);

		// creating transaction array.
		System.out.println("Enter the size of transaction array");
		int transactionCount = sc.nextInt(); 		
		int[] arr = new int [transactionCount];

		// getting values for each transaction
		System.out.println("Enter the values of transactions.");
		for(int i=1; i<= arr.length; i++) {
			System.out.println("Enter value for transaction number "+ i+": ");
			arr[i-1] = sc.nextInt();
		}

		int m = 0, tar = 0 ;
		System.out.println("Enter the total no of targets that needs to be achieved ");
		
		// calculation the transactions as per the given target
		m = sc.nextInt();
		for (int i =0 ; i<m;i++) {
			System.out.println("Enter the value of target :- ");
			tar = sc.nextInt();				
		    int sum = 0 ;

		    for (int k = 0; k < arr.length && tar > sum ; k++ ) {
				sum = arr[k] + sum	;
				if(sum >= tar ){				            	 
					System.out.println("Target achieved after " + (k+1) +" transactions");
					break;			            		 			         			            	 
				}
			             			             
	    	} 
		    
	        if (sum < tar) {	        	
	        	System.out.println("Given target is not achieved");
	        }
		          
		}
		sc.close();
	}
}
