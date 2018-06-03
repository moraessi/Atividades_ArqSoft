package Exercicio1_1_Abstract_Factory;

/**
 * 
 * @authorGabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */


//Fabrica de impressão na tela
public class FabricaTela implements FabricaAbstrata {
	
	private static final Impressao impressao = new ImpressaoTela();

	@Override
	public Impressao criarImpressao() {
		return impressao;
	}

}
