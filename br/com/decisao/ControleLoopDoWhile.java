package br.com.decisao;

public class ControleLoopDoWhile {
	
	public static void main(String[] args) {
		
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
		
		System.out.println("------");
		
		int [] numbers = {10, 20, 30, 40, 50};
		int x = 0;
		
		do {
			System.out.println(numbers[x]);
			x++;
		} while (x < numbers.length);
	}

}
