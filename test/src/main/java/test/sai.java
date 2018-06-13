package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sai {
	@Test
	public void abc(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	

}
