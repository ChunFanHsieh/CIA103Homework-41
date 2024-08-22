package hw1;

public class hw1 {

	public static void main(String[] args) {
// 1. 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12;
		int b = 6;
		int sum = a + b;
		System.out.println("和=" + (sum));
		System.out.println("積=" + (a * b));
// 2. 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int dozen = 12;
		int totaleggs = 200;

		System.out.println("打=" + (totaleggs / dozen));
		System.out.println("顆=" + (totaleggs % dozen));
// 3. 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int totalsec = 256559, hours = 24, min = 60, sec = 60;
		int daysec = hours * min * sec, hoursec = min * sec;
		int hourleft = totalsec % daysec, minleft = hourleft % hoursec, secleft = minleft % min;
		System.out.println(
				(totalsec / daysec) + "天" + (hourleft / hoursec) + "時" + (minleft / min) + "分" + (secleft) + "秒");

// 4. 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int r = 5;
		double m = PI * r * r;
		double L = (r + r) * PI;
		System.out.println("圓面積=" + (m));
		System.out.println("圓周長=" + (L));
		/*
		 * 5. 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本 金加利息共有多少錢
		 * (用複利計算,公式請自行google)
		 */

		int money = 1_500_000;
		double rate = 0.02;
		double saving = money * (1 + rate);
		for (int y = 1; y <= 10; y++) {
			saving *= (1 + rate);
		}
		System.out.println("共有" + (int) saving + "元");
		/*
		 * 請寫一隻程式,利用System.out.println()印出以下三個運算式結果: 5 + 5 5 + ‘5’ 5 + “5”
		 * 並請用註解各別說明答案的產生原因
		 */

		System.out.println("06.請寫一隻程式,利用System.out.println()印出以下三個運算式並說明產生原因");

		System.out.println(5 + 5);
		// 此為預設整數型別int數值5+型別int數值5，所得為十進位之和int數值10
		System.out.println(5 + '5');
		// 此為預設整數型別int數值5+型別char5，依Unicode編碼char5代表十六進位值為0x35，換算十進位數值為型別int數值53，所得十進位之和int數值58
		System.out.println(5 + "5");
		// 此為預設整數型別int數值5+型別String字串5，整數與字串相加為串接相連，所得為String字串55

	}

}
