package org.Testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad {

	public static Properties propfileload(String path) throws IOException {
		
		File f=new File(path);
		FileInputStream ip=new FileInputStream(f);
		Properties pr=new Properties();
		pr.load(ip);
		
		return pr;
	}
	
	
}
