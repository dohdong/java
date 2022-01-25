package bStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			File f = new File("FileEx1.java");
			if(!f.exists())f.mkdirs();
			fos = new FileOutputStream("C:\\Users\\BIT\\eclipse-workspace\\Day8\\myfolder\\file1.txt");
			String message = "Test FileOutputStream";
			fos.write(message.getBytes());
			System.out.println("file생성하고 기록함.");
			
		}catch(FileNotFoundException e ) {
			e.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}finally {
			try {
				if(fos != null) fos.close();
			}catch(IOException ioe) {
				
			}
		}
	}
}
