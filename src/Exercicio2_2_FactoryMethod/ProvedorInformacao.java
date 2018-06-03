package Exercicio2_2_FactoryMethod;

/**
 * 
 * @authorGabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */

public class ProvedorInformacao extends Texto{
	
	public ProvedorInformacao(){
		
	}
	public ProvedorInformacao(String texto){
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}
}
