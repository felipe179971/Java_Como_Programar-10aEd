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
 * Programa de adição que insere dois números, então exibe a soma deles.
 * 
*/

/*
 *  Importando Java API (Java Application Programming Interface)
 *  Digo que irei usar a classe Scanner predefinida do pacote chamado java.util
*/
import java.util.Scanner;

public class Addition 
{// Start class Addition
	public static void main(String[] args) 
	{// Start método main
		try 
		(
				/*
				 *  Criar um Scanner para obter entrada a partir da janela de comando
				 *  instrução de declaração de variável que especifica o tipo (Scanner) e o nome (var_input)
				 *  palavra-chave new para criar um objeto Scanner que lê caracteres digitados pelo usuário no teclado
				 *  objeto de entrada padrão, System.in, permite que aplicativos leiam bytes de informações digitadas pelo usuário
				 *  Alguns outros tipos de dados s o float e double para armazenar nmeros reais, e char para armazenar dados de caracteres.
				*/
				Scanner var_input = new Scanner(System.in);
		)
		{// Start try
			// int: número inteiro
			/*
			 * Por conven o, identificadores de nomes de variáveis iniciam com uma letra minúscula e cada palavra no nome depois da primeira
			 *  começa com uma letra maiúscula. Por exemplo, o identificador de nome da vari vel firstNumber inicia a sua segunda 
			 *  palavra, Number, com uma letra N maiúscula. Essa conven o de nomenclatura  conhecida como notação camelo, porque as 
			 *  letras maiúsculas destacam-se como corcovas desse animal. 
			*/
			int number1; // Primeiro número a somar
			int number2; // Segundo número a somar
			int sum; // Soma de number1 e number2
			
			/*
			 * nextInt do valor de input do objeto Scanner para obter um inteiro digitado pelo usuário.
			*/
			
			System.out.print("Informe o primeiro número: ");// prompt
			number1 = var_input.nextInt(); //lê número informado pelo usuário
			
			System.out.print("Informe o segundo número: ");// prompt
			number2 = var_input.nextInt(); //lê número informado pelo usuário
					
			sum = number1 + number2; //lê número informado pelo usuário
				
			/*
			 *  %d: marcador de lugar para um valor int (letra d significa “inteiro decimal”)
			 *  %n: marcador de lugar para pular linha
			*/
			System.out.printf("Soma é %d%n", sum); // exibe a soma
		}// End try

	}// End método main

}//  End class Addition
