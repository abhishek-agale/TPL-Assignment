package LoginModule;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mysitebook.io/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.className("yellow-btn")).click();
		Thread.sleep(3000);
		
		Set<String>windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parentid=it.next();
	    String childid=it.next();
	    driver.switchTo().window(childid);
		
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("8888294462");
		Thread.sleep(3000);
		driver.findElement(By.className("auth-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Abhi@1234");
		Thread.sleep(2000);
		driver.findElement(By.className("auth-btn")).click();
		System.out.println("login successful");
		Thread.sleep(2000);
		driver.findElement(By.className("inner-card")).click();
		//driver.close();
	}


}
