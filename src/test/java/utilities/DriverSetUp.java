package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetUp {
	
	public DriverSetUp driverSetUp;
	public WebDriver driver;
	public String browser,url;
	
	
	public WebDriver WebDriverManager() throws IOException {
		
		List<String> propValue=getProperties();
		browser=propValue.get(1);
		url=propValue.get(0);
		
		if(driver==null) {
						
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get(url);
			
		}
		return driver;
		
	}
	
	public List<String> getProperties() throws IOException {
		
		List<String> propValue = new ArrayList<String>();
		String path = "src/test/resources/properties/dsAlgo.properties";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		propValue.add(prop.getProperty("url"));
		propValue.add(prop.getProperty("browser"));
		return propValue;
				
	}
	
	public void setProperties(String pageName) throws IOException {
		
		String path = "src/test/resources/properties/dsAlgo.properties";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String newUrl=prop.get("url")+"/"+pageName;
		prop.replace("url", prop.get("url"), newUrl);
				
	}

}