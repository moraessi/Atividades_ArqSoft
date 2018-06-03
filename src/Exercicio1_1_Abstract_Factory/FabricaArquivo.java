package Exercicio1_1_Abstract_Factory;

/**
 * 
 * @authorGabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */


//Fabrica de impressão no arquivo
public class FabricaArquivo implements FabricaAbstrata {
	
	private static final Impressao impressao = new ImpressaoArquivo("output.txt");

	@Override
	public Impressao criarImpressao() {
		return impressao;
	}

}
