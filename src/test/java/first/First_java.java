package first;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First_java {


//	public static void main(String args[]) throws Throwable {
	
	@Test
	public void main() throws Throwable {
		
//		WebDriverManager.chromedriver().setup();
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		
		Thread.sleep(5000);		
		dr.get("https://www.google.com");
		
		Thread.sleep(4000);
		
		dr.close();
		
	}

}
