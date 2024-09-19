package hw4;

import java.util.Scanner;

public class Hw4_3 {

	public static void main(String[] args) {
//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」

		int[] employeeIds = { 25, 32, 8, 19, 27 };
		int[] cashAmounts = { 2500, 800, 500, 1000, 1200 };

		// 創建 Scanner 對象來獲取用戶輸入
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入您想借的金額: ");
		int amountToBorrow = scanner.nextInt();

		// 初始化變量來儲存有錢可借的員工編號和總人數
		String employeesWithCash = "";
		int count = 0;

		// 遍歷員工現金數量，檢查哪些員工有足夠的錢
		for (int i = 0; i < cashAmounts.length; i++) {
			if (cashAmounts[i] >= amountToBorrow) {
				employeesWithCash += employeeIds[i] + " ";
				count++;

			}
		}

		// 輸出結果
		if (count > 0) {
			System.out.println("有錢可借的員工編號: " + employeesWithCash + "共 " + count + " 人!");
		} else {
			System.out.println("沒有員工有足夠的現金可借。");
		}

		// 關閉掃描器
		scanner.close();

	}

}
