package hw4;

import java.util.Scanner;

public class Hw4_4 {
	public static void main(String[] args) {

//	請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」

		Scanner sc = new Scanner(System.in);

		// 歷年的天數 (非閏年)
		int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 輸入年份
		System.out.print("請輸入年份 (yyyy): ");
		int year = sc.nextInt();

		// 輸入月份，並檢查是否正確
		int month = 0;
		while (true) {
			System.out.print("請輸入月份 (mm): ");
			month = sc.nextInt();
			if (month < 1 || month > 12) {
				System.out.println("月份不正確，請重新輸入。");
			} else {
				break;
			}
		}

		// 判斷是否為閏年
		if (isLeapYear(year)) {
			daysInMonths[1] = 29; // 閏年2月有29天
		}

		// 輸入日期，並檢查是否正確
		int day = 0;
		while (true) {
			System.out.print("請輸入日期 (dd): ");
			day = sc.nextInt();
			if (day < 1 || day > daysInMonths[month - 1]) {
				System.out.println("日期不正確，請重新輸入。");
			} else {
				break;
			}
		}

		// 計算該日期是當年的第幾天
		int dayOfYear = 0;
		for (int i = 0; i < month - 1; i++) {
			dayOfYear += daysInMonths[i];
		}
		dayOfYear += day;

		// 輸出結果
		System.out.println("輸入的日期為該年第 " + dayOfYear + " 天。");

		// 關閉掃描器
		sc.close();
	}

// 判斷是否為閏年
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

	}
}
