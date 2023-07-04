package Problem_2.CurrencyDenominations;

public class NotesToPay {

	public void noteCount(int[] numCurArray, int amountToPay) {
		
		int notes[] = new int[numCurArray.length];
		
		for (int i = 0; i < numCurArray.length; i++) {
			
			notes[i] = amountToPay / numCurArray[i];
			amountToPay %= numCurArray[i];
		}
		 System.out.println("Your payment approach in order to give min no of notes will be");

		for (int i = 0; i < notes.length; i++) {

			if(notes[i] != 0) {
				if(notes[i] != 0) {
					System.out.println(numCurArray[i] + ":" + notes[i]);
				}
			}
		}
	}

}
