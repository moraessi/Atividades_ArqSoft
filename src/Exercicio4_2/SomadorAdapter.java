package Exercicio4_2;


/**
 * 
 * @author Gabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */


import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter implements SomadorEsperado {
	/** Somador existente. */
	private static SomadorExistente somador = new SomadorExistente();

	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < vetor.length; i++)
			lista.add(vetor[i]);
		return somador.somaLista(lista);
	}
}
