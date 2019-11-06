package by.home.les04.task;

public class Task01 {

	public static void main(String[] args) {

		/*
		 * 1. Треугольник задан координатами своих вершин. Написать метод для вычисления
		 * его площади.
		 */
		int x1 = rand();
		int y1 = rand();
		int x2 = rand();
		int y2 = rand();
		int x3 = rand();
		int y3 = rand();

		double a = leng(x1, x2, y1, y2);
		double b = leng(x2, x3, y2, y3);
		double c = leng(x3, x1, y3, y1);

		double p = halfPer(a, b, c);

		double S = area(p, a, b, c);

		printCoord(x1, y1);
		printCoord(x2, y2);
		printCoord(x3, y3);
		
		System.out.println(a + ", " + b + ", " + c);
		System.out.println(S);

	}

	public static int rand() {
		int a = (int) (Math.random() * 20 - 10);
		return a;
	}

	public static double leng(int a, int b, int c, int d) {
		int f = 0;
		int g = 0;
		double h = 0;

		if ((a > 0 & b > 0) || (a < 0 & b < 0)) {
			if (a > b) {
				f = a - b;
			} else if (a < b) {
				f = b - a;
			}
		} else if ((a > 0 & b < 0) || (a < 0 & b > 0)) {
			f = Math.abs(a) + Math.abs(b);
		} else {
			f = 0;
		}

		if ((c > 0 & d > 0) || (c < 0 & d < 0)) {
			if (c > d) {
				g = c - d;
			} else if (c < d) {
				g = d - c;
			}
		} else if ((c > 0 & d < 0) || (c < 0 & d > 0)) {
			g = Math.abs(c) + Math.abs(d);
		} else {
			g = 0;
		}

		h = Math.sqrt(Math.pow(f, 2) + Math.pow(g, 2));

		return h;
	}

	public static double halfPer(double a, double b, double c) {
		double p = (a + b + c) / 2;
		return p;
	}

	public static double area(double p, double a, double b, double c) {
		double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return S;
	}
	
	public static void printCoord(int x, int y) {
		System.out.println("(" + x + "," + y + ")");
	}

}
