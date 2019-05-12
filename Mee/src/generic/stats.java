package generic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class stats extends openbrowser {
	
	public void print() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
	}

	public static void stat(String linkUrl) throws IOException {

		URL url;
		try {
			System.out.println("\nChecking the Status of the Page opened...\n");
			driver.get(linkUrl);
			url = new URL(linkUrl);
			HttpURLConnection check = (HttpURLConnection) url.openConnection();
			check.setConnectTimeout(5000);
			check.connect();
			System.out.println("Page Title: "+driver.getTitle());
			System.out.println("Page URL: "+linkUrl);
			System.out.println("Page Status: " + check.getResponseCode());
			System.out.println();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
