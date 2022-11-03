package railTicketBooking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Railsearch {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath(" //*[@class=\"chNavIcon appendBottom2 chSprite chTrains\"]")).click();	
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[1]/label/span")).click();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement frm=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div/div/input"));
		//frm.click();
		frm.sendKeys("Hyderabad");
		Thread.sleep(5000);
		frm.sendKeys(Keys.ARROW_DOWN);
		frm.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[2]/label/span")).click();
		WebElement to=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/input"));
		//to.click();
		to.sendKeys("Delhi");
		Thread.sleep(3000);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);  
		driver.findElement(By.id("travelDate")).click();
		
		//driver.close(); 
		
	}

}
