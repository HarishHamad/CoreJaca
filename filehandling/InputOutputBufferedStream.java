package filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputOutputBufferedStream {
public static void main(String[] args) throws Exception {
	BufferedInputStream reader = new BufferedInputStream(new FileInputStream("C:\\Users\\admin\\Documents\\Inoutputstream.txt"));
	BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream("C:\\Users\\admin\\Documents\\Empty.txt"));
	byte[] buff = new byte [256];
	int count = reader.read(buff);
	while (count>0) {
		writer.write(buff,0,count);
		count = reader.read(buff);
		System.out.println("chal ja ab");
	}
	writer.close();
	reader.close();
}
}
