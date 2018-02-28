import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YorkshireMarathon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.runforall.com/");
		driver.get("https://runforall.epiphanydev4.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		driver.navigate().to("http://runforall.com/events/marathon/yorkshire-marathon/"); // YORKSHIRE
																											// MARATHON_HomePage

		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[1]/a")).click(); // OVERVIEW
	                               
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[2]/a")).click(); // RACE
																													// INFORMATION

		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[2]/ul[1]/li[1]/a")).click(); // RACE
																											// INFORMATION_Entry(New"   
																											// Page)

		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[3]/a")).click(); // ROUTE
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[4]/a")).click(); // GETTING
																													// THERE
//		
//		//GETTING THERE > LOCAL BUS SERVICES
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[2]/div[4]/div/p[15]/a[1]")).click(); // First Bus
//		                             //*[@id="container"]/div[2]/section/div[2]/p[15]/a[1]
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[2]/div[4]/div/p[15]/a[2]")).click(); //TransDev 
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[2]/div[4]/div/p[16]/a")).click(); //Map
//		
//		//TRAVELLING BY CAR
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[2]/div[4]/div/p[19]/strong/a")).click(); //TRAVELLING BY CAR
//	//	driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[2]/div[4]/div/p[15]/a[1]")).click(); // SPECTATOR
//		
		                          
	
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[5]/a")).click(); // SPECTATOR
																													// INFORMATION
		
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[6]/a")).click(); // CHARIIES
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[2]/p[15]/a[1]")).click(); // SPONSORS
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[8]/a")).click(); // ELITES
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[9]/a")).click(); // PRIZES
		
		
		// PRIZES(Elites page. Open on a new Page)
		/*driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[2]/div[4]/div/p[15]/a[1]")).click(); // First Bus
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[2]/div[4]/div/p[15]/a[2]")).click(); //TransDev 
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[2]/div[4]/div/p[16]/a")).click(); //Map
		//TRAVELLING BY CAR
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[2]/div[4]/div/p[19]/strong/a")).click(); //TRAVELLING BY CAR
*/		
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div[1]/div/ul/li[10]/a")).click(); // RESULTS
																													// AND
																													// PHOTOGRAPHS

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");
		System.out.println("END OF YORKSHIRE MARATHON_HomePage...SUCCESS!!");

		// YORKSHIRE 10 MILE
		driver.navigate().to("http://runforall.com/events/10-mile/yorkshire-10-mile/");

		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[1]/a")).click(); // OVERVIEW
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[2]/a")).click(); // RACE
																													// INFORMATION
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[3]/a")).click(); // ROUTE
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[4]/a")).click(); // GETTING
																													// THERE

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");
		System.out.println("YORKSHIRE 10 MILE...SUCCESS!!");

		// SHEFFIELD HALF MARATHON
		driver.navigate().to("http://runforall.com/events/half-marathon/sheffield-half-marathon/"); // SHEFFIELD
																													// HALF
																													// MARATHON
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[1]/a")).click(); // OVERVIEW
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[2]/a")).click(); // RACE
																													// INFORMATION
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[3]/a")).click(); // ROUTE
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[4]/a")).click(); // GETTING
																													// THERE
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[5]/a")).click(); //SPONSORS
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[6]/a")).click(); // CHARITIES
		
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");
		System.out.println("SHEFFIELD HALF MARATHON...SUCCESS!!");

		// LEEDS HALF MARATHON
		driver.navigate().to("http://runforall.com/events/half-marathon/leeds-half-marathon/"); // SHEFFIELD
																												// HALF
																												// MARATHON
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[1]/a")).click(); // OVERVIEW
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[2]/a")).click(); // RACE
																													// INFORMATION
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[3]/a")).click(); // ROUTE
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[4]/a")).click(); // GETTING
																													// THERE
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[6]/a")).click(); // CHARITIES
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[1]/div/div/ul/li[5]/a")).click(); // SPONSORS

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");
		System.out.println("CITY OF LINCOLN 10K...SUCCESS!!");

		// FACILITIES
		driver.navigate()
				.to("http://runforall.com/events/marathon/yorkshire-marathon/race-information/"); // YORKSHIRE
																													// MARATHON
																													// >
																													// RACE
																													// INFORMATION
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[2]/p[8]/a")).click(); // USE OF HEADPHONES
	
		
		//(Open New Page)
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/section/div[2]/ul[3]/li[5]/a")).click(); // FACILITIES
																											// > Click
																											// here USE
																											// OF
																											// HEADPHONES
		
		//JANE TOMLINSON APPEAL (Open on a New Page)
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[1]/div/a/span/span")).click(); //Support for JANE TOMLINSON 
		
		
	
		

		driver.close();
		driver.quit();

	}

}
