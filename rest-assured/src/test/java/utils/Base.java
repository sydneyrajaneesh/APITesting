package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.relevantcodes.extentreports.ExtentTest;

public class Base extends Reporter {
	
	protected static Properties confprop;
	public String baseURL;
	public String newEndpoint;
	public ExtentTest test;

	public Base(ExtentTest test) {
        this.test=test;
   }
	
	public Base() {
		Properties confprop = new Properties();
		try {
			confprop.load(new FileInputStream(new File("./src/test/resources/config.properties")));
			 baseURL = confprop.getProperty("URL");
			 newEndpoint = confprop.getProperty("testPath");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		

}
