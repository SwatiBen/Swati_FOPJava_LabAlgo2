package Problem_2.CurrencyDenominations;

public class SelectionSort {

	public void mySort(int[] numCurArray) {
		
		int temp; 
		
		for(int i = 0; i < numCurArray.length; i++) {
			
			for(int j = i+1; j < numCurArray.length; j++) {
				
				if(numCurArray[i] < numCurArray[j]) {
					temp = numCurArray[i];
					numCurArray[i] = numCurArray[j];
					numCurArray[j] = temp;				
				}
			}
		}
	}
}
