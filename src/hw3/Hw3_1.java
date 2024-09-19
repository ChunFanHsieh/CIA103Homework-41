package hw3;

import java.util.Scanner;

public class Hw3_1 {
	/*
	 * 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰 三角形、其它三角形或不是三角形,如圖示結果:
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double[] side = new double[3];

		System.out.println("enter three numbers");

		for (int i = 0; i < side.length; i++) {
			System.out.println("輸入第" + (i + 1) + "個數字");
			side[i] = sc.nextDouble();
		}
		if (side[0] + side[1] > side[2] && side[0] + side[2] > side[1] && side[1] + side[2] > side[0]) {
			if (side[0] == side[1] && side[1] == side[2]) {
				System.out.println("正三角形");
			} else if (side[0] == side[1] || side[1] == side[2] || side[2] == side[0]) {
				System.out.println("等腰三角形");
			} else if (Math.pow(side[0], 2) + Math.pow(side[1], 2) == Math.pow(side[2], 2)
					|| Math.pow(side[1], 2) + Math.pow(side[2], 2) == Math.pow(side[0], 2)
					|| Math.pow(side[0], 2) + Math.pow(side[2], 2) == Math.pow(side[1], 2)) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}

		System.out.println("----------------------------------");

//	請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息
		int ii;
		ii = (int) (Math.random() * 10);

		System.out.println("guess a number");

		while (true) {
			int a = sc.nextInt();

			if (a == ii) {
				System.out.println("right answer");
				break;

			} else {
				System.out.println("wrong answer");
				continue;
			}
		}
		sc.close();

	}

}
