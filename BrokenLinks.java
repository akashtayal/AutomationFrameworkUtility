import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinks {
	
	
	//private WebDriver driver;
	public void findBrokenLinks(WebDriver driver) {
		
		HttpURLConnection huc = null;
		String url="";
		int respCode;
		List<WebElement> list = driver.findElements(By.xpath("//a[contains(@href,'/')]"));
		int count=0;
		System.out.println("Total Links found: " + list.size());
		for(int index=0;index<list.size();index++) {
			url = list.get(index).getAttribute("href");
		
		try {
			huc = (HttpURLConnection)(new URL(url).openConnection());
			huc.setRequestMethod("GET");
			huc.connect();
			respCode = huc.getResponseCode();
			/*
			 * Implementing Retry for the request having issues.
			 * 
			 */
			if(respCode>=400) {
				huc.setRequestMethod("POST");
				huc.connect();
				respCode = huc.getResponseCode();
				if(respCode>=400) {
					System.out.println(respCode+" "+ url);
					count++;
				}
				}
		}
		catch(Exception e){
			System.out.println("Exception Found: ");
			e.printStackTrace();
		}
		}
		
		System.out.println("Total Failure on links: "+count);
		
	}
	
	

}
