package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class LottoNumberSelector {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number u dont want");
		int excludedNumber = sc.nextInt();
		if (excludedNumber < 1 || excludedNumber > 9) {
			System.out.println("number not within range");
			return;
		}
		int[] availableNumbers = getAvailableNumbers(excludedNumber);
		System.out.println("All the numbers u want" + Arrays.toString(availableNumbers));
		System.out.println("amount of numbers u want" + availableNumbers.length);
	
		sc.close();
	}
	
	private static int[] getAvailableNumbers(int excludedNumber) {
		int[] allNumbers = new int[49];
		for (int i = 0; i < allNumbers.length; i++) {
			allNumbers[i] = i + 1;
		}
		int[] temp = new int[49];
		int count = 0;
		for (int i = 0; i < allNumbers.length; i++) {
			if (allNumbers[i] % 10 != excludedNumber && allNumbers[i]/10 != excludedNumber) {
				temp[count++] = allNumbers[i];
			}
		} 
		int[] availableNumbers = new int[count];
		System.arraycopy(temp, 0, availableNumbers,0, count);
		return availableNumbers;
	}
}
