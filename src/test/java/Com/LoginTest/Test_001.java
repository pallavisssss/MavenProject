package Com.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.LoginPom;
import Com.Utility.BaseClass;
import Com.Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_001 extends BaseClass {
	@Test
	public void verifyloginpage() {
	/*	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();*/
		
		//Identify webelement
	
	//WebElement txt_email= driver.findElement(By.xpath("// input[@id='email']"));
//	WebElement txt_password= driver.findElement(By.xpath("// input[@id='pass']"));
	LoginPom login=	PageFactory.initElements(driver, LoginPom.class);

	//Actions
	Library.custom_SendKeys(login.gettxt_email(),excel.getStringData("sheet1", 0, 0));
	Library.custom_SendKeys(login.gettxt_password(),excel.getStringData("sheet1", 0, 1));
	
	/*txt_email.sendKeys("Test@gmail.com");
	txt_password.sendKeys("Test1234");*/

	
	}

}
