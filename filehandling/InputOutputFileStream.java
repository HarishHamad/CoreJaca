package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class InputOutputFileStream {
	public static void main(String[] args) throws Exception {
		String source = ("C:\\Users\\admin\\Documents\\Inoutputstream.txt");
		String target = ("C:\\Users\\admin\\Documents\\Empty.txt");
		FileInputStream reader = new FileInputStream(source);
		FileOutputStream writer = new FileOutputStream(target);
		
		int ch = reader.read();
		char chr;
		
		while (ch!=-1) {
			
			chr = (char)ch;
			System.out.println(chr);
			writer.write(ch);
			ch = reader.read();
			
		}
		writer.close();
		reader.close();
}
}