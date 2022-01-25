package bStream;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {
		String filePath = "c:\\";
		File f1 = new File(filePath);
		String list[] = f1.list();
		for (int i = 0; i<list.length; i++) {
			File f2 = new File(filePath, list[i]);
			if (f2.isDirectory()) {
				System.out.printf("%s : 디렉토리 %n",list[i]);
			}else {
				System.out.printf("%s : 파일(%,dbyte)%n",
						list[i],f2.length());
			}
		}
		
		
		
	}

}
