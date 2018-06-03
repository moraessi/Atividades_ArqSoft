package Exercicio1_2_Abstract_Factory;

/**
 * 
 * @authorGabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */


public class FabricaPizzaria implements FabricaAbstrataPizzaria{
	String m;
	
	@Override
	public String funcionarioP() {
		
		return  m = "Pizzas\n * Ingredientes do dia: *\n * Queijo\n * Calabresa\n * Tomate\n_____________________\nCalzones \n * Ingredientes do dia: * \n * Queijo\n * Calabresa\n * Tomate\n";
	}
	
	@Override
	public String funcionarioS() {
		
		return  m = "Pizzas \n * Ingredientes do dia: * \n * Queijo\n * Presunto\n * Tomate\n____________________\nCalzones \n * Ingredientes do dia: * \n * Queijo\n * Presunto\n * Tomate\n";
	}

}
