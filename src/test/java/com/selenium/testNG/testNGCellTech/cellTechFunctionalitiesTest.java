package com.selenium.testNG.testNGCellTech;

//import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.openqa.selenium.edge.EdgeOptions;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class cellTechFunctionalitiesTest extends baseTest {

		// TODO Auto-generated method stub    
	    @Test(priority=1)
	    public void hometab() {
	    	WebElement homeTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@class='nav-item'])[1]")));
	    	homeTab.click();
	    	
	    	try {
				WebElement header = driver.findElement(By.xpath("//h1//span"));
				String actualheader = header.getText().trim();
				
				String expectedHeader = "The IT Solutions Experts for Education";
				Assert.assertEquals(actualheader, expectedHeader, "❌ header text does not match!");
				System.out.println("✔️ Element found and visible: " + header.getText());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("❌ Element not found or not visible. Error: " + e.getMessage());
			}
	    }
	    
//	    @Test
//	    public void OurStory() {
//	    	try {
////				WebElement OurStoryContent = driver.findElement(By.xpath("(//div[@class=\"media-content\"])[1]"));
////				String storyText = OurStoryContent.getText().trim();
////				System.out.println(storyText);
////				
////				String expectedText = variables.ourStory;
////				Assert.assertEquals(storyText.trim(), expectedText.trim(), "❌ Story text does not match!");
////				System.out.println("✔️ Story text found and visible: " + OurStoryContent.getText());
//				
//				String OurStoryHead = driver.findElement(By.xpath("(//h1[contains(@class, \"mbr-section-title\")])[2]")).getText().trim();
//				String OurStoryContent = driver.findElement(By.xpath("(//div//p[contains(@class, 'mbr-text')])[2]")).getText().trim();
//				System.out.println(OurStoryContent);
//				String aboutUs = driver.findElement(By.xpath("(//a[@href='about.html'])[2]")).getText().trim();
//				
//				String expectedStoryHead = variables.ostoryhead;
//				String expectedStoryContent = variables.ostoryContent;
//				String expectedaboutUs = variables.aboutus;
//				
//				Assert.assertEquals(OurStoryHead, expectedStoryHead, "❌ Story head does not match!");
//				Assert.assertEquals(OurStoryContent, expectedStoryContent, "❌ Story content does not match!");
//				Assert.assertEquals(aboutUs, expectedaboutUs, "❌ About us does not match!");
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("❌ Story text not found and not visible: " + e.getMessage());
//			}
//	    }
	    
	    @Test(priority=2)
	    public void contactUS() {
	    	try {
				WebElement customerSupport = driver.findElement(By.xpath("(//a[@href='contactus.php'])[1]"));
				customerSupport.click();
				
				WebElement inquiryDD = driver.findElement(By.name("type"));
				Select select = new Select(inquiryDD);
				select.selectByVisibleText("Repair");
				
				WebElement custName = driver.findElement(By.name("name"));
				custName.sendKeys("Robinhood");
				WebElement custEmail = driver.findElement(By.id("email"));
				custEmail.sendKeys("robinhood@gmail.com");
				WebElement custPhone = driver.findElement(By.id("phone"));
				custPhone.sendKeys("0123456789");
				WebElement serialNum = driver.findElement(By.id("serial"));
				serialNum.sendKeys("1");
				WebElement locationDD = driver.findElement(By.id("location"));
				Select loc = new Select(locationDD);
				loc.selectByVisibleText("Hampton – 23608");
				WebElement issueDescript = driver.findElement(By.id("message"));
				issueDescript.sendKeys(variables.issueDescription);
				WebElement additionalCom = driver.findElement(By.id("addcomm"));
				additionalCom.sendKeys(variables.addComment);
				
				WebElement robotVerification = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']"));
				if(!robotVerification.isSelected()) {
					robotVerification.click();
				}
				
				System.out.println("Everything is working fine...!");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Element not found...!");
			}
	    }



}
