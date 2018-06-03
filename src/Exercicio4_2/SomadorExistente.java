package Exercicio4_2;

/**
 * 
 * @author Gabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */


import java.util.List;

public class SomadorExistente {
	/** Soma uma lista de inteiros. */
	public int somaLista(List<Integer> lista) {
		int resultado = 0;
		for (int i : lista)
			resultado += i;
		return resultado;
	}
}
