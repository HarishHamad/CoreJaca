package filehandling;

import java.io.FileWriter;

public class WriterTest {

	public static void main(String[] args) throws Exception {
	FileWriter w = new FileWriter("C:\\Users\\admin\\Documents\\Testwriter.txt");
    char[] Array = {'H','N'};
    //w.write(Array);    //Wite char Array
    w.write("My heart beats for you");          // write a char
   // w.write("GoldenMemory");    //write String
    w.close();
	}

}
