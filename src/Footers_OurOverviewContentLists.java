import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footers_OurOverviewContentLists {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://www.runforall.com/");
		driver.get("https://runforall.epiphanydev4.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//MORE THAN A 10K
      	driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[1]/ul/li[1]/a")).click(); //Yorkshire Marathon
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[1]/ul/li[2]/a")).click(); //Yorkshire 10 Mile
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[1]/ul/li[3]/a")).click(); //Sheffield Half Marathon
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[1]/ul/li[4]/a")).click(); //Leeds Half Marathon
		
		//ASDA FOUNDATION 10KS
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[2]/ul/li[1]/a")).click(); //City of Lincoln 10K
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[2]/ul/li[2]/a")).click(); //King's Lynn - Gear 10K
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[2]/ul/li[3]/a")).click(); //Nottingham 10K
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[2]/ul/li[4]/a")).click(); //Hull 10K
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[2]/ul/li[5]/a")).click(); //Leeds 10K
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[2]/ul/li[6]/a")).click(); //Burnley 10K
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[2]/ul/li[7]/a")).click(); //York 10K
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[2]/ul/li[8]/a")).click(); //Leicester 10K
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[2]/ul/li[9]/a")).click(); //Bury 10K
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[2]/ul/li[10]/a")).click(); //Sheffield 10K
		
		//FUN RUNS		
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[3]/ul/li[1]/a")).click(); //Lincoln Mini & Junior
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[3]/ul/li[2]/a")).click(); //Sheffield Mini & Junior
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[2]/ul/li[3]/a")).click(); //Mini Gear
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[2]/ul/li[4]/a")).click(); //Leeds Mini & Junior
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[2]/ul/li[5]/a")).click(); //York Mini & Junior
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[2]/ul/li[6]/a")).click(); //Bury Family Fun Run
		
		//CORPORATE CHALLENGE			
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[4]/ul/li[1]/a")).click(); //GEAR 10K - King's Lynn
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[4]/ul/li[2]/a")).click(); //HULL 10K
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[4]/ul/li[3]/a")).click(); //Leeds Lynn
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[4]/ul/li[4]/a")).click(); //Sheffield 10K
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[4]/ul/li[5]/a")).click(); //Marathon Relay

		
		//OTHER
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[5]/ul/li[1]/a")).click(); //About Us
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[5]/ul/li[2]/a")).click(); //News & Blog
		
		//driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[5]/ul/li[3]/a")).click(); //Fundraising		
		//driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[5]/ul/li[4]/a")).click(); //Volunteer	
		
	
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[5]/ul/li[3]/a")).click(); //Marketing		
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[5]/ul/li[4]/a")).click(); //Press Enquiries
		
		
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[5]/ul/li[5]/a")).click(); //Terms and Conditions	
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[5]/ul/li[6]/a")).click(); //Contact
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[5]/ul/li[7]/a")).click(); //FAQ		
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[5]/ul/li[8]/a")).click(); //Privacy
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[1]/div/div[1]/a/img")).click(); //Top_Logo 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[1]/div/ul/li/a/img")).click(); //Foot_Logo
		
		
		
		
//		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[5]/ul/li[9]/a")).click(); //FAQ
//		driver.findElement(By.xpath("//*[@id=\"container\"]/footer/div/div[2]/div[5]/ul/li[10]/a")).click();//Privacy
		
		driver.close();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("Logos checked, successs!!");
		System.out.println("All Footers Checked, successs!!");
		
	
		
	}

}
