package Exercicio5;

/**
 * 
 * @author Gabriela Vieira de Moraes - 81610253 - SIN3AN-MCA1
 *
 */

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class IOFacade {
	
	
	public static void write(String text, String namePath) {

		Writer writer;
		try (FileOutputStream stream = new FileOutputStream(namePath);
			 OutputStreamWriter streamWriter = new OutputStreamWriter(stream, "utf-8");){
			writer = new BufferedWriter(streamWriter);
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			
		} 
		
	}
	
}
