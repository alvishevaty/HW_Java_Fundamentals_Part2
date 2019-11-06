package by.home.les04.task;

public class Task14 {

	public static void main(String[] args) {

		/*
		 * 14. Написать метод(методы), определяющий, в каком из данных двух чисел больше
		 * цифр.
		 */

		int a = rand();
		int b = rand();

		int la = length(a);
		int lb = length(b);

		print(a);
		print(b);
		print(la);
		print(lb);

		compare(la, lb);

	}

	public static int rand() {
		int N = (int) (Math.random() * 90000000 + 100);
		return N;
	}

	public static int length(int N) {
		int i = 0;
		for (; N > 0; i++) {
			N = N / 10;
		}
		return i;
	}

	public static void compare(int a, int b) {
		if (a > b) {
			System.out.println("В первом числе цифр больше, чем во втором.");
		} else if (a < b) {
			System.out.println("Во втором числе цифр больше, чем в первом.");
		} else if (a == b) {
			System.out.println("Количество цифр в первом и втором числах одинаковое.");
		}
	}

	public static void print(int a) {
		System.out.println(a);
	}

}
