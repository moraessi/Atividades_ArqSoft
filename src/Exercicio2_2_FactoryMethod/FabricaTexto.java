package Exercicio2_2_FactoryMethod;

/**
 * 
 * @authorGabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FabricaTexto {
	public Texto getTexto(String texto){
		return new ProvedorInformacao(texto);
	}
	
	public void publico(String texto) {
		try {
		      PrintStream out = new PrintStream(new FileOutputStream("publico.txt"));
		 
		        out.println(" As informa��es s�o p�blicas, neste caso todo mundo pode ver este arquivo.\n - " + texto);

		      out.close();

		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    }
		System.out.printf("Sucesso");
	}
	
	public void confidencial(String texto) {
		try {
		      PrintStream out = new PrintStream(new FileOutputStream("confidencial.txt"));
		 
		        out.println("As informa��es s�o confidenciais,\n o que significa que provavelmente s� voc� sabe a senha.\n - " + texto);

		      out.close();

		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    }
		System.out.printf("Sucesso");
	}
}
