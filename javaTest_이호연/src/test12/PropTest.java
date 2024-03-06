package test12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropTest {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("1", "apple,1200,3");
		prop.setProperty("2", "banana,2500,2");
		prop.setProperty("3", "grape,4500,5");
		prop.setProperty("4", "orange,800,10");
		prop.setProperty("5", "melon,5000,2");
		
		fileSave(prop);
		
		fileOpen(prop);
	}
	
	public static void fileSave(Properties p) {
		try {
			p.storeToXML(new FileOutputStream("data.xml"), null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void fileOpen(Properties p) {
		try {
			p.loadFromXML(new FileInputStream("data.xml"));
			
			Enumeration enu = p.propertyNames();
			
			Fruit[] far = new Fruit[p.size()];
			
			for (Fruit f : far) {
				String key = (String) enu.nextElement();
				String value = p.getProperty(key);
				String[] values = value.split(",");
				f = new Fruit(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]));	
				System.out.println(key + "=" + f.toString());
			}
			
			
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
