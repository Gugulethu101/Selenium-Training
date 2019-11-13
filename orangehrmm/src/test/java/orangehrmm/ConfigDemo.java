package orangehrmm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDemo {
	public static void main(String[] args) throws IOException{
		
		File src = new File("configuration/Config.properties");
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		System.out.println(pro.getProperty("url"));
		System.out.println(pro.getProperty("host"));
		
	}//end main
	
}//end ConfigDemo
