package bStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		FileInputStream fis = null;
		byte _read[] = new byte[1000];
		byte console[] = new byte[1000];
		
		try {
			File f = new File("C:\\Users\\BIT\\eclipse-workspace\\Day8\\src\\bStream\\FileEx1.java");
			fis = new FileInputStream(f);
			fis.read(_read,0,_read.length);
			System.out.println(new String(_read).trim());
			
		}catch(FileNotFoundException e ) {
			e.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}finally {
			try {
				if(fis != null) fis.close();
			}catch(IOException ioe) {
				
			}
		}
	}
}
