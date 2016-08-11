package base;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.os.WindowsUtils;



public class Frameswork {

	public static void main(String[] args) throws IOException {
		
		// incase firefox is not invoking by default and gives error
	/*	
		FirefoxBinary ffbinary= new FirefoxBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxProfile ffprof=new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(ffbinary,ffprof);		
		*/
//		WindowsUtils.tryToKillByName("notepad.exe");	//to kill processess

		FirefoxProfile prof=new FirefoxProfile();		//to avoid htpps certifications
		prof.setAcceptUntrustedCertificates(false);
		
		WebDriver driver = new FirefoxDriver(prof);
		WebDriverWait wb = new WebDriverWait(driver,5);		//explict wait 5 sec
		driver.manage().deleteAllCookies();					// deleting cookies
		Set<Cookie>abc=driver.manage().getCookies();		//getting cookies
		System.out.println(abc.size());
		driver.get("http://www.google.com");
		//takikng Screen shots
		File scrfle=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfle,new File("E:\\Downloads\\Screenshot.png"));
		
		
	/*	
		//case when random popup appear on page
		try{
			driver.switchTo().alert().accept();
		}catch(Exception e){
			
		}
		
		
		driver.findElement(By.xpath("email")).sendKeys("aa");
		wb.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("vuviubon")));	
		driver.findElement(By.xpath("hyihbj")).click();		//dynamic dropdown
		int number=findframenumber(driver,By.xpath("savjnadivjn"));		//getting iframe number
		if(number>=0){
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("savjnadivjn")).click();
		driver.switchTo().defaultContent();
		}
		
		
		*/
	}
	public static int findframenumber(WebDriver driver,By by){		// reusable method
		int fnum=driver.findElements(By.tagName("iframe")).size();
		int i;
		for(i=0;i<fnum;i++){
			driver.switchTo().frame(i);
			int count=driver.findElements(by).size();
			if(count>0){
				driver.switchTo().defaultContent();
				return i;
			}
			driver.switchTo().defaultContent();
		}
		return -1;
	}

}
