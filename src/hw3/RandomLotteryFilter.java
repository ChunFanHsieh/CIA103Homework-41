package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class RandomLotteryFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please pick a number you dont want from 1-9");

		while (true) {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			if (x <= 9 && x >= 1) {
				int j;
				int counter = 0;
				for (j = 1; j <= 49; j++) {
					if (j % 10 != x && j / 10 != x) {
						counter++;
						System.out.print(j + ",");
					} else {
						continue;
					}
				}
				System.out.println("一共選了" + counter + "個數字");

				System.out.println();

				int[] allnum = new int[counter];
				int i;
				int y = 0;
				for (i = 1; i <= 49; i++) {
					if (i % 10 != x && i / 10 != x && i != x) {
						allnum[y] = i;
						y++;
					} else {
						continue;
					}
				}
				System.out.println(Arrays.toString(allnum));
				System.out.println("一共選了" + counter + "個數字");

				// 進階: 電腦選出6個號碼

				int flag;
				int[] num = new int[6];
				int w = 0;

				while (w < 6) {
					flag = 0;
					int randomIndex = (int) (Math.random() * allnum.length);
					int randomElement = allnum[randomIndex];
					for (int k = 0; k < w; k++) {
						if (randomElement == num[k]) {
							flag = 1;
							break;
						}
					}
					if (flag == 0) {
						num[w] = randomElement;
						w++;
					}
				}

				System.out.println("電腦選出6個號碼是:");
				for (i = 0; i < 6; i++) {
					System.out.print(num[i] + " ");
				}

				break;
			} else {
				System.out.println("Entered wrong, please try again.");
				System.out.println("Please pick a number you dont want from 1-9");
			}
		}
	}

}
