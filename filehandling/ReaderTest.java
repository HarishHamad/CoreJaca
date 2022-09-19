package filehandling;

import java.io.FileReader;

public class ReaderTest {

	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("C:\\Users\\admin\\Documents\\Testreader.txt");
        int ch = reader.read();
        char chr;
        //ch is (-1) if no more char is left in file
        
        while (ch!=-1) {
			chr = (char)ch;   //type cast to char
			System.out.println(chr);
			ch = reader.read(); //read next character
		}
        reader.close();
	}

}
