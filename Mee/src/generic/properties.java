package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class properties {

	public static String propData() {
		String mail = "";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("./data.properties"));
			mail = prop.getProperty("submail");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mail;
	}
}
