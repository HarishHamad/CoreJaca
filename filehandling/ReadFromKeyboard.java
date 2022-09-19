package filehandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyboard {
public static void main(String[] args)throws Exception{
	PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\admin\\Documents//Writeonkb.txt"));
	InputStreamReader kb = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(kb);
	String line = in.readLine();
	while (!line.equals("exit")) {
		out.println(line);
		line = in.readLine();
		
		
	}
	in.close();
	out.close();
	kb.close();
}
}