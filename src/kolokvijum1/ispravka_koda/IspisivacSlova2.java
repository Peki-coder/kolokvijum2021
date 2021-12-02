package kolokvijum1.ispravka_koda;

import java.util.Iterator;

public class IspisivacSlova2 {

	public static void ispisiM() {
		for (int i = 0; i <  4; i++) {
			for (int j = 1; j <= 7; j++) {
				if (j == 1 || j == 7 || j == i+1 || j + i == 7) System.out.print('O');
				else System.out.print(' ');
			}
			System.out.println();
		}	
		System.out.println();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				if(j == 0 || j == 6 || j == i ||  j == 6-i)System.out.print("O");
				else System.out.print(" ");
			}System.out.println();
		}
		
		}
	}

