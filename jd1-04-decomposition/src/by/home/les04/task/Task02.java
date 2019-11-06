package by.home.les04.task;

public class Task02 {

	public static void main(String[] args) {

		/*
		 * 2. Написать метод(методы) для нахождения наибольшего общего делителя и
		 * наименьшего общего кратного двух натуральных чисел
		 */

		int a = rand();
		int b = rand();
		int nod = findNOD(a, b);
		int nok = findNOK(nod, a, b);

		print("Число 1: ", a);
		print("Число 2: ", b);
		print("НОД: ", nod);
		print("НОК: ", nok);
		
	}

	public static int rand() {
		int a = (int) (Math.random() * 100 + 1);
		return a;
	}

	public static int findNOD(int a, int b) {
		int max = 1;

		if (a > b) {
			for (int i = 1; i <= b; i++) {
				if (a % i == 0 & b % i == 0) {
					max = i;
				}
			}
		} else {
			for (int i = 1; i <= a; i++) {
				if (a % i == 0 & b % i == 0) {
					max = i;
				}
			}
		}

		return max;
	}

	public static int findNOK(int nod, int a, int b) {
		int min = a * b / nod;
		return min;
	}
	
	public static void print(String name, int a) {
		System.out.println(name + a);
	}

}
