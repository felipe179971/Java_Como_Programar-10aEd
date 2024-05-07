/**
 * 
 */
package chapter_02;

/**
 * Author: Felipe da Rocha Ferreira
 * Email: felipe179971@hotmail.com
 * Date: 13/03/2024
 * Update: 
 * ----------------------------------------------------------------
 * 
 * 2.14 Escreva um aplicativo que exiba os nmeros 1 a 4 na mesma linha, com cada par de adjacentes separados por um espaço. Use as seguintes t cnicas:
 * a) Uma instruç o System.out.println.
 * b) Quatro instruç es System.out.print.
 * c) Uma instruç o System.out.printf.
*/

public class Exercicio2Ponto14 {// Start: class Exercicio2Ponto14

	public static void main(String[] args) {// Start: método main
		//Definindo o tipo das variáveis
		int i;
		
		//Atribuindo valores as variáveis
		i = 1;
		
		while (i <= 4) {// Start: fazer de i=1 até 4
			
			System.out.print(i);
			
			if (i!=4) {// Start: se i<>4, coloco um espaço; Se i=4, printo tudo
				
				System.out.print(" ");
				
			}else{
				
				System.out.println();
				
			}// End: se i<>4, coloco um espaço; Se i=4, printo tudo
			
			i++;
			
		}// End: fazer de i=1 até 4

	}// End: método main

}// End: class Exercicio2Ponto14
