package com.greatlearning.currency_denomination_q2;

import com.greatlearning.service.MergeSortImplementation;
import com.greatlearning.service.NotesCount;
import java.util.Scanner;

public class Driver {

	public static void main(String args[]) {
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();

		System.out.println("enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		
		for (int i = 0; i < size; i++) {
			System.out.println(notes[i]);
		}
		
		notesCount.notesCountImplementation(notes, amount);
		sc.close();
	}
}
