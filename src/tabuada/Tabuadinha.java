package tabuada;

import java.util.Scanner;

public class Tabuadinha {

	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
		int multiplicando, numeroRepeticao = 9, contador = 0;
		
		System.out.print("Qual tabuada você deseja: ");
		multiplicando = leitor.nextInt();
		
		
		while (contador <= numeroRepeticao) {
			contador = contador + 1;
			
			System.out.println(multiplicando + " X " + contador + " = " + (contador * multiplicando)); 
		}
		
		leitor.close();
	}

}
