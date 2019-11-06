package by.home.les05.task;

public class PrintArray {

	public static void print(int[] mas) {

		System.out.print("{");

		for (int i = 0; i < mas.length - 1; i++) {
			System.out.print(mas[i] + "; ");
		}

		System.out.println(mas[mas.length - 1] + "}");
	}

	public static void printDouble(double[] mas) {

		System.out.print("{");

		for (int i = 0; i < mas.length - 1; i++) {
			System.out.print(mas[i] + "; ");
		}

		System.out.println(mas[mas.length - 1] + "}");
	}
}
