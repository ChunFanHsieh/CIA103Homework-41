package hw1;

public class hw2 {

	public static void main(String[] args) {

		// • 一:使用for迴圈 + while迴圈
		int i;
		for (i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {

				System.out.print(i + "*" + j + "=" + i * j + "\t");

				j++;

			}
			System.out.println();

		}
		System.out.println("---------------------------------------------");

		// • 二:使用for迴圈 + do while迴圈
		int ii;
		for (ii = 1; ii <= 9; ii++) {

			int jj = 1;
			do {

				System.out.print(ii + "*" + jj + "=" + ii * jj + "\t");

				jj++;
			}

			while (jj <= 9);
			System.out.println();

		}
		System.out.println("---------------------------------------------");

		// • 三:使用while迴圈 + do while迴圈
		int iii = 0;
		while (iii < 9) {
			iii++;
			int jjj = 1;
			do {
				System.out.print(iii + "*" + jjj + "=" + iii * jjj + "\t");
				jjj++;

			} while (jjj <= 9);

			System.out.println();
		}

		System.out.println("-------------------------------------------------");

		// 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int a;
		int sum = 0;
		for (a = 1; a <= 1000; a++) {
			if (a % 2 == 0) {
				sum += a;
			}

		}
		System.out.println(sum);
		System.out.println("-------------------------------------------------");

		// • 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int b;
		int sum2 = 1;
		for (b = 1; b <= 10; b++) {
			sum2 *= b;

		}
		System.out.println(sum2);

		// • 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int c = 1;
		int sum3 = 1;
		while (c <= 10) {
			sum3 *= c;
			c++;
		}
		System.out.println(sum3);
		System.out.println("-------------------------------------------------");

		/*
		 * • 請設計一隻Java程式,輸出結果為以下: 1 4 9 16 25 36 49 64 81 100
		 */
		int d;
		int sum4 = 0;
		for (d = 1; d <= (100-81); d++) {
			if (d % 2 == 1) {
				sum4 += d;
				System.out.print(sum4);
				System.out.print(" ");
			}

		}
		System.out.println();
		System.out.println("-------------------------------------------------");

		/*
		 * 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式, 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		 */
		int L;
		int sum5 = 0;
		for (L = 1; L <= 49; L++) {
			if (L % 10 == 4 || L / 10 == 4) {

			}

			else {
				System.out.print(L);

				sum5++;
				System.out.print(" ");

			}

		}
		System.out.println();
		System.out.println(sum5);
		System.out.println("---------------------------------------------");
		/*
		 * • 請設計一隻Java程式,輸出結果為以下: 
		 * 1 2 3 4 5 6 7 8 9 10 
		 * 1 2 3 4 5 6 7 8 9 
		 * 1 2 3 4 5 6 7 8
		 * 1 2 3 4 5 6 7 
		 * 1 2 3 4 5 6 
		 * 1 2 3 4 5 
		 * 1 2 3 4 
		 * 1 2 3 
		 * 1 2 
		 * 1
		 */
		int n, m;
		for (n = 10; n >= 1; n--) {
			for (m = 1; m <= n; m++) {
				System.out.print(m);
				System.out.print(" ");

			}
			System.out.println(" ");
		}
		System.out.println("-------------------------------------------------");

		/*
		 * 請設計一隻Java程式,輸出結果為以下: 
		 * A 
		 * BB 
		 * CCC 
		 * DDDD 
		 * EEEEE 
		 * FFFFFF
		 */
		int p, o;
		for (p = 1; p <= 6; p++) {
			for (o = 1; o <= p; o++) {
				int v = p + 64;
				char v2;
				v2 = (char) v;
				System.out.print(v2);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
