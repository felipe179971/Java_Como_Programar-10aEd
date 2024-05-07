/**
 * 
 */
package chapter_02;

/**
 * Author: Felipe da Rocha Ferreira
 * Email: felipe179971@hotmail.com
 * Date: 09/03/2024
 * Update: 
 * ----------------------------------------------------------------
 * 
 * 2.8 Escreva instruç es Java que realizem cada uma das seguintes tarefas:
 * a) Exibir a mensagem “Enter an integer: “, deixando o cursor na mesma linha.
 * b) Atribuir o produto de variáveis b e c para a variável a.
 * c) Utilizar um comentário para afirmar que um programa executa um c lculo de exemplo de folha de pagamento.
 * 
*/

//Importar a classe scanner do pacote java.util
import java.util.Scanner;

public class Exercicio2ponto8 {// Start: class Exercicio2ponto8

	public static void main(String[] args) {// Start: método main
			
		try(
				//Scanner vai ficar amarzenado na variável input
				Scanner input = new Scanner(System.in);
				
		)
		{// Start: try
			int a, b, c;
			
			//b e c são informados pelo usuário
			System.out.print("Enter an integer: ");
			b = input.nextInt();
			
			System.out.print("Enter an integer: ");
			c = input.nextInt();
			
			//a é o produto dos dois
			a = b * c;
			
			// printando o resultado
			System.out.printf("a = b * c = %d",a);
			
		}// End: try
		
	}// End: método main

}// End: class Exercicio2ponto8
