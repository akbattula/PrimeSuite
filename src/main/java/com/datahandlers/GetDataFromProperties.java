package com.datahandlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromProperties {
	public static String getDataFromProperties(String filePath, String key) {
		
		String data= null;
		File f= new File(filePath);
		try {
			FileInputStream fis = new FileInputStream(f);
			Properties prop = new Properties();
			try {
				prop.load(fis);
				data = prop.getProperty(key).toString();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}

}

/*//covered in data handlers - have written in testNG tests
 * static String getAPIEndPoint() {
	 String s= null;
	Properties pro = new Properties();
	try {
		InputStream input= new FileInputStream(new File("/TheWolverine/test-config/config.properties"));
		try {
			pro.load(input);
			s=pro.getProperty(APIEndPoint);
			return s;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			skip=true;
		}		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		skip=true;
	}*/	