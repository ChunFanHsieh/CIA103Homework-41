package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter value for x");
			int x = sc.nextInt();
			System.out.println("enter value for y");
			int y = sc.nextInt();
			System.out.println("result for x^y" );
			int result = Calculator.powerXY(x, y);
			System.out.println(result);
		} catch (CalException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("error");
		} finally {
			sc.close();
		}
	}

}
