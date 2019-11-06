package by.home.les04.task;

public class Task18 {

	public static void main(String[] args) {

		/*
		 * 18. Найти все натуральные n-значные числа, цифры в которых образуют строго
		 * возрастающую последовательность (например, 1234, 5789). Для решения задачи
		 * использовать декомпозицию.
		 */

		int n = rand();

		System.out.println(n);

		hight(n);

	}

	public static int rand() {
		int N = (int) (Math.random() * 2 + 3);
		return N;
	}

	public static void hight(int n) {
		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
			int l = i;
			int m = n;
			int a = l % 10;
			for (; l > 0; l = l / 10) {
				int k = l % 10;
				if (a > k) {
					a = k;
					m--;
				}
				if (m == 1) {
					System.out.println(i);
				}
			}
		}
	}
}
