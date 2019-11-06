package by.home.les04.task;

public class Task17 {

	public static void main(String[] args) {
		
		/*
		 * 17. Натуральное число, в записи которого n цифр, называется числом
		 * Армстронга, если сумма его цифр, возведенных в степень n, равна самому числу.
		 * Найти все числа Армстронга от 1 до k. Для решения задачи использовать
		 * декомпозицию.
		 */
		
		int k = 1000000000;
		armstrong(k);
		
	}
	
	public static int length(int l) {
		int j = 0;
		for(;l > 0; l = l / 10) {
			j++;
		}	
		return j;
	}
	
	public static int sum(int l) {
		int sum = 0;
		int h = length(l);
		for(;l > 0; l = l / 10) {
			int a = l % 10;
			a = (int)Math.pow(a, h);
			sum = sum + a;
		}	
		return sum;
	}
	
	public static void armstrong(int k) {
		for(int i = 1; i <= k; i++) {
			if(sum(i) == i) {
				System.out.println(i);
			}
		}
	}

}
