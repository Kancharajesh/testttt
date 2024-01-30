package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readprop {

	public static void main(String[] args) throws IOException 
	{
		
		
		FileReader fr = new FileReader("C:\\Users\\ososa\\eclipse-workspace\\spaarksmobile01\\src\\test\\java\\config.pro");
		Properties p = new Properties();
		p.load(fr);
		
				
		
		System.out.print(p.getProperty("browser"));
		System.out.print(p.getProperty("testurl"));
	}

}
