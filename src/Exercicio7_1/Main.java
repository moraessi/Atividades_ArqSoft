package Exercicio7_1;

/**
 * 
 * @author Gabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */

public class Main {
	// Método principal
	public static void main(String[] args) throws Exception {
		// Manipula de várias formas.
		ManipuladorAbstrato manipulador;

		System.out.println("---------------------------");
		System.out.println("  Transforma em maiúscula   ");
		System.out.println("---------------------------");
		manipulador = new ManipuladorMaiusculo();
		manipulador.manipularString();

		System.out.println("---------------------------");
		System.out.println("  Transforma em minúsculo  ");
		System.out.println("---------------------------");
		manipulador = new ManipuladorMinusculo();
		manipulador.manipularString();

		System.out.println("---------------");
		System.out.println("    Duplica    ");
		System.out.println("---------------");
		manipulador = new ManipuladorDuplicar();
		manipulador.manipularString();

		System.out.println("---------------");
		System.out.println("    Inverte    ");
		System.out.println("---------------");
		manipulador = new ManipuladorInverter();
		manipulador.manipularString();
	}
}