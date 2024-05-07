/**
 * 
 */
package chapter_02;

/**
 * Author: Felipe da Rocha Ferreira
 * Email: felipe179971@hotmail.com
 * Date: 03/03/2024
 * Update: 
 * ----------------------------------------------------------------
 * 
 *  2.6 Usando as instruções que você escreveu no Exerccio 2.5, elabore um 
 *  programa completo que calcule e imprima o produto de três inteiros.
 * 
*/

//Importando a classe Scanner do pacote java.util
import java.util.Scanner;

public class Exercicio2Ponto6 {// Start: class Exercicio2Ponto6

	public static void main(String[] args) {// Start: método main
		try(
				// Input do usuário fica armazenado na variável input
				Scanner input = new Scanner(System.in);
			)
		{// Start: try
			
			// Definir o tipo das variáveis como inteiros
			int x, y, z, result;
			
			// Usuário vai digitar os valores a serem atribuidos as variáveis
			System.out.print("Digite o primeiro inteiro: ");
			x = input.nextInt();
			
			System.out.print("Digite o segundo inteiro: ");
			y = input.nextInt();
			
			System.out.print("Digite o terceiro inteiro:");
			z = input.nextInt();
			
			//Calculando a multiplicação e atribuindo à variável
			result = x * y * z;
			
			//Printando o resultado
			System.out.printf("A multiplicação é %d%n", result);
					
		}// End: try
		
	}// End: método main

}// End: class Exercicio2Ponto6
