/**
 * 
 */
package chapter_03;

/**
 * Author: Felipe da Rocha Ferreira
 * Email: felipe179971@hotmail.com
 * Date: 06/05/2024
 * Update: 
 * ----------------------------------------------------------------
 * 
 * 3.2.1 Classe Account que contém uma variável de instância name 
 * e métodos para configurar e obter seu valor.
*/

public class Account 
{// Start: declarando classe Account
	
	// Variáveis de instância devem ser declaradas depois de da classe e antes do método.
	// Declarando a variável de isntância 'name' do tipo 'String';
	// O modificar de acesso 'private' garante que a instância 'name' só será empregada nos métodos
	//de cada objeto da classe 'Acount' (e não por outras classes). Nesse caso, por setName e getName.
	
	private String name; // Variável de isntância
	
	// void (tipo de retorno): vou executar o método mas não irei retornar nada
	// Método setName recebe o parâmetro 'name' do tipo String
	public void setName(String name) 
	{// Start: método setName para definir o nome do objeto
		
		// Instrução: atribuir o valor do parâmetro 'name' à variável de instância 'name' da classe (armazena o nome da conta no objeto)
		// this é usado para referência a variável de instância
		this.name = name;//Armazena o objeto
	
	}// End: método setName para definir o nome do objeto
	
	public String getName() 
	{// Start: método getName para recuperar o nome do objeto
		
		return name; // Retorna valor do nome para o chamador
		
	}// End: método getName para recuperar o nome do objeto
	

}// End: declarando classe Account
