package br.com.decisao;

public class ControleLoopWhile {
	
	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		int [] numbers = {10, 20, 30, 40, 50};
		int x = 0;
		while(x < numbers.length) {
			System.out.print(numbers[x]);
			System.out.print(", ");
			x++;
		}
		
		System.out.println("\n");
		
		String [] names = {"James", "Larry", "Tom", "Lacy"};
		int y = 0;
		while(y < names.length) {
			System.out.print(names[y]);
			System.out.print(" - ");
			y++;
		}
	}

}
