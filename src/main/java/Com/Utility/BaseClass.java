package Com.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ConfiqDataProvider confiq;
	public static ExcelDataProvider excel;
	@BeforeSuite
	public void StartSetup() throws IOException {
		 confiq=new ConfiqDataProvider();
	 excel=new ExcelDataProvider();
	}
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void setUp(String BrowserName ) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			
		}
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			
		
	//	WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		driver.get(confiq.getBaseUrl_QA1());
		driver.manage().window().maximize();
	}
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
