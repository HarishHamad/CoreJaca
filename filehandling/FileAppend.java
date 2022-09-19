package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileAppend {
public static void main(String[] args)throws Exception {
	FileWriter writer = new FileWriter("C:\\Users\\admin\\Desktop\\Readerfile.txt", true);
	BufferedWriter bw = new BufferedWriter(writer);
	bw.write("i like watching movie");
	bw.close();
}
}
