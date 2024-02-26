/**
 * 
 */
package chapter_02;

/**
 * Author: Felipe da Rocha Ferreira
 * Email: felipe179971@hotmail.com
 * Date: 18/02/2024
 * Update: 
 * ----------------------------------------------------------------
 * 
 *  Compara inteiros utilizando instruções if, operadores relacionais 
 *  e operadores de igualdade.
 * 
*/

// Importando a classe Scanner do pacote java.util
import java.util.Scanner;

public class Comparison {// Start class Comparison
	
	public static void main(String[] args) {// Start método main
		
		try
		(
				// Input do usuário fica armazenado na variável varInput (que é do tipo Scanner)
				Scanner varInput = new Scanner(System.in);
		)
		{// Start tray
			
			// Definindo as variáveis que são do tipo inteiro
			int number1;
			int number2;
			
			// Mandando o usuário inserir os números
			System.out.print("Primeiro número: "); //Sysout + CTRL + scape
			number1 = varInput.nextInt();
			
			System.out.print("Segundo número: ");
			number2 = varInput.nextInt(); 
			
			/*
			 *  O código vai aplicar todo os ifs em que for verdadeiro
			 *  não preciso colocar {} quando tenho só uma instrução
			 *  para mais de uma instrução, colocar {}
			*/
			if(number1 == number2)
				System.out.printf("%d == %d%n",number1, number2);
			
			if(number1 != number2)
				System.out.printf("%d != %d%n",number1, number2);
			
			if(number1 > number2)
				System.out.printf("%d > %d%n",number1, number2);		
			
			if(number1 < number2)
				System.out.printf("%d < %d%n",number1, number2);
			
			if(number1 >= number2)
				System.out.printf("%d >= %d%n",number1, number2);
			
			if(number1 <= number2)
				System.out.printf("%d <= %d%n",number1, number2);
			
		}// End tray

	}// End método main

}// End class Comparison
