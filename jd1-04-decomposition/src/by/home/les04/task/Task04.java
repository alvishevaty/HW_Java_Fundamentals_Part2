package by.home.les04.task;

public class Task04 {

	public static void main(String[] args) {

		/*
		 * 4. Написать метод(методы) для нахождения наименьшего общего кратного трех
		 * натуральных чисел.
		 */

		int a = rand();
		int b = rand();
		int c = rand();

		int nod = findNod(a, b, c);
		int nok = findNok(nod, a, b, c);
		
		print("Число 1: ", a);
		print("Число 2: ", b);
		print("Число 3: ", c);
		print("НОД: ", nod);
		print("НОК: ", nok);

	}

	public static int rand() {
		int a = (int) (Math.random() * 100 + 1);
		return a;
	}

	public static int findNod(int a, int b, int c) {
		int max = 1;

		if (a < b & a < c) {
			for (int i = 1; i <= a; i++) {
				if (a % i == 0 & b % i == 0 & c % i == 0) {
					max = i;
				}
			}
		} else if (b < a & b < c) {
			for (int i = 1; i <= b; i++) {
				if (a % i == 0 & b % i == 0 & c % i == 0) {
					max = i;
				}
			}
		} else if (c < a & c < b) {
			for (int i = 1; i <= c; i++) {
				if (a % i == 0 & b % i == 0 & c % i == 0) {
					max = i;
				}
			}
		}

		return max;
	}

	public static int findNok(int nod, int a, int b, int c) {
		int nok = (a * b * c) / nod;
		return nok;
	}
	
	public static void print(String name, int a) {
		System.out.println(name + a);
	}

}
