package chapter_02;

/**
 * Author: Felipe da Rocha Ferreira
 * Email: felipe179971@hotmail.com
 * Date: 03/03/2024
 * Update: 
 * ----------------------------------------------------------------
 * 
 *  Exercícios de revisão do capítulo 2
 * 
*/


public @interface ExerciciosChapter02 {
	
	/*
	 * 2.1 Preencha as lacunas em cada uma das seguintes afirmações:
 	 * a) Um(a) { começa o corpo de cada método e um(a) } termina o corpo de cada método.
 	 * b) Você pode usar a declaração if para tomar decisões.
 	 * c) // começa em um comentário de fim de linha.
 	 * d) Caracteres de espeço, novas linhas e tabulações são chamados espaço em branco.
 	 * e) Palavra-chave são reservadas para uso pelo Java.
 	 * f) Aplicativos Java iniciam a execução no método main.
 	 * g) Os métodos System.out.print, System.out.printf e System.out.println exibem informações em uma janela de comando.
 	 * 
 	 * 2.2 Determine se cada uma das seguintes afirmações  verdadeira ou falsa. Se falsa, explique por quê.
 	 *  a) Os comentários fazem com que o computador imprima o texto depois das // na tela quando o programa executa.
 	 *  Falso. Ele faz o java ignorar o que estiver escrito logo após //.
 	 *  
 	 *  b) Todas as variáveis devem ser atribudas a um tipo quando são declaradas.
 	 *  Verdadeiro.
 	 *  
 	 *  c) O Java considera que as variáveis number e NuMbEr são idênticas.
 	 *  Falso. O java é sensível à letras maíusculas e minúsculas.
 	 *  
 	 *  d) O operador de resto (%) pode ser utilizado apenas com operandos inteiros.
 	 *  Falso. Também pode ser utilizado com operandos não inteiros.
 	 *  
 	 *  e) Os operadores aritmticos *, /, %, + e - têm, todos, o mesmo nível de precedência.
 	 *  Falso. Ele segue a regra algébrica (primeiro divisões e multiplicações, depois adições e subtrações).
 	 * 
 	 * 
 	 * 2.3 Escreva instruções para realizar cada uma das tarefas a seguir:
 	 * a) Declare que as variáveis c, thisIsAVariable, q76354 e number serão do tipo int.
 	 * int c, thisIsAVariable, q76354, number; 
 	 * 
 	 * ou 
 	 * 
 	 * int c;
 	 * int thisIsAVariable;
 	 * int q76354;
 	 * int number;
 	 * 
 	 * b) Solicite que o usuário insira um inteiro.
 	 * System.out.print("insira um inteiro: ")  
 	 * 
 	 * c) Insira um inteiro e atribua o resultado  variável int value. Suponha que a variável Scanner input possa ser utilizada para ler  um valor digitado pelo usuário.
 	 * int = input.nextInt();
 	 * 
 	 * d) Imprima “This is a Java program" em uma linha na janela de comando. Use o método System.out.println.
 	 * System.out.println(“This is a Java program");
 	 * 
 	 * e) Imprima “This is a Java program" em duas linhas na janela de comando. A primeira deve terminar com Java. Utilize o método System.out.printf e dois especificadores de formato %s.
 	 * System.out.printf("%s%n%s%n",“This is a Java",“program");
 	 * 
 	 * f) Se a variável number não for igual a 7, exiba “The variable number is not equal to 7".
 	 * if( number <> 7)
 	 * 	System.out.print(“The variable number is not equal to 7");
 	 * 
 	 * 2.4 Identifique e corrija os erros em cada uma das seguintes instruções:
 	 * a) 
 	 * if (c < 7);   
 	 * System.out.println(“c is less than 7”);
 	 * 
 	 * O erro está no ";" da primeira linha. Deveria ser "if (c < 7) ".
 	 * 
 	 * b) 
 	 * if (c => 7)   
 	 * 	System.out.println(“c is equal to or greater than 7”);
 	 * 
 	 * O erro  esté em "=>", na primeira linha. O certo é ">=".
 	 * 
 	 * 
 	 * 2.5 Escreva declarações, instruções ou comentários que realizem cada uma das tarefas a seguir:
 	 * 
 	 * a) Declare que um programa calculará o produto de três inteiros.
 	 *"// Esse programa irá calcular o produto de três inteiros".
 	 * 
 	 * b) Crie um Scanner chamado input que leia valores a partir da entrada padrão.
 	 * Scanner input = new Scanner(System.in);
 	 * 
 	 * c) Declare as variáveis x, y, z e result como tipo int.
 	 * int x, y, z, result;
 	 * 
 	 * d) Solicite que o usuário insira o primeiro inteiro.
 	 * System.out.print("Insira o primeiro inteiro");
 	 * 
 	 * e) Leia o primeiro inteiro digitado pelo usuário e armazene-o na variável x.
 	 * x = input.nextInt();
 	 * 
 	 * f) Solicite que o usuário insira o segundo inteiro.
 	 * System.out.print("Insira o segundo inteiro")/
 	 * 
 	 * g) Leia o segundo inteiro digitado pelo usuário e armazene-o na variável y.
 	 * y = input.nextInt();
 	 * 
 	 * h) Solicite que o usuário insira o terceiro inteiro.
 	 * System.out.print("Insira o terceiro inteiro");
 	 * 
 	 * i) Leia o terceiro inteiro digitado pelo usuário e armazene-o na variável z.
 	 * z = input.nextInt();
 	 *  	 
 	 * j) Compute o produto dos três inteiros contidos nas variáveis x, y e z e atribua o resultado  variável result.
 	 * result = x * y *z;
 	 * 
 	 * k) Use System.out.printf para exibir a mensagem “Product is” seguida pelo valor da variável result.
 	 * System.out.printf("Product is %d%n", result);
 	 * 
 	 * 2.7 Preencha as lacunas em cada uma das seguintes afirmações:
 	 * a) barra**barra são utilizados para documentar um programa e aprimorar sua legibilidade.
 	 * 
 	 * b) Uma decisão pode ser tomada em um programa Java com um(a) if.
 	 * 
 	 * c) Os cálculos normalmente são realizados pelas instruções * barra % + e -.
 	 * 
 	 * d) Os operadores aritmticos com a mesma precedência da multiplicação são divisão (barra) e resto (%).
 	 * 
 	 * e) Quando parênteses em uma expressão aritmtica estão aninhados, o conjunto de parênteses da esquerda para a direita é  avaliado primeiro.
 	 * 
 	 * f) Uma posição na memória do computador que pode conter valores diferentes várias vezes ao longo da execução de um programa  chamada ________.
 
 
 	*/

}
