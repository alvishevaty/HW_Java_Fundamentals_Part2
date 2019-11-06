package by.home.les04.task;

public class Task10 {

	public static void main(String[] args) {

		/*
		 * 10. Написать метод(методы) для вычисления суммы факториалов всех нечетных
		 * чисел от 1 до 9.
		 */
		
		long sum = sum();
		System.out.println("Сумма факториалов: " + sum);
	}
	
	public static long sum() {
		int number;
		long fact;
		long sum = 0;
		for(int i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				number = i;
				System.out.print(number + " ");
				fact = factor(number);
				System.out.println(fact + " ");
				sum = sum + fact;
			}
		}
		return sum;
	}
	
	public static long factor(int a) {
		long y = 1;
		for(int i = 1; i <= a; i++) {
			y = y * i;
		}
		return y;
	}
}
