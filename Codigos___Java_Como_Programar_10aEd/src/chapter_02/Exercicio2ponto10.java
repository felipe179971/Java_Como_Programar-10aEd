package chapter_02;

/**
 * Author: Felipe da Rocha Ferreira
 * Email: felipe179971@hotmail.com
 * Date: 13/03/2024
 * Update: 
 * ----------------------------------------------------------------
 * 
 * 2.10 Supondo que x = 2 e y = 3, o que cada uma das instruç es a seguir exibe?
 * a) System.out.printf(“x = %d%n”, x);
 * b) System.out.printf(“Value of %d + %d is %d%n”, x, x, (x + x));
 * c) System.out.printf(“x =”);
 * d) System.out.printf(“%d = %d%n”, (x + y), (y + x));
*/

// Importando classe Scanner do pacote java.util
import java.util.Scanner;

public class Exercicio2ponto10 { // Start: class Exercicio2ponto10
	
	public static void main(String[] args) {// Start: método main

	
	try(
			// o que o usuário digitar ficará armazenado na variável input
			Scanner input = new Scanner(System.in);
	)
	{// Start: try
		//Definindo o tipo das variáveis 
		int x, y;
		
		//usuário digita e armazeno nas variáveis
		System.out.print("Digite o valor de x: ");
		x = input.nextInt();
		
		System.out.print("Digite o valor de y: ");
		y = input.nextInt();
		
		//Printando as questões
		System.out.printf("a) x = %d%n", x);
		System.out.printf("b) value of %d + %d is %d%n", x, x, (x+x) );
		System.out.printf("c) x = ");
		System.out.printf("d) %d = %d%n", (x+x), (x+y));
		
		
		
	}// End: try
	
	}// End: método main


} // End: class Exercicio2ponto10
