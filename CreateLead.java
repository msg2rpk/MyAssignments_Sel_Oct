package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// Setup driver before starting the browser
		WebDriverManager.chromedriver().setup();
		
		// Open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL to test
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maxmize the browser
		driver.manage().window().maximize();
		
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
		
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		
		//close the browser
		//driver.close();
		
		
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("TATA");
		
		WebElement elementFirstName= driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Pradeep1");
		
		WebElement elementLastName= driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Kumar1");
		
		
		WebElement elementDept= driver.findElement(By.id("createLeadForm_departmentName"));
		elementDept.sendKeys("QEA");
		
		WebElement elementDesc= driver.findElement(By.name("description"));
		elementDesc.sendKeys("Private");
		
		WebElement elementEmail= driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmail.sendKeys("msg2rpk@gmail.com");
		
		
		WebElement elementCreateLeadBtn = driver.findElement(By.className("smallSubmit"));
		elementCreateLeadBtn.click();
		
		System.out.println("The title of the page is "+driver.getTitle());
		
		
		//driver.close();

	}

}