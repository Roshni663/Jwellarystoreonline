package Group419;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test419 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshne Parmar\\Documents\\drivers/chromedriver.exe" );
 ChromeDriver driver = new ChromeDriver();
 driver.get("http://www.amazon.ca");
 driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[1]")).click();
//driver.quit();
//driver.navigate().to("http://www.amazon.com");
//driver.navigate().to("http://www.google.com");
//driver.navigate().back();
//System.out.println(driver.getTitle());
//System.out.println(driver.getCurrentUrl());
//driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
//driver.findElement(By.id("continue")).click();
	}

}
