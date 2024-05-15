package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	
		public String readpropertyfile(String key) throws IOException {
			// TODO Auto-generated method stub

		  Properties p = new Properties();
		  
		  FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\ustlearningmaven\\config.properties");
		  p.load(fis);
		  
		  String myValue = p.getProperty(key);
		  System.out.println(myValue);
		return myValue;
		}
		
}
		
  