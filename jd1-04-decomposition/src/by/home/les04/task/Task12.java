package by.home.les04.task;

public class Task12 {

	public static void main(String[] args) {

		/*
		 * 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать
		 * метод(методы) вычисления его площади, если угол между сторонами длиной X и Y—
		 * прямой.
		 */

		int X = rand();
		int Y = rand();
		int Z = rand();
		int T = rand();

		double A = pifagorTheorem(X, Y);
		double S1 = areaOfTriangleWithHight(X, Y);
		double S2 = areaOfTriangleWithHalfPerim(A, Z, T);
		double S = areaOfQuadrangle(S1, S2);

		printInt("Сторона X: ", X);
		printInt("Сторона Y: ", Y);
		printInt("Сторона Z: ", Z);
		printInt("Сторона T: ", T);

		printDouble("Площадь прямоугольного треугольника: ", S1);
		printDouble("Площадь произвольного треугольника: ", S2);
		printDouble("Площадь четырехугольника: ", S);
	}

	public static int rand() {
		int a = (int) (Math.random() * 10 + 1);
		return a;
	}

	public static double pifagorTheorem(int a, int b) {
		double c = Math.sqrt(a * a + b * b);
		return c;
	}

	public static double areaOfTriangleWithHight(int a, int b) {
		double S = 0.5 * a * b;
		return S;
	}

	public static double areaOfTriangleWithHalfPerim(double a, int b, int c) {
		double p = (a + b + c) / 2;
		double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return S;
	}

	public static double areaOfQuadrangle(double a, double b) {
		double S = a + b;
		return S;
	}

	public static void printInt(String n, int a) {
		System.out.println(n + a);
	}

	public static void printDouble(String n, double a) {
		System.out.println(n + a);
	}
}
