package Problem_1.PayMoneyTransactions;

import java.util.Scanner;

public class TargetAchieved {

	public void targetCheck(int numTargets, int[] valueOfArray) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= numTargets; i++) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			int flag = 0, sum = 0;

			for (int j = 0; j < valueOfArray.length; j++) {
				sum += valueOfArray[j];

				if (sum >= target) {
					flag = 1;
					System.out.println("Target Achieved after " + (j + 1) + " transactions\n");
					break;
				}
			}
			if (flag == 0) {
				System.err.println("Given target is not achieved");
			}
		}
		sc.close();
	}
}
