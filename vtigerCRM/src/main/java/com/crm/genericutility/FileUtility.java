package com.crm.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author yugesh
 */
public class FileUtility {
	
	/**
	 * This Method is used to read string data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String getDataFromProperty(String key) throws IOException{
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/Commondata.properties");
	Properties prop=new Properties();
	prop.load(fis);
	return prop.getProperty(key);
	}
}
