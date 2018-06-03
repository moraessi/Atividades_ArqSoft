package Exercicio2_1_FactoryMethod;

/**
 * 
 * @authorGabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */

public class ExecutarNome {

	public static void main(String[] args) {
		FabricaNome fn = new FabricaNome();
		
		String nome = "Maria";
		String sobrenome = "Pereira";
		
		fn.getNome(nome, sobrenome);

	}

}