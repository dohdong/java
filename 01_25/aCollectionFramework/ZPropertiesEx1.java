package aCollectionFramework;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;


public class ZPropertiesEx1 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("C:\\Users\\BIT\\eclipse-workspace\\Day8\\dbinfo.properties");
			prop.load(fis);
		}catch(IOException e ) {
			
		}
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("driver"));
		System.out.println(prop.getProperty("user"));
		System.out.println(prop.getProperty("pass"));
		
	}

}
