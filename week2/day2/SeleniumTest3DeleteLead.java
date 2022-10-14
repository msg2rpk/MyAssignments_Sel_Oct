package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest3DeleteLead {

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
		
		String phoneNum = "098765431";
		
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
		
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("TATA");

		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Pradeep1");

		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Kumar1");

		WebElement elementDept = driver.findElement(By.id("createLeadForm_departmentName"));
		elementDept.sendKeys("QEA");
		
		
		WebElement elementPhNum = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		elementPhNum.sendKeys(phoneNum);
		
		WebElement elementEmail= driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmail.sendKeys("msg2rpk@gmail.com");
		
		
		WebElement elementCreateLeadBtn = driver.findElement(By.className("smallSubmit"));
		elementCreateLeadBtn.click();
		
		  WebElement elementFindLeads = driver.findElement(By.linkText("Find Leads"));
		  elementFindLeads.click();
		  
		  WebElement elementFindByPhone = driver.findElement(By.xpath("//span[text()='Phone']"));
		  elementFindByPhone.click();
		  
		  
		  
		  WebElement elementPhoneNumber = driver.findElement(By.name("phoneNumber"));
		  elementPhoneNumber.sendKeys(phoneNum);
		  
		  WebElement elementFindElementFirst = driver.findElement(By.xpath("//td//a[@class='linktext']"));
		  elementFindElementFirst.click();
		  
		  String ViewLeadPageTitle = driver.getTitle();
		  System.out.println("The current page title is "+ViewLeadPageTitle);
		  
		  Thread.sleep(3000);
		  
		  WebElement elementDelLead = driver.findElement(By.linkText("Delete"));
		  elementDelLead.click();
		  
		  Thread.sleep(3000);
		  
		  elementFindLeads.click();
		  
		  elementFindByPhone.click();
		  
		  elementPhoneNumber.sendKeys(phoneNum);
		  
		  elementFindLeads.click();
		  
		  WebElement elementFindLeadsPageInfo = driver.findElement(By.className("x-paging-info"));
		  
		  if(elementFindLeadsPageInfo.getText().contains("No records to display")) {
			  System.out.println(elementFindLeadsPageInfo.getText());
		  }
		  
		  else
		  {
			  System.out.println("Issues with Deleted Lead");
		  }
		  
		 
		
		/*
		 * WebElement elementEditViewLead = driver.findElement(By.linkText("Edit"));
		 * elementEditViewLead.click();
		 * 
		 * WebElement elementCompName=
		 * driver.findElement(By.id("updateLeadForm_companyName"));
		 * elementCompName.clear(); elementCompName.sendKeys("NewCompany");
		 * 
		 * WebElement elementEditLeadUpdateBtn =
		 * driver.findElement(By.className("smallSubmit"));
		 * elementEditLeadUpdateBtn.click();
		 * 
		 * 
		 * WebElement viewLeadCompanyName =
		 * driver.findElement(By.id("viewLead_companyName_sp"));
		 * System.out.println("The modified company name is appropriate"
		 * +viewLeadCompanyName.getText());
		 * 
		 */
		/*
		 * Thread.sleep(5000); driver.close();
		 */
		
	}

}
