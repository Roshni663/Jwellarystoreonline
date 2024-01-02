package Group419;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;


public class test1 {

	@Test
	//test for title
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshne Parmar\\Documents\\drivers/chromedriver.exe" );
		 ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
	    String Actual_Title = driver.getTitle();
	    String Expected_Title = "React App";
	    Assert.assertEquals(Expected_Title, Actual_Title);
	    Thread.sleep(2000);
	    driver.quit();
	    

	}
@Test
//complete form
public void test2() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshne Parmar\\Documents\\drivers/chromedriver.exe" );
	 ChromeDriver driver = new ChromeDriver();
	driver.get("http://localhost:3000/");
	WebElement e_id = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[1]/div/div/input"));
	e_id.sendKeys("roshni@gmail.com");
   
   Thread.sleep(2000);
   WebElement password=  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[2]/div/div/input"));
   password.sendKeys("roshni26");
   
   WebElement retype_password = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[3]/div/div/input"));
   retype_password.sendKeys("roshni26");
   
   WebElement first_name = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[4]/div/div/input"));
   first_name.sendKeys("roshni");
   
   WebElement last_name = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[5]/div/div/input"));
   last_name.sendKeys("parmar");
   String lname1 = last_name.getText();
   
   WebElement phone_number = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[6]/div/div/input"));
   phone_number.sendKeys("5145693690");
   String ph1 = phone_number.getText();
  
   WebElement address = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[7]/div/div/textarea[1]"));
   address.sendKeys(" Avenue Victoria");
   String ads1 = address.getText();
  
   WebElement city = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[8]/div/div/input"));
   city.sendKeys("Montreal");
   String city1 = city.getText();
   
//  Select province = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[9]/div/div")));
//  province.selectByVisibleText("Québec");
   
   WebElement country = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[10]/div/div/input"));
   country.sendKeys("Canada");
  String country1 = country.getText();
   
  WebElement school = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[2]/div/div[1]/div/div/input"));
  school.sendKeys("Cegep");
  String school1 = school.getText();
  
   WebElement program = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[2]/div/div[2]/div/div/input"));
   program.sendKeys("CST");
   String program1 = program.getText();
   
   WebElement educationl = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[2]/div/div[3]/div/div/input"));
   educationl.sendKeys("pg diploma");
  String education1 = educationl.getText();

//   //	   WebElement radio = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[2]/div/div[4]/div/label[2]/span[1]/input"));
////   radio.click();

   WebElement employer = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[3]/div/div[1]/div/div/input"));
   employer.sendKeys("employer");
 String employer1 = employer.getText();
  
  
   WebElement jobtitle = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[3]/div/div[2]/div/div/input"));
 jobtitle.sendKeys("part time");
//   String jobtitle1 = jobtitle.getText();
//   WebElement jobduty = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[3]/div/div[3]/div/div/textarea[1]"));
//  jobduty.sendKeys("packer");
  // String jobduty1 = jobduty.getText();

   WebElement workedyear = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[3]/div/div[4]/div/div/input"));
   workedyear.sendKeys("2021");
   String workedyear1 = workedyear.getText();
   
   boolean attachment = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[4]/div/div/div/div/input")).isDisplayed();
   Assert.assertTrue(attachment);
   driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[4]/div/div/div/div/input")).sendKeys("C:\\Users\\Roshne Parmar\\Downloads\\jw6.jpg");
   Thread.sleep(2000);
  WebElement apply= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/button[2]"));
    Thread.sleep(2000);
//    Alert a = driver.switchTo().alert();
//	Thread.sleep(2000);
//	a.accept();
	
	
   
   driver.quit();
   

   
	  
	
	  
	  Assert.assertTrue(lname1.isEmpty());
	  Assert.assertTrue(ph1.isEmpty());
	  Assert.assertTrue(city1.isEmpty());
      Assert.assertTrue(country1.isEmpty());
	  Assert.assertTrue(school1.isEmpty());
	  Assert.assertTrue(program1.isEmpty());
	  Assert.assertTrue(education1.isEmpty());
	  Assert.assertTrue(employer1.isEmpty());
	  Assert.assertTrue(workedyear1.isEmpty());

	
}
@Test
//Password mismatch
public void test3() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshne Parmar\\Documents\\drivers/chromedriver.exe" );
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://localhost:3000/");
	WebElement e_id = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[1]/div/div/input"));
	e_id.sendKeys("roshni@gmail.com");
   
   Thread.sleep(2000);
   WebElement password=  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[2]/div/div/input"));
   password.sendKeys("roshni26");
   
   WebElement retype_password = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[3]/div/div/input"));
   retype_password.sendKeys("roshni27");
   WebElement first_name = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[4]/div/div/input"));
   first_name.sendKeys("roshni");
   
   driver.quit();
  

}

@Test
//for url
	public void test4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Roshne Parmar\\\\Documents\\\\drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/");
	    driver.manage().window().maximize();
	   
		   String actual_Url="http://localhost:3000/";
		   String expected_Url= driver.getCurrentUrl();
		   System.out.println(expected_Url);
		   Assert.assertEquals(expected_Url,actual_Url);
		   driver.quit();
	}

@Test
//specific email id mendatory
public void test5() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshne Parmar\\Documents\\drivers/chromedriver.exe" );
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://localhost:3000/");
	WebElement e_id = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[1]/div/div/input"));
	e_id.sendKeys("roshni");
	Thread.sleep(2000);
	WebElement password=  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[2]/div/div/input"));
	 password.click();  
}



}


