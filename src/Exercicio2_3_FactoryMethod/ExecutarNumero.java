package Exercicio2_3_FactoryMethod;


/**
 * 
 * @authorGabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */

import javax.swing.JOptionPane;

public class ExecutarNumero {
	
	public static void main(String[] args) {
		
		String men = "";
		FabricaNumero fn = new FabricaNumero();
		
		men = JOptionPane.showInputDialog(null, "Digite qual arquivo deseja criar\n*Obs: ARQUIVO ou CONSOLE");
		fn.mostrar(men);
		
		
		System.exit(0);
	}

}
