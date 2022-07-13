package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfiqDataProvider {
	Properties pro;
	
	public ConfiqDataProvider() throws IOException {
	String path ="C:\\Users\\Pramila\\eclipse-workspace\\MavenProject\\Confique\\confiq.properties";
		
	FileInputStream fis =new FileInputStream(path);
	 pro=new Properties();
	pro.load(fis);
	}
	
	public String getBaseUrl_QA1(){
	return	pro.getProperty("BaseUrl_QA1");
	}
	

}
