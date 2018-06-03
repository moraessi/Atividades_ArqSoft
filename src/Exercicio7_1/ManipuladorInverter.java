package Exercicio7_1;

/**
 * 
 * @author Gabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */

public class ManipuladorInverter extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		StringBuffer buffer = new StringBuffer(string.length());
		for (int i = string.length(); i > 0; i--)
			buffer.append(string.charAt(i - 1));
		return buffer.toString();
	}
}
