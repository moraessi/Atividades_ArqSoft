package Exercicio1_1_Abstract_Factory;

/**
 * 
 * @authorGabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */


public class HelloWorld {
	
	//Fabrica de impress�es
	private FabricaAbstrata fabrica;

	
	public HelloWorld() {
		// Gerador de n�meros aleatorios entre 0 e 1.
		double rand = Math.random();

		// Se o n�mero for menor que 0,3, usa o console, se for diferente vai ser utilizado um arquivo.
		
		if (rand <= 0.3)
			fabrica = new FabricaTela();
		else fabrica = new FabricaArquivo();
	}

	//Cria uma impress�o com a seguinte mensagem: "Hello, World!"
	public void enviarHelloWorld() {
		Impressao impressao = fabrica.criarImpressao();
		System.out.println("Utilizando " + impressao.getClass().getSimpleName());
		impressao.imprimir("Hello, World!");
	}
	
}