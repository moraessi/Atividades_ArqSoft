package Exercicio2_2_FactoryMethod;

/**
 * 
 * @authorGabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */

import javax.swing.JOptionPane;

public class ExecutarTexto {

	public static void main(String[] args) {
		FabricaTexto ft = new FabricaTexto();
		
		String men, texto;
		
		texto = JOptionPane.showInputDialog(null, "Digite uma informação");
		ft.getTexto(texto);
		
		men = JOptionPane.showInputDialog(null, "Para criar um arquivo público, digite *PUBLICO*.\n Para criar um arquivo *CONFIDENCIAL* digite a senha.");
		
		if(men.equals("publico")){
			
			ft.publico(texto);
			JOptionPane.showMessageDialog(null, "Arquivo criado com Sucesso"); 
		}
		else if(men.equals("desi gnpatt er ns")){
			ft.confidencial(texto);
			JOptionPane.showMessageDialog(null, "Arquivo criado com Sucesso"); 
		}
		else{
			JOptionPane.showMessageDialog(null, "Ocorreu um ERRO");
		}
		
		System.exit(0);
	}
	

}
