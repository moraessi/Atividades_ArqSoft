package Exercicio7_1;

/**
 * 
 * @author Gabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */

public class ManipuladorMinusculo extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		return string.toLowerCase();
	}
}
