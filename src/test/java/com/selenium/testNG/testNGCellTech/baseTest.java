package com.selenium.testNG.testNGCellTech;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseTest {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hp premium laptop\\Desktop\\Certif\\Selenium\\NewSeleniumTests\\CellTechTests\\testNGCellTech\\driver\\msedgedriver.exe");
		//WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.celltech-usa.com/");
		System.out.println("✅ Edge Browser Title: " + driver.getTitle());
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//EdgeOptions options = new EdgeOptions();
		//options.addArguments("--headless");
		//driver = new EdgeDriver(options);
	}
	
//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
