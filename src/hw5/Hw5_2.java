package hw5;

import java.util.Random;

public class Hw5_2 {
	public static void main(String[] args) {
//		2. 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
		randAvg();
	}

	public static void randAvg() {
		Random r = new Random();
		int[] randomNumber = new int[10];
		int sum = 0;
		System.out.println("隨機10個數字");

		for (int i = 0; i < 10; i++) {
			randomNumber[i] = r.nextInt(101);
			sum += randomNumber[i];
			System.out.println(randomNumber[i]);
		}
		double a = (double) sum / 10;
		System.out.println("總和平均"+a);
	}
}
