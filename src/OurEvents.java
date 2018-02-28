

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OurEvents {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.runforall.com/");
		driver.get("https://runforall.epiphanydev4.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[2]/div/ul/li[1]/div/span")).click();
		Thread.sleep(3000);
		//*[@id="container"]/header/div[2]/div/ul/li[1]/ul/li[2]/div/ul/li/a
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[2]/div/ul/li[1]/ul/li[1]/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[2]/div/ul/li[1]/ul/li[1]/div/ul/li/a")).click();
		driver.navigate().back();	
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[2]/div/ul/li[1]/div/span")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[2]/div/ul/li[1]/ul/li[2]/a/span")).click();
		

		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[2]/div/ul/li[1]/ul/li[3]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[2]/div/ul/li[1]/ul/li[4]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[2]/div/ul/li[1]/ul/li[5]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[2]/div/ul/li[1]/ul/li[6]/a/span")).click();
		

		

		
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[2]/div/ul/li[1]/ul/li[1]/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[2]/div/ul/li[1]/ul/li[1]/div/ul/li/a")).click();
		
		
		
		driver.findElement(By.xpath("//*[text()='Overview']")).click();	
		
		driver.findElement(By.xpath("//*[text()='Race Information']")).click();
		
		driver.findElement(By.xpath("//*[text()='Route']")).click();
		
		driver.findElement(By.xpath("//*[text()='Getting There']")).click();
		driver.findElement(By.xpath("//*[text()='Spectator Information']")).click();
		//driver.findElement(By.xpath("//*[text()='Partners Charities']")).click();	
		driver.findElement(By.xpath("//*[text()='Charities']")).click();		
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[6]/a")).click(); //PARTNER CHARITIES
		
		driver.findElement(By.xpath("//*[text()='Sponsors']")).click();
		driver.findElement(By.xpath("//*[text()='Elites']")).click();
		driver.findElement(By.xpath("//*[text()='Prizes']")).click();
		driver.findElement(By.xpath("//*[text()='Results and Photographs']")).click();
		String resultPage = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[2]/h1")).getText();
		System.out.println("What is on this Page? " + resultPage + " = Correct!!");

		driver.close();
		
		

	}

}
