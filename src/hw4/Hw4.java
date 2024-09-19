package hw4;

public class Hw4 {
//	1. 有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	public static void main(String[] args) {
		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double average = sum / array.length;
		System.out.println("平均" + average);
		for (int i = 0; i < array.length; i++) {
			if (array[i] > average) {
				System.out.println("大於平均的元素" + array[i] + " ");
			}
		}

//	2. 請建立一個字串,經過程式執行後,輸入結果是反過來的 例如String s = “Hello World”,執行結果即為dlroW olleH
		String s = "Hello World";
		StringBuilder a = new StringBuilder(s);
		a.reverse();
		System.out.println(a.toString());

//		有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int vowelCount = 0;
		for (int i = 0; i < planets.length; i++) {
			String planet = planets[i];
			for (int j = 0; j < planet.length(); j++) {
				char ch = planet.charAt(j);
				if (isVowel(ch)) {
					vowelCount++;
				}
			}

		}
		System.out.println(vowelCount);
	}

	public static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';

	}


}
