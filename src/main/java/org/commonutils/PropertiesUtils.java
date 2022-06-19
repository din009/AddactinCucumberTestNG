package org.commonutils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtils {

	public String getPropertyData(String files, String Key) {
		String value="";
		try {
			File file = new File(files);
			FileInputStream input= new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(input);
			value = prop.getProperty(Key);
						
		} catch (Exception e) {
			System.out.println(e);
		}
		return value;
	}
}
