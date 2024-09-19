package hw5;

public class Hw5_3 {
//	3. 利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//	可以找出二維陣列的最大值並回傳
	public static int maxElement(int[][] x) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public static double maxElement(double[][] x) {
		double max = Double.NEGATIVE_INFINITY;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[][] intArray = { { 3, 4, 5 }, { 5, 88, 8 }, { 121, 222, 333 } };
		System.out.println("最大值是" + maxElement(intArray));

		double[][] doubleArray = { { 3.5, 4.5, 9.1 }, { 88.3, 99.22, 10.2555 }, { 83.2, 99.2, 100.3 } };
		System.out.println("浮點數最大值" + maxElement(doubleArray));

	}
}
