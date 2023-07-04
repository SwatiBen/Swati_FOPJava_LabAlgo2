package Problem_2.CurrencyDenominations;

import java.util.Scanner;

public class Driver_Notes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);   
		System.out.println("Enter the size of currency denominations");
		int numOfCurrency = sc.nextInt();
		
		int[] numCurArray = new int[numOfCurrency];
		System.out.println("Enter the currency denomination value");
		
		for (int i = 0; i < numCurArray.length; i++) {
			numCurArray[i] = sc.nextInt();
		}
		
		
//		Sorting in descending order using Selection sort
		SelectionSort objSelectionSort = new SelectionSort();
		objSelectionSort.mySort(numCurArray);

		System.out.println("Enter the amount you want to pay");
		int amountToPay = sc.nextInt();
		
		NotesToPay objNotesToPay = new NotesToPay();
		objNotesToPay.noteCount(numCurArray, amountToPay);
		
		sc.close();

	}
	
}
