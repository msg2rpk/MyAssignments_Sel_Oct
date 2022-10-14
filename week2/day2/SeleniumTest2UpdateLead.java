package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest2UpdateLead {

	public static void main(String[] args) throws InterruptedException {
		
		// Setup driver before starting the browser
		WebDriverManager.chromedriver().setup();
		
		// Open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL to test
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maxmize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Find an element
		WebElement elementUsername = driver.findElement(By.id("username"));
		//Action on WebElement
		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementpassword = driver.findElement(By.id("password"));
		elementpassword.sendKeys("crmsfa");
		
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		
		WebElement elementFindLeads = driver.findElement(By.linkText("Find Leads"));
		elementFindLeads.click();
		
		WebElement elementFirstLead = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/a"));
		elementFirstLead.click();
		
		//close the browser
		//driver.close();
		
		String ViewLeadPageTitle = driver.getTitle();
		System.out.println("The current page title is "+ViewLeadPageTitle);
		
		
		WebElement elementEditViewLead = driver.findElement(By.linkText("Edit"));
		elementEditViewLead.click();
		
		WebElement elementCompName= driver.findElement(By.id("updateLeadForm_companyName"));
		elementCompName.clear();
		elementCompName.sendKeys("NewCompany");
		
		WebElement elementEditLeadUpdateBtn = driver.findElement(By.className("smallSubmit"));
		elementEditLeadUpdateBtn.click();
		
		
		WebElement viewLeadCompanyName = driver.findElement(By.id("viewLead_companyName_sp"));
		System.out.println("The modified company name is appropriate" +viewLeadCompanyName.getText());
		
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
