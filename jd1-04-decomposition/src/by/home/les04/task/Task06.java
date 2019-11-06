package by.home.les04.task;

public class Task06 {

	public static void main(String[] args) {

		/*
		 * 6. Вычислить площадь правильного шестиугольника со стороной а, используя
		 * метод вычисления площади треугольника.
		 */

		double a = rand();
		double Str = areaOfTr(a);
		double Shex = areaOfHex(Str);

		printDouble("Сторона шестиугольника: ", a);
		printDouble("Площадь треугольника: ", Str);
		printDouble("Площадь шестиугольника: ", Shex);
	}

	public static double rand() {
		int a = (int) (Math.random() * 10 + 1);
		return a;
	}

	public static double areaOfTr(double a) {
		double h = Math.sqrt(Math.pow(a, 2) - Math.pow((a / 2), 2));
		double S = 0.5 * a * h;
		return S;
	}

	public static double areaOfHex(double a) {
		double S = 6 * a;
		return S;
	}

	public static void printDouble(String name, double a) {
		System.out.println(name + a);
	}

}
