package by.home.les04.task;

public class Task09 {

	public static void main(String[] args) {

		/*
		 * 9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно
		 * простыми.
		 */

		int a = rand();
		int b = rand();
		int c = rand();
		int nod = findNod(a, b, c);
		boolean d = decision(nod);

		System.out.println("a = " + a + "; b = " + b + "; c = " + c);
		System.out.println(nod);
		System.out.println(d);

	}

	public static int rand() {
		int a = (int) (Math.random() * 100 + 1);
		return a;
	}

	public static int findNod(int a, int b, int c) {
		int nod = 0;
		if (a < b && a < c) {
			for (int i = 1; i < a; i++) {
				if (a % i == 0 & b % i == 0 & c % i == 0) {
					nod = i;
				}
			}
		} else if (b < a && b < c) {
			for (int i = 1; i < b; i++) {
				if (a % i == 0 & b % i == 0 & c % i == 0) {
					nod = i;
				}
			}
		} else if (c < a && c < b) {
			for (int i = 1; i < c; i++) {
				if (a % i == 0 & b % i == 0 & c % i == 0) {
					nod = i;
				}
			}
		}
		return nod;
	}

	public static boolean decision(int nod) {
		boolean b = (nod == 1);
		return b;
	}

}
