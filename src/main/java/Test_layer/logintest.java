package Test_layer;

import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Base_layer.mainpage;

public class logintest extends mainpage {
	
	@Test(dataProvider = "Credentials1")
	public void loginTest(String Emailaddress,String password) 
	{
	try 
	{
	driver.findElement(By.id("email")).sendKeys(Emailaddress);
	driver.findElement(By.id("passwd")).sendKeys(password);
	driver.findElement(By.id("SubmitLogin")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[4]/div/div[2]/h5/a")).click();
	driver.findElement(By.name("Submit")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
	driver.findElement(By.name("processAddress")).click();
	driver.findElement(By.id("cgv")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.name("processCarrier")).click();
	driver.findElement(By.className("bankwire")).click();
	driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
	Thread.sleep(4000);
	}
	catch(Exception e)
	{
	System.out.println(e);	
	}
	}
}