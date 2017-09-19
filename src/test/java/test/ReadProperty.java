package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Platform;

public class ReadProperty {
	public static String loadProperty(String key){
		Properties property = new Properties();
		FileInputStream filepath = null;
		Platform current = Platform.getCurrent();
		 if (current.WINDOWS!=null||current.VISTA!=null||current.XP!=null||current.MAC!=null)
		{
			String filePathString = "src/main/java/config.properties";
			try{
				filepath = new FileInputStream(filePathString);
				property.load(filepath);
				filepath.close();
			}
			catch (IOException a){
				a.printStackTrace();
			}
			
		}
		 
		else
		{	System.out.println("please check it again");
		}
		return property.getProperty(key);
			
	}
	
	public static String loadTestdata(String key,String file){
		
		Properties property = new Properties();
		FileInputStream filepath = null;
		Platform current = Platform.getCurrent();
		 if (current.WINDOWS!=null||current.VISTA!=null||current.XP!=null||current.MAC!=null)
		{
			String filePathString = "src/main/java/"+file+".properties";
			try{
				filepath = new FileInputStream(filePathString);
				property.load(filepath);
				filepath.close();
			}
			catch (IOException a){
				a.printStackTrace();
			}
			
		}
		 
		else
		{	System.out.println("please check it again");
		}
		return property.getProperty(key,file);
		
	}

}
