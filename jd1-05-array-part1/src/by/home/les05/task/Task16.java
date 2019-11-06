package by.home.les05.task;

public class Task16 {

	public static void main(String[] args) {

		/*
		 * 16. Даны действительные числа n (a1 ,a2 ,... ,an) . Найти max
		 */

		double[] mas1 = array(randLen());
		double[] mas2 = newArray(mas1);
		double max = findMax(mas2);

		PrintArray.printDouble(mas1);
		PrintArray.printDouble(mas2);

		System.out.println("Максимальное число: " + max);

	}

	public static int randLen() {

		int a = (int) (Math.random() * 10 + 1);
		return a;

	}

	public static double randNum() {

		double a = Math.random() * 100 + 1;
		return a;

	}

	public static double[] array(int a) {

		double[] mas = new double[a];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = randNum();
		}
		return mas;
	}

	public static double[] newArray(double[] a) {

		double[] mas = new double[a.length];
		int j = a.length - 1;
		int k = 0;

		for (int i = 0; i < mas.length; i++) {
			mas[k] = a[i] + a[j];
			j--;
			k++;
		}
		return mas;
	}

	public static double findMax(double[] a) {
		double b = a[0];
		for (int i = 0; i < a.length; i++) {
			if (b < a[i]) {
				b = a[i];
			}
		}
		return b;
	}

}
