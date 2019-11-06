package by.home.les05.task;

public class Task04 {

	public static void main(String[] args) {

		/*
		 * 4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить,
		 * будет ли она возрастающей.
		 */

		int[] mas = { 0, 5, 7, 15, 48, 54, 106, 1177, 2020 };

		// int N = randLen();
		// int[] mas = array(N);

		PrintArray.print(mas);
		sequence(mas);
	}

	public static int randLen() {
		int a = (int) (Math.random() * 20 + 1);
		return a;
	}

	public static int randNum() {
		int a = (int) (Math.random() * 100 + 1);
		return a;
	}

	public static int[] array(int a) {
		int[] mas = new int[a];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = randNum();
		}
		return mas;
	}

	public static void sequence(int[] mas) {
		int m = 0;
		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i + 1] > mas[i]) {
				m++;
			}
		}
		if (m == mas.length - 1) {
			System.out.println("Последовательность чисел - возрастающая.");
		} else {
			System.out.println("Последовательность чисел - НЕ возрастающая");
		}
	}
}
