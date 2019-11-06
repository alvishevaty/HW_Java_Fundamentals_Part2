package by.home.les04.task;

public class Task07 {

	public static void main(String[] args) {

		/*
		 * 7. На плоскости заданы своими координатами n точек. Написать метод(методы),
		 * определяющие, между какими из пар точек самое большое расстояние. Указание.
		 * Координаты точек занести в массив.
		 */

		int n = rand();
		int[][] mas = massive(n);
		double[] masDist = masDist(mas, n);
		double min = findMin(masDist, masDist.length);

		System.out.println(n + "\n");

		print(mas, mas.length);
		
		System.out.println();
		
		printDist(masDist, masDist.length);
		
		System.out.println();
		System.out.println(min);
	}

	// Метод для нахождения количества точек
	public static int rand() {
		int a = (int) (Math.random() * 10 + 1);
		return a;
	}

	// Метод для нахождения координат
	public static int randCoord() {
		int a = (int) (Math.random() * 20 - 10);
		return a;
	}

	// Метод для заполнения массива координат
	public static int[][] massive(int n) {
		int[][] mas = new int[n][2];
		for (int i = 0; i < n; i++) {
			mas[i][0] = randCoord();
			// System.out.println("mas[" + i + "][0] = " + mas[i][0] + "");
		}

		for (int i = 0; i < n; i++) {
			mas[i][1] = randCoord();
			// System.out.println("mas[" + i + "][1] = " + mas[i][1] + "");
		}

		return mas;
	}

	public static int findXY(int a, int b) {
		int x = 0;
		if ((a >= 0 & b >= 0) || (a <= 0 & b <= 0)) {
			if (a >= b) {
				x = a - b;
			} else {
				x = b - a;
			}
		} else if ((a >= 0 & b <= 0) || (a <= 0 & b >= 0)) {
			x = Math.abs(a) + Math.abs(b);
		}
		return x;
	}

	public static double findDist(int x, int y) {
		double D = Math.sqrt(x * x + y * y);
		return D;
	}

	// Метод для нахождения расстояния между точками
	public static double[] masDist(int[][] mas, int n) {
		int X;
		int Y;
		double D;
		double[] mas1 = new double[n - 1];
		for (int i = 1; i < n; i++) {
			X = findXY(mas[0][0], mas[i][0]);
			Y = findXY(mas[0][1], mas[i][1]);
			D = findDist(X, Y);
			mas1[i - 1] = D;
		}
		return mas1;
	}

	public static double findMin(double[] mas, int n) {
		double min = mas[0];
		for (int i = 0; i < n; i++) {
			if (min > mas[i]) {
				min = mas[i];
			}
		}

		return min;
	}

	public static void print(int[][] mas, int n) {
		for (int i = 0, j = 0; i < n & j < n; i++, j++) {
			System.out.println("{" + mas[i][0] + ";" + mas[j][1] + "}");
		}
	}

	public static void printDist(double[] mas, int n) {
		System.out.print("{");
		for (int i = 0; i < n; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println("}");
	}
}
