import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewsPage_Navigations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.runforall.com/");
		driver.get("https://runforall.epiphanydev4.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.runforall.com/news-blog/");
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/ul[1]/li[1]/div[1]/a/span")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/ul[1]/li[1]/div[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/a[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/a[3]")).click();
		
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("End of News Navigations, successs!!");
		
	
		
		driver.close();
		
		
	}

}
