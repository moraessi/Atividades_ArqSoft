package Exercicio4_2;

/**
 * 
 * @author Gabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */

public class Main {
	
	public static void main(String[] args) {
		// Cria o cliente com o adaptador.
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
