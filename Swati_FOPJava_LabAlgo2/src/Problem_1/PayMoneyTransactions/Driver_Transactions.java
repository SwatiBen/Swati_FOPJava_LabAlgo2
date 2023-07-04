package Problem_1.PayMoneyTransactions;

import java.util.Scanner;


public class Driver_Transactions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array ");
		int transArray = sc.nextInt();
		
		System.out.println("Enter the values of array");
		int[] valueOfArray = new int[transArray];
		
		for (int i = 0; i < valueOfArray.length; i++) {
			valueOfArray[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total number of targets that needs to be achieved ");
		int numTargets = sc.nextInt();
		
		TargetAchieved objAchieved = new TargetAchieved();
		objAchieved.targetCheck(numTargets, valueOfArray);
		
		sc.close();
	}
	
}
