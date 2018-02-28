import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchField  {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.runforall.com/");
		//driver.get("https://runforall.epiphanydev4.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.id("term")).sendKeys("News");
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[1]/div/div[2]/form/input[2]")).click();
		
		//Verify Search Results Present on the Page
		String searchResults = driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[1]/h1/span")).getText();
		System.out.println(searchResults);
		
		
		//driver.close();
		
//		driver.get("https://www.epiphanysearch.co.uk/");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/ul/li[1]/a")).click();
//		driver.navigate().back();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/ul/li[2]/a")).click();
//		driver.navigate().back();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/ul/li[3]/a")).click();
//		driver.navigate().back();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/ul/li[4]/a")).click();
//		driver.navigate().back();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/ul/li[5]/a")).click();
//		driver.navigate().back();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/ul/li[6]/a")).click();
//		driver.navigate().back();
//		
//		driver.findElement(By.xpath("/html/body/div[1]/header/a/img")).click();  //Logo
//		
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/ul/li[1]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[3]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[4]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[5]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[6]/a")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[1]/a/img")).click();  //Logo
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("/html/body/div[1]/header/button/img")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[2]/div/button/svg/path[2]")).click(); 
		
		
		
//		driver.close();
		

	}
	
}
