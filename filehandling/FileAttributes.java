package filehandling;

import java.io.File;
import java.sql.Date;

public class FileAttributes {

	public static void main(String[] args) {
     File f = new File("C:\\Users\\admin\\Desktop\\FileAttribute.txt");
     if (f.exists()) {
		
    	 System.out.println("Name"+f.getName());
    	 System.out.println("Absolute path"+" "+f.getPath());
    	 System.out.println("Is Writable"+" "+f.canWrite());
    	 System.out.println("Is Readble"+" "+f.canRead());
    	 System.out.println("Is File"+" "+f.isFile());
    	 System.out.println("Is Directory"+" "+f.isDirectory());
    	 System.out.println("Last modified at"+" "+new Date(f.lastModified()));
    	 System.out.println("Length"+f.length()+" "+"bites long");
	}
	}

}
