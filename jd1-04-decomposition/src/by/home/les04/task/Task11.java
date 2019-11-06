package by.home.les04.task;

public class Task11 {

	public static void main(String[] args) {

		/*
		 * 11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] +
		 * D[4] + D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для
		 * вычисления суммы трех последовательно расположенных элементов массива с
		 * номерами от k до m.
		 */

		int n = 7;
		int[] D = mas(n);
		int sum1 = sum3(D, 1, 2, 3);
		int sum2 = sum2(D, 3, 4);
		int sum3 = sum3(D, 4, 5, 6);

		printMas(D);
		printInt("Сумма 2, 3 и 4 элементов: ", sum1);
		printInt("Сумма 4 и 5 элементов: ", sum2);
		printInt("Сумма 5, 6 и 7 элементов: ", sum3);
	}

	public static int[] mas(int n) {
		int[] mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
			int a = (int) (Math.random() * 100 + 1);
			mas[i] = a;
		}
		return mas;
	}

	public static int sum3(int[] mas, int a, int b, int c) {
		int sum = mas[a] + mas[b] + mas[c];
		return sum;
	}

	public static int sum2(int[] mas, int a, int b) {
		int sum = mas[a] + mas[b];
		return sum;
	}

	public static void printMas(int[] mas) {
		System.out.print("{");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println("}");
	}

	public static void printInt(String name, int a) {
		System.out.println(name + a);
	}
}
