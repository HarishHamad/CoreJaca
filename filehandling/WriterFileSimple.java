package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriterFileSimple {
public static void main(String[] args)  throws Exception{
	FileWriter writer = new FileWriter("C:\\Users\\admin\\Documents//Witersimple.txt");
	BufferedWriter bw = new BufferedWriter(writer);
	bw.write("Without you i am nothing");
	bw.close();
}
}
