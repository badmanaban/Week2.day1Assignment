package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver obj = new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("http://leaftaps.com/opentaps");
		WebElement username = obj.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		obj.findElement(By.id("password")).sendKeys("crmsfa");
		obj.findElement(By.className("decorativeSubmit")).click();
		obj.findElement(By.linkText("CRM/SFA")).click();
		obj.findElement(By.linkText("Leads")).click();
		obj.findElement(By.linkText("Create Lead")).click();
		obj.findElement(By.id("createLeadForm_companyName")).sendKeys("DotGo");
		obj.findElement(By.id("createLeadForm_firstName")).sendKeys("JD");
		obj.findElement(By.id("createLeadForm_lastName")).sendKeys("Bathu");
		WebElement firstname = obj.findElement(By.id("createLeadForm_firstNameLocal"));
		firstname.sendKeys("Bathu");
		obj.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Test");
		obj.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		obj.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10LPA");
		obj.findElement(By.id("createLeadForm_sicCode")).sendKeys("Test123");
		obj.findElement(By.id("createLeadForm_description")).sendKeys("Test Description");
		obj.findElement(By.id("createLeadForm_importantNote")).sendKeys("Test Note");
		obj.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("BathuJd");
		obj.findElement(By.id("createLeadForm_departmentName")).sendKeys("Engineering");
		obj.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		obj.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Tester$$");
		obj.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/05/1992");
		obj.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Car and Driver");
		obj.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		obj.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("911");
		obj.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("9111");
		obj.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jdbathu@pec.edu");
		obj.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9751093613");
		obj.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("tester");
		obj.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.google.com/");
		obj.findElement(By.id("createLeadForm_generalToName")).sendKeys("Mr.Jayakumar");
		obj.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("kumar");
		obj.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No:05,Guru Nagar");
		obj.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Perumal kovil street");
		obj.findElement(By.id("createLeadForm_generalCity")).sendKeys("Madukarai");
		obj.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("605105");
		obj.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("111");
		obj.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Alabama");
				obj.findElement(By.className("smallSubmit")).click();
				String text = obj.findElement(By.id("viewLead_firstNameLocal_sp")).getText();
				System.out.println("The first name is " + text);
		System.out.println("The title is " + obj.getTitle());
		if (obj.getTitle().contains("View Lead")) {
			System.out.println("The title contails View Lead");

		} else {
			System.out.println("The title does not contain View Lead ");
		}

	}

}
