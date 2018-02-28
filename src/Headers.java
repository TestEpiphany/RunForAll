import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Headers {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.runforall.com/");
		driver.get("https://runforall.epiphanydev4.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("a[href*='season-tickets']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href*='news-blog']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href*='fundraising']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href*='volunteer']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href*='results']")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[1]/div[1]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[1]/div[1]/div")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[2]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[2]/div[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[3]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[3]/div[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[4]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[4]/div[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[5]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[5]/div[1]/div")).click();		
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[6]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[6]/div[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[7]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[7]/div[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[8]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[8]/div[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[9]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[9]/div[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[10]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[10]/div[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[11]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[11]/div[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[12]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[12]/div[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[13]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[13]/div[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[14]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/ul/li[14]/div[1]/div")).click();

		
		driver.findElement(By.cssSelector("a[href*='contact']")).click();

		// Verifying contact page
		String contactPage = driver.findElement(By.xpath("//*[@id=\"container\"]/section/h1")).getText();
		System.out.println("Contact Form Page: " + contactPage);

		// Contact Form Page
		driver.findElement(By.id("FirstName")).sendKeys("Emmenuel");
		driver.findElement(By.id("Surname")).sendKeys("Dele");
		driver.findElement(By.name("Email")).sendKeys("emdeiauau@gmail.co.uk");
		driver.findElement(By.name("Query")).sendKeys(
				"A safe (also called a strongbox or coffer) is a secure lockable box used for securing valuable objects ");
		//driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/form/div[5]/input")).click();
		
		driver.navigate().refresh();
		
		driver.findElement(By.id("FirstName")).sendKeys("Xepepejjjj");
		driver.findElement(By.id("Surname")).sendKeys("jdjevejfvppwhwb");
		driver.findElement(By.name("Email")).sendKeys("etehssbsshjd@gmail.co.uk");		
        driver.findElement(By.name("Query")).sendKeys(
			"A safe is usually a hollow cuboid or cylinder, with one face being removable or hinged to form");  //*[text()='submit']
	    driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/form/div[5]/input")).click();
	    driver.navigate().back();
	    
//        driver.navigate().refresh();
//        Thread.sleep(3000);
		
		driver.findElement(By.id("FirstName")).sendKeys("Emmanuelll");
		driver.findElement(By.id("Surname")).sendKeys("Deleelelele");
		driver.findElement(By.name("Email")).sendKeys("testing@epiphany.co.uk");		
        driver.findElement(By.name("Query")).sendKeys(
			"Guess a PSD is design layout ? All ok with points made -comments are:\r\n" + 
			"1) So it will be responsive on a tablet but not design for it as such ?\r\n" + 
			"Fine line between a large mobile and tablet anyway now I guess ?");  //*[text()='submit']
	    driver.findElement(By.xpath("//*[@id=\"container\"]/section/div[3]/form/div[5]/input")).click();		
		
		
		String thankYou = driver.findElement(By.xpath("//*[@id=\"container\"]/section/h1")).getText();
		System.out.println("This page is to confirmed that " + thankYou + " is displayed after submittion");
		
		System.out.println("It is confirmed LOGO is displayed: " + driver.findElement(By.xpath("//*[@id=\"container\"]/section/h1")).isDisplayed());
		
	    driver.close();
		driver.quit();				
			
		
	}

}
