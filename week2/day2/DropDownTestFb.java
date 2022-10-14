package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.network.Network;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTestFb {

	public static void main(String[] args) throws InterruptedException {
	 
		WebDriverManager.chromedriver().setup();
		
		// Open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		 //driver.getDevTools().createSessionIfThereIsNotOne();
		 //driver.getDevTools().send(Network.clearBrowserCookies());
		
		// Load the URL to test
		driver.get("https://en-gb.facebook.com/");
		
		//maxmize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement elementCreateAcc = driver.findElement(By.linkText("Create New Account"));
		elementCreateAcc.click();
		
		WebElement elementFirstName = driver.findElement(By.name("firstname"));
		elementFirstName.sendKeys("Pradeep");
		
		
		WebElement elementLastName = driver.findElement(By.name("lastname"));
		elementLastName.sendKeys("Kumar");
		
		WebElement elementMobile = driver.findElement(By.name("reg_email__"));
		elementMobile.sendKeys("987654310");
		
		WebElement elementPwd = driver.findElement(By.id("password_step_input"));
		elementPwd.sendKeys("Password@1234");
		
		WebElement elementDay = driver.findElement(By.id("day"));
		Select dd1 = new Select(elementDay);
		dd1.selectByVisibleText("2");
		
		WebElement elementMonth = driver.findElement(By.id("month"));
		Select dd2 = new Select(elementMonth);
		dd2.selectByValue("9");
		
		WebElement elementYear = driver.findElement(By.id("year"));
		Select dd3 = new Select(elementYear);
		dd3.selectByIndex(0);
		
		WebElement elementSex = driver.findElement(By.xpath("//input[@value='2']"));
		elementSex.click();
		

		Thread.sleep(5000);
		
		driver.close();
	}

}
