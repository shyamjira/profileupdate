package Com.Naukari.QA.Com.Naukari.QA.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginLogout {
	
	@Test
	public static void main() throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login?URL=http://www.naukri.com/mnjuser/homepage");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='usernameField']"));
		WebElement PassWord = driver.findElement(By.xpath("//input[@id='passwordField']"));
		WebElement LoginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
		
		
		Username.sendKeys("srnarwade96@gmail.com");
		PassWord.sendKeys("Shyam@1234");
		LoginBtn.click();
		
		WebElement Profile = driver.findElement(By.xpath("//img[@class='nI-gNb-icon-img']"));
		
		Profile.click();
		Thread.sleep(3000);
		
		WebElement UpdateProfile = driver.findElement(By.xpath("//a[@class='nI-gNb-info__sub-link']"));
		UpdateProfile.click();
		
		WebElement EditBtn = driver.findElement(By.xpath("//em[@class='icon edit']"));
		
		EditBtn.click();
		
//		WebElement frame = driver.findElement(By.xpath("//iframe[2]"));
//		Thread.sleep(3000);
//		driver.switchTo().frame(2);
		
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		
		Thread.sleep(3000);
		name.clear();
		Thread.sleep(3000);
		name.sendKeys("Shyam Ramchandra Narwade.");
		
		
		WebElement SaveBtn = driver.findElement(By.xpath("//button[text()='SAVE']"));
		
		SaveBtn.click();
		
		
		Profile.click();
		WebElement LogOut = driver.findElement(By.xpath("//a[@title='Logout']"));
		LogOut.click();
		
		driver.close();
		
		
		
	
	}

}
