package demoProg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstDemo {
	@Test

	//public static void main(String[] args) {
	
	@BeforeTest
	public void openbrowser() {

		System.setProperty("webdriver.chrome.driver", "/home/stummulw/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 
		try {
			FileUtils.copyFile(src, new File("/home/stummulw/eclipse-workspace/seleniumproject/screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//@Test
		//public void varifyUrlLaunch() {
			
			String pageTitle=driver.getTitle();
		
	
			Assert.assertEquals(pageTitle, "Google");
			System.out.println(pageTitle);
		
		
		//}

	

}
}
