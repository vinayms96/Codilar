package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class properties implements auto_constant{

	public static String getProperty(String data) {
		String res = "";
		try {
			FileInputStream fi = new FileInputStream(propPath);
			Properties prop = new Properties();
			prop.load(fi);
			res = prop.getProperty(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
}
