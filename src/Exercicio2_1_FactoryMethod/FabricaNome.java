package Exercicio2_1_FactoryMethod;

/**
 * 
 * @authorGabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */

public class FabricaNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Informacao(nome, sobrenome);
	}
}
