package Movie.jdbc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class JDBC_Prop {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("C", "INSERT");
		
		try {
			prop.store(new FileOutputStream("resources/driver.properties"), "properties test");
			prop.storeToXML(new FileOutputStream("resources/query.xml"), "properties test");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
