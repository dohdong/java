package bStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GDataOutputStreamEx {

	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("C:\\Users\\BIT\\eclipse-workspace\\Day8\\src\\dataOut.txt");
			dos = new DataOutputStream(fos);
			dos.writeBoolean(false);
			dos.writeInt(20000);
			dos.writeChar('T');
			dos.writeDouble(290.45);
			System.out.println("File에 자바 기본형 데이터 기록");
			fis = new FileInputStream("C:\\Users\\BIT\\eclipse-workspace\\Day8\\src\\dataOut.txt");
			dis = new DataInputStream(fis);

			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());

		}catch(IOException ioe) {
			ioe.printStackTrace();

		}finally {
			try {
				if(fis != null) fis.close();
				if(dis != null) dis.close();
				if (fos != null) fos.close(); 
				if (dos != null) dos.close(); 
			} catch (IOException ioe) { 
				ioe.printStackTrace(); 
			}
		}
	}
}

		

