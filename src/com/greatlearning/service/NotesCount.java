package com.greatlearning.service;

public class NotesCount {

	public void notesCountImplementation(int[] arr, int amt) {
		int notecount ;
		int NoteCountArry[] = new int[arr.length];
		
		for (int i =0 ; i< arr.length  ;i++) {						
				notecount = 0;
				notecount = amt/arr[i];
				NoteCountArry[i] = notecount;
				amt = amt%arr[i];							
		}
		
		
		if (amt == 0) {		
			System.out.println("Your payment approach in order to give min no of notes will be ");
			for (int i = 0 ; i<arr.length ;i++) {				
				if( NoteCountArry[i] > 0) {					
					System.out.println( arr[i] + " : " + NoteCountArry[i] );					
				}       					
		    }
		}
				
		else {
			System.out.println("Not Possible to do payment as you don't have currency denominations to pay Rs " + amt );
			
		}
		
	}
}


