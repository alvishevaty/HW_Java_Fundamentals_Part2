package by.home.les04.task;

public class Task05 {

	public static void main(String[] args) {

		/*
		 * 5. Написать метод(методы) для нахождения суммы большего и меньшего из трех
		 * чисел.
		 */

		int a = rand();
		int b = rand();
		int c = rand();

		int min = findMin(a, b, c);
		int max = findMax(a, b, c);
		int sum = findSum(min, max);

		print("Число 1: ", a);
		print("Число 2: ", b);
		print("Число 3: ", c);
		print("MIN: ", min);
		print("MAX: ", max);
		print("Сумма min и max: ", sum);
	}

	public static int rand() {
		int a = (int) (Math.random() * 100 + 1);
		return a;
	}

	public static int findMin(int a, int b, int c) {
		int min = 0;

		if (a < b) {
			if (a < c) {
				min = a;
			} else {
				min = c;
			}
		} else {
			if (b < c) {
				min = b;
			} else {
				min = c;
			}
		}
		return min;
	}

	public static int findMax(int a, int b, int c) {
		int max = 0;

		if (a > b) {
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		return max;
	}

	public static int findSum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void print(String name, int a) {
		System.out.println(name + a);
	}

}
