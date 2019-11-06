package by.home.les04.task;

public class Task03 {

	public static void main(String[] args) {

		/*
		 * 3. Написать метод(методы) для нахождения наибольшего общего делителя четырех
		 * натуральных чисел.
		 */

		int a = rand();
		int b = rand();
		int c = rand();
		int d = rand();
		int nod = findNOD(a, b, c, d);

		print("Число 1: ", a);
		print("Число 2: ", b);
		print("Число 3: ", c);
		print("Число 4: ", b);
		print("НОД: ", nod);

	}

	public static int rand() {
		int a = (int) (Math.random() * 100 + 1);
		return a;
	}

	public static int findNOD(int a, int b, int c, int d) {
		int max = 1;

		if (a < b & a < c & a < d) {
			for (int i = 1; i <= a; i++) {
				if (a % i == 0 & b % i == 0 & c % i == 0 & d % i == 0) {
					max = i;
				}
			}
		} else if (b < a & b < c & b < d) {
			for (int i = 1; i <= b; i++) {
				if (a % i == 0 & b % i == 0 & c % i == 0 & d % i == 0) {
					max = i;
				}
			}
		} else if (c < a & c < b & c < d) {
			for (int i = 1; i <= c; i++) {
				if (a % i == 0 & b % i == 0 & c % i == 0 & d % i == 0) {
					max = i;
				}
			}
		} else if (d < a & d < b & d < c) {
			for (int i = 1; i <= d; i++) {
				if (a % i == 0 & b % i == 0 & c % i == 0 & d % i == 0) {
					max = i;
				}
			}
		}
		return max;
	}
	
	public static void print(String name, int a) {
		System.out.println(name + a);
	}

}
