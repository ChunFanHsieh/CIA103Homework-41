package hw5;

import java.util.Scanner;

public class Hw5 {
	public static void main(String[] args) {
//		1. 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入寬:");
		int width = sc.nextInt();
		System.out.println("輸入長:");
		int height = sc.nextInt();
		
		starSquare(width, height);
		sc.close();
		
	}
	public static void starSquare(int width, int height) {
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	
	

}
