package Exercicio1_1_Abstract_Factory;

/**
 * 
 * @authorGabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */


import java.io.File;
import java.io.PrintWriter;

//Impress�o em arquivo
public class ImpressaoArquivo implements Impressao {
	
	// Arquivo que ser� imprimido quando solicitado
	private File arquivo;


	public ImpressaoArquivo(String nomeArquivo) {
		this.arquivo = new File(nomeArquivo);
	}

	public void imprimir(String string) {
		// Tentar criar um arquivo nele e realizar a impress�o
		try {
			arquivo.createNewFile();
			PrintWriter writer = new PrintWriter(arquivo);
			writer.print(string);
			writer.close();

			// Avisa se tudo estiver OK
			System.out.println("Verifique arquivo: " + arquivo.getCanonicalPath());
		}

		// Caso ocorra falhas
		catch (Exception e) {
			System.out.println("N�o foi possivel criar o arquivo output.txt");
		}
	}

}
